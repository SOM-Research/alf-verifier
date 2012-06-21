package severification.alf.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.xtext.alf.alf.AccessCompletion;
import org.xtext.alf.alf.AdditiveExpression;
import org.xtext.alf.alf.AndExpression;
import org.xtext.alf.alf.ClassificationExpression;
import org.xtext.alf.alf.CollectOrIterateOperation;
import org.xtext.alf.alf.ConditionalAndExpression;
import org.xtext.alf.alf.ConditionalOrExpression;
import org.xtext.alf.alf.ConditionalTestExpression;
import org.xtext.alf.alf.EqualityExpression;
import org.xtext.alf.alf.ExclusiveOrExpression;
import org.xtext.alf.alf.Expression;
import org.xtext.alf.alf.ForAllOrExistsOrOneOperation;
import org.xtext.alf.alf.InclusiveOrExpression;
import org.xtext.alf.alf.InstanceCreationExpression;
import org.xtext.alf.alf.IsUniqueOperation;
import org.xtext.alf.alf.LinkOperationExpression;
import org.xtext.alf.alf.LinkOperationTuple;
import org.xtext.alf.alf.LinkOperationTupleElement;
import org.xtext.alf.alf.MultiplicativeExpression;
import org.xtext.alf.alf.NameExpression;
import org.xtext.alf.alf.NonLiteralValueSpecification;
import org.xtext.alf.alf.OperationCallExpression;
import org.xtext.alf.alf.OperationCallExpressionWithoutDot;
import org.xtext.alf.alf.ParenthesizedExpression;
import org.xtext.alf.alf.PartialSequenceConstructionCompletion;
import org.xtext.alf.alf.PrimaryExpression;
import org.xtext.alf.alf.PropertyCallExpression;
import org.xtext.alf.alf.RelationalExpression;
import org.xtext.alf.alf.SelectOrRejectOperation;
import org.xtext.alf.alf.SequenceConstructionCompletion;
import org.xtext.alf.alf.SequenceConstructionExpression;
import org.xtext.alf.alf.SequenceConstructionOrAccessCompletion;
import org.xtext.alf.alf.SequenceElement;
import org.xtext.alf.alf.SequenceExpansionExpression;
import org.xtext.alf.alf.SequenceOperationExpression;
import org.xtext.alf.alf.SequenceReductionExpression;
import org.xtext.alf.alf.ShiftExpression;
import org.xtext.alf.alf.SuffixExpression;
import org.xtext.alf.alf.SuperInvocationExpression;
import org.xtext.alf.alf.Tuple;
import org.xtext.alf.alf.TupleElement;
import org.xtext.alf.alf.UnaryExpression;
import org.xtext.alf.alf.ValueSpecification;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class ExpressionPathFinder {
	private ExpressionStringifier expressionStringifier = new ExpressionStringifier();
	private Expression expression;
	private String argument;
	
	public ExpressionPathFinder( Expression expression , String argument ){
		this.expressionStringifier = new ExpressionStringifier( );
		this.setExpression( expression );
		this.setArgument( argument );
	}
	
	public ExpressionPathFinder(){
		this.expressionStringifier = new ExpressionStringifier( );
	}
	
	public ExecutionPathsDirectedGraph process() {		
		return condTestExprToStr( (ConditionalTestExpression) this.expression );
	}
	
	private ExecutionPathsDirectedGraph condTestExprToStr( ConditionalTestExpression cte ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( cte.getWhenTrue() != null && cte.getWhenFalse() != null ){
			expg.concatFromRoot( condTestExprToStr( cte.getWhenTrue() ) );
			expg.concatFromRoot( condTestExprToStr( cte.getWhenFalse() ) );
		} else {
			expg.concatFromRoot( condOrExprToStr( cte.getExp() ) );
		}
		return expg;
	}
					
	private ExecutionPathsDirectedGraph condOrExprToStr( ConditionalOrExpression exp ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<ConditionalAndExpression> condAndExprs = exp.getExp();
		for ( int i = 0; i < condAndExprs.size(); i++ ){
			expg.concatFromLeafs( conditionalAndExprToStr( condAndExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph conditionalAndExprToStr( ConditionalAndExpression conditionalAndExpression ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<InclusiveOrExpression> incOrExprs = conditionalAndExpression.getExp();
		for ( int i = 0; i < incOrExprs.size(); i++){
			expg.concatFromLeafs( inclusiveOrExpToStr( incOrExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph inclusiveOrExpToStr( InclusiveOrExpression inclusiveOrExpression ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<ExclusiveOrExpression> excOrExprs = inclusiveOrExpression.getExp();
		for ( int i = 0; i < excOrExprs.size(); i++){
			expg.concatFromLeafs( exclusiveOrExpToStr( excOrExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph exclusiveOrExpToStr( ExclusiveOrExpression exclusiveOrExpression ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<AndExpression> andExprs = exclusiveOrExpression.getExp();
		for ( int i = 0; i < andExprs.size(); i++){
			expg.concatFromLeafs( andExpToStr( andExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph andExpToStr(AndExpression andExpression) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<EqualityExpression> eqExprs = andExpression.getExp();
		for ( int i = 0; i < eqExprs.size(); i++){
			expg.concatFromLeafs( eqExpToStr( eqExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph eqExpToStr(EqualityExpression equalityExpression) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<ClassificationExpression> classifExprs = equalityExpression.getExp();
		for ( int i = 0; i < classifExprs.size(); i++){
			expg.concatFromLeafs( classifExpToStr( classifExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph classifExpToStr(ClassificationExpression classificationExpression ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( relatExprToStr( classificationExpression.getExp() ) );
		NameExpression typeName = classificationExpression.getTypeName();
		if ( typeName != null ){
			expg.concatFromLeafs( nameExprToStr( typeName ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph relatExprToStr(RelationalExpression relatExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		ShiftExpression leftShiftExpr = relatExpr.getLeft();
		expg.concatFromRoot( shiftExprToStr( leftShiftExpr ) );
		ShiftExpression rightShiftExpr = relatExpr.getRight();
		if ( rightShiftExpr != null ){
			expg.concatFromLeafs( shiftExprToStr( rightShiftExpr ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph shiftExprToStr(ShiftExpression shiftExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<AdditiveExpression> additiveExprs = shiftExpr.getExp();
		for ( int i = 0; i < additiveExprs.size(); i++){
			expg.concatFromLeafs( additiveExpToStr( additiveExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph additiveExpToStr(AdditiveExpression additiveExpression) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<MultiplicativeExpression> multiplExprs = additiveExpression.getExp();
		for ( int i = 0; i < multiplExprs.size(); i++){
			expg.concatFromLeafs( multiplExpToStr( multiplExprs.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph multiplExpToStr(MultiplicativeExpression multiplicativeExpression) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<UnaryExpression> unaryExpr = multiplicativeExpression.getExp();
		for ( int i = 0; i < unaryExpr.size(); i++){
			expg.concatFromLeafs( unaryExpToStr( unaryExpr.get( i ) ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph unaryExpToStr(UnaryExpression unaryExpression) {
		return primaryExpToStr( unaryExpression.getExp() );
	}

	private ExecutionPathsDirectedGraph primaryExpToStr(PrimaryExpression exp) {
		return valueSpecToStr( exp.getPrefix() );
	}

	private ExecutionPathsDirectedGraph valueSpecToStr(ValueSpecification valueSpec) {
		if ( valueSpec instanceof InstanceCreationExpression ){
			return instanceCreationExprToStr( (InstanceCreationExpression) valueSpec );
		} else if ( valueSpec instanceof NameExpression ){
			return nameExprToStr( (NameExpression) valueSpec );
		} else if ( valueSpec instanceof ParenthesizedExpression ){
			return parenthesizedExprToStr( (ParenthesizedExpression) valueSpec );
		} else if ( valueSpec instanceof SuperInvocationExpression ){
			return superInvocationExprToStr( (SuperInvocationExpression) valueSpec );
		}
		return new ExecutionPathsDirectedGraph();
	}
	
	public ExecutionPathsDirectedGraph superInvocationExprToStr(SuperInvocationExpression expr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( expr.getClassName() != null && !expr.getClassName().isEmpty() ){
			expg.concatFromLeafs( opCallWithoutDotToStr( expr.getOperationCallWithoutDot() ) );
		} else {
			expg.concatFromLeafs( opCallExprToStr( expr.getOperationCall() ) );
		}
		return expg;
	}

	public ExecutionPathsDirectedGraph instanceCreationExprToStr(InstanceCreationExpression instanceCreation) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		String constructorArgs = new String();
		if ( instanceCreation.getTuple() != null ){
			expg.concatFromLeafs( tupleToStr( instanceCreation.getTuple() ) );
			constructorArgs = this.expressionStringifier.tupleToStr( instanceCreation.getTuple() );
		} else {
			expg.concatFromLeafs( seqConstrComplToStr( instanceCreation.getSequenceConstuctionCompletion() ) );
			constructorArgs = this.expressionStringifier.seqConstrComplToStr( instanceCreation.getSequenceConstuctionCompletion() );
		}
		
		// "createObject" node
		String instanceCreationStr = this.expressionStringifier.instanceCreationExprToStr( instanceCreation );
		Instruction createObject = new Instruction( InstructionType.CREATE_OBJECT , instanceCreationStr );
		String objName = this.argument == null || this.argument.isEmpty() ? null : this.argument;
		String objClass = this.expressionStringifier.qualNameBindToStr( instanceCreation.getConstructor() );
		createObject.addArgument( objName ); 
		createObject.addArgument( objClass );
		expg.addNodeFromLeafs( createObject );
		if ( !constructorArgs.equals( "()" ) ){
			StringTokenizer tokensConstructorArgs = 
				new StringTokenizer( constructorArgs.substring( 1 , constructorArgs.length() - 1 ) , "," );
			while ( tokensConstructorArgs.hasMoreTokens() ){
				Instruction addStructuralFeature = new Instruction( InstructionType.ADD_STRUCTURAL_FEATURE , instanceCreationStr );
				// left-side of equal
				addStructuralFeature.addArgument( objName ); 
				addStructuralFeature.addArgument( "nomAttr" ); // attribute name: TODO: check class diagram
				addStructuralFeature.addArgument( tokensConstructorArgs.nextToken() );
				addStructuralFeature.addArgument( objClass );
				expg.addNodeFromLeafs( addStructuralFeature ); // there will be only one leaf
			}
		} else if ( objName != null ){
			// Storing object class for posterior usage
			OperationScanner.instancesClass.remove( objName );
			OperationScanner.instancesClass.put( objName , objClass );
		}
		
		if ( instanceCreation.getSuffix() != null ){
			String beforeSuffix = this.expressionStringifier.instanceCreationExprToStr( instanceCreation );
			this.argument = beforeSuffix.substring( 0 , beforeSuffix.lastIndexOf( "." ) );
			expg.concatFromLeafs( suffixExprToStr( instanceCreation.getSuffix() ));
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph tupleToStr( Tuple tuple ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<TupleElement> tupleElems = tuple.getTupleElements();
		for ( int i = 0; i < tupleElems.size(); i++ ){
			expg.concatFromLeafs( new ExpressionPathFinder( tupleElems.get( i ).getArgument() , "" ).process() );
		}
		return expg;
	}
	
	public ExecutionPathsDirectedGraph nameExprToStr( NameExpression nameExpression ) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( !( nameExpression.getPrefixOp() != null && !nameExpression.getPrefixOp().isEmpty() ) ){
			if ( nameExpression.getInvocationCompletion() != null ){
				expg.concatFromLeafs( tupleToStr( nameExpression.getInvocationCompletion() ) );
				String currentOp = OperationScanner.getCurrentOperation();
				OperationScanner.setCurrentOperation( nameExpression.getId() );
				expg.concatFromLeafs( 
						new BlockProcessor( OperationScanner.getOperationBlock( nameExpression.getId() ) ).processStatement() );
				OperationScanner.setCurrentOperation( currentOp );
			} else if ( nameExpression.getSequenceConstructionCompletion() != null ){
				expg.concatFromLeafs( seqConstOrAccComplToStr( nameExpression.getSequenceConstructionCompletion() ) );
			}
		} 
		if ( this.argument == null || this.argument.isEmpty() ){
			this.setArgument( nameExpression.getId() );
		}
		if ( nameExpression.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( nameExpression.getSuffix() ));
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqConstOrAccComplToStr(SequenceConstructionOrAccessCompletion seq) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( seq.getAccessCompletion() != null ){
			expg.concatFromLeafs( accesCompletionToStr( seq.getAccessCompletion() ) );
		} else if ( seq.getSequenceCompletion() != null){
			expg.concatFromLeafs( partialSeqConstrComplToStr( seq.getSequenceCompletion() ) );
		} 
		if ( seq.getExpression() != null ){
			expg.concatFromLeafs( seqConstrExprToStr( seq.getExpression() ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph partialSeqConstrComplToStr(PartialSequenceConstructionCompletion sequenceCompletion) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( seqConstrExprToStr( sequenceCompletion.getExpression() ) );
		return expg;
	}

	private ExecutionPathsDirectedGraph accesCompletionToStr(AccessCompletion accessCompletion) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( new ExpressionPathFinder( accessCompletion.getAccessIndex() , null ).process() );
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqConstrExprToStr(SequenceConstructionExpression expression) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<SequenceElement> seqElems = expression.getSequenceElement();
		for ( int i = 0; i < seqElems.size(); i++ ){
			expg.concatFromLeafs( seqElemToStr( seqElems.get(i) ) );
		}
		if ( seqElems.size() == 1 ){
			expg.concatFromLeafs( new ExpressionPathFinder( expression.getRangeUpper() , null ).process() );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqElemToStr(SequenceElement sequenceElement) {
		if ( sequenceElement instanceof Expression ){
			return new ExpressionPathFinder( (Expression) sequenceElement , null ).process();
		} else {
			return seqConstrExprToStr( (SequenceConstructionExpression) sequenceElement );
		}
	}
	
	public ExecutionPathsDirectedGraph suffixExprToStr(SuffixExpression suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if (suffixExpr instanceof OperationCallExpression){
			expg.concatFromLeafs( opCallExprToStr( (OperationCallExpression) suffixExpr ) );
		} else if (suffixExpr instanceof PropertyCallExpression){
			expg.concatFromLeafs( propCallExprToStr( (PropertyCallExpression) suffixExpr ) );
		} else if (suffixExpr instanceof LinkOperationExpression){
			expg.concatFromLeafs( linkOpExprToStr( (LinkOperationExpression) suffixExpr ) );
		} else if (suffixExpr instanceof SequenceOperationExpression){
			expg.concatFromLeafs( seqOpExprToStr( (SequenceOperationExpression) suffixExpr ) );
		} else if (suffixExpr instanceof SequenceReductionExpression){
			expg.concatFromLeafs( seqRedExprToStr( (SequenceReductionExpression) suffixExpr ) );
		} else if (suffixExpr instanceof SequenceExpansionExpression){
			expg.concatFromLeafs( seqExpExprToStr( (SequenceExpansionExpression) suffixExpr ) );
		} 
		return expg;
	}

	private ExecutionPathsDirectedGraph propCallExprToStr(PropertyCallExpression suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( suffixExpr.getIndex() != null ){
			expg.concatFromLeafs( new ExpressionPathFinder( suffixExpr.getIndex() , "" ).process() );
		}
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph linkOpExprToStr(LinkOperationExpression suffixExpr) {
		ArrayList<Object> arguments = new ArrayList<Object>();
		if ( this.argument != null && !this.argument.isEmpty() ){
			arguments.add( this.getArgument() );
		}
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( suffixExpr.getTuple() != null ){
			expg.concatFromLeafs( linkOpTupleToStr( suffixExpr.getTuple() ) );
			Iterator<LinkOperationTupleElement> tupleElemIter = suffixExpr.getTuple().getLinkOperationTupleElement().iterator();
			while ( tupleElemIter.hasNext() ){
				LinkOperationTupleElement tupleElem = tupleElemIter.next();
				if ( tupleElem.getObjectOrRole() != null && !tupleElem.getObjectOrRole().isEmpty() && 
						!tupleElem.getObjectOrRole().equals(")") ){
					arguments.add( tupleElem.getObjectOrRole() );
				}
				if ( tupleElem.getObjectValueSpec() != null ){
					arguments.add( this.expressionStringifier.valueSpecToStr( tupleElem.getObjectValueSpec() ) );
				}
			}
		}
		String kind = suffixExpr.getKind().getLiteral();
		Instruction instruction = null;
		String linkOpExpStr = this.expressionStringifier.linkOpExprToStr(suffixExpr);
		if ( kind.equals( "createLink" ) ){
			instruction = new Instruction( InstructionType.CREATE_LINK , linkOpExpStr );
		} else if ( kind.equals( "destroyLink" ) ){
			instruction = new Instruction( InstructionType.DESTROY_LINK , linkOpExpStr );
		} else if ( kind.equals( "clearAssoc" ) ){
			instruction = new Instruction( InstructionType.CLEAR_ASSOCIATION , linkOpExpStr );
			if ( OperationScanner.instancesClass.containsKey( arguments.get(1) ) ){
				arguments.add( OperationScanner.instancesClass.get( arguments.get(1).toString() ) );
			}
		} else if ( kind.equals( "destroy" ) ){
			instruction = new Instruction( InstructionType.DESTROY_OBJECT , linkOpExpStr );
			// DestroyObject only will have ONE AND ONLY ONE argument
			if ( OperationScanner.instancesClass.containsKey( arguments.get(0) ) ){
				arguments.add( OperationScanner.instancesClass.get( arguments.get(0).toString() ) );
			}
		}
		instruction.addArguments( arguments );
		expg.addNodeFromLeafs( instruction );
		return expg;
	}
	
	private ExecutionPathsDirectedGraph linkOpTupleToStr(LinkOperationTuple linkOperationTuple) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		EList<LinkOperationTupleElement> linkOperationTuples = linkOperationTuple.getLinkOperationTupleElement();
		for ( int i = 0; i < linkOperationTuples.size(); i++ ){
			expg.concatFromLeafs( linkOperationTupleElemToStr( linkOperationTuples.get(i) ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph linkOperationTupleElemToStr(LinkOperationTupleElement linkOperationTupleElement) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( linkOperationTupleElement.getRoleIndex() != null ){
			expg.concatFromLeafs( new ExpressionPathFinder( linkOperationTupleElement.getRoleIndex() , null ).process() );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqOpExprToStr(SequenceOperationExpression suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( tupleToStr( suffixExpr.getTuple() ) );
		String currentOp = OperationScanner.getCurrentOperation();
		OperationScanner.setCurrentOperation( suffixExpr.getOperationName() );
		expg.concatFromLeafs( new BlockProcessor( OperationScanner.getOperationBlock( suffixExpr.getOperationName() ) ).processStatement() );
		OperationScanner.setCurrentOperation( currentOp );
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqRedExprToStr(SequenceReductionExpression suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqExpExprToStr(SequenceExpansionExpression suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if (suffixExpr instanceof SelectOrRejectOperation){
			expg.concatFromLeafs( selOrRejOpToStr( (SelectOrRejectOperation) suffixExpr ) );
		} else if (suffixExpr instanceof CollectOrIterateOperation){
			expg.concatFromLeafs( collOrIterOpToStr( (CollectOrIterateOperation) suffixExpr ) );
		} else if (suffixExpr instanceof ForAllOrExistsOrOneOperation){
			expg.concatFromLeafs( forAllOrExistOrOneOpToStr( (ForAllOrExistsOrOneOperation) suffixExpr ) );
		} else if (suffixExpr instanceof IsUniqueOperation){
			expg.concatFromLeafs( isUniqueOpToStr( (IsUniqueOperation) suffixExpr ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph selOrRejOpToStr(SelectOrRejectOperation suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
//		expg.concatFromLeafs( new ExpressionPathFinder( suffixExpr.getExpr() , "" ).process() );
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph collOrIterOpToStr(CollectOrIterateOperation suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
//		expg.concatFromLeafs( new ExpressionPathFinder( suffixExpr.getExpr() , null ).process() );
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph forAllOrExistOrOneOpToStr(ForAllOrExistsOrOneOperation suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
//		expg.concatFromLeafs( new ExpressionPathFinder( suffixExpr.getExpr() , null ).process() );
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph isUniqueOpToStr(IsUniqueOperation suffixExpr) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( new ExpressionPathFinder( suffixExpr.getExpr() , null ).process() );
		if ( suffixExpr.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( suffixExpr.getSuffix() ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph parenthesizedExprToStr(ParenthesizedExpression expression) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( new ExpressionPathFinder( expression.getExpOrTypeCast() , null ).process() );
		if ( expression.getCasted() != null ){
			expg.concatFromLeafs( nonLitValueSpecToStr( expression.getCasted() ) );
		} else if ( expression.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( expression.getSuffix() ) );
		}
		return expg;
	}
	
	private ExecutionPathsDirectedGraph nonLitValueSpecToStr(NonLiteralValueSpecification nlve) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		if ( nlve instanceof NameExpression ){
			expg.concatFromLeafs( nameExprToStr( (NameExpression) nlve ) );
		} else if ( nlve instanceof ParenthesizedExpression ){
			expg.concatFromLeafs( parenthesizedExprToStr( (ParenthesizedExpression) nlve ) );
		} else if ( nlve instanceof InstanceCreationExpression ){
			expg.concatFromLeafs( instanceCreationExprToStr( (InstanceCreationExpression) nlve ) );
		} 
		return expg;
	}
	
	private ExecutionPathsDirectedGraph seqConstrComplToStr(SequenceConstructionCompletion sequenceConstuctionCompletion) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromLeafs( seqConstrExprToStr( sequenceConstuctionCompletion.getExpression() ) );
		return expg;
	}

	private ExecutionPathsDirectedGraph opCallExprToStr(OperationCallExpression operationCall) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromRoot( tupleToStr( operationCall.getTuple() ) );
		String currentOp = OperationScanner.getCurrentOperation();
		OperationScanner.setCurrentOperation( operationCall.getOperationName() );
		expg.concatFromLeafs( 
				new BlockProcessor( OperationScanner.getOperationBlock( operationCall.getOperationName() ) ).processStatement() );
		OperationScanner.setCurrentOperation( currentOp );
		if ( operationCall.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( operationCall.getSuffix() ) );
		}
		return expg;
	}

	private ExecutionPathsDirectedGraph opCallWithoutDotToStr(OperationCallExpressionWithoutDot operationCall) {
		ExecutionPathsDirectedGraph expg = new ExecutionPathsDirectedGraph();
		expg.concatFromRoot( tupleToStr( operationCall.getTuple() ) );
		String currentOp = OperationScanner.getCurrentOperation();
		OperationScanner.setCurrentOperation( operationCall.getOperationName() );
		expg.concatFromLeafs( 
				new BlockProcessor( OperationScanner.getOperationBlock( operationCall.getOperationName() ) ).processStatement() );
		OperationScanner.setCurrentOperation( currentOp );
		if ( operationCall.getSuffix() != null ){
			expg.concatFromLeafs( suffixExprToStr( operationCall.getSuffix() ));
		}
		return expg;
	}

	
	public ExpressionStringifier getExpressionStringifier() {
		return expressionStringifier;
	}
	public void setExpressionStringifier(ExpressionStringifier expressionStringifier) {
		this.expressionStringifier = expressionStringifier;
	}
	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	public String getArgument() {
		return argument;
	}
	public void setArgument(String argument) {
		this.argument = argument;
	}
}