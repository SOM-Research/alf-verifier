package severification.alf.parser;

import org.eclipse.emf.common.util.EList;
import org.xtext.alf.alf.AccessCompletion;
import org.xtext.alf.alf.AdditiveExpression;
import org.xtext.alf.alf.AndExpression;
import org.xtext.alf.alf.BOOLEAN_LITERAL;
import org.xtext.alf.alf.ClassExtentExpression;
import org.xtext.alf.alf.ClassificationExpression;
import org.xtext.alf.alf.CollectOrIterateOperation;
import org.xtext.alf.alf.CollectOrIterateOperator;
import org.xtext.alf.alf.ConditionalAndExpression;
import org.xtext.alf.alf.ConditionalOrExpression;
import org.xtext.alf.alf.ConditionalTestExpression;
import org.xtext.alf.alf.EqualityExpression;
import org.xtext.alf.alf.ExclusiveOrExpression;
import org.xtext.alf.alf.Expression;
import org.xtext.alf.alf.ForAllOrExistsOrOneOperation;
import org.xtext.alf.alf.ForAllOrExistsOrOneOperator;
import org.xtext.alf.alf.INTEGER_LITERAL;
import org.xtext.alf.alf.InclusiveOrExpression;
import org.xtext.alf.alf.InstanceCreationExpression;
import org.xtext.alf.alf.IsUniqueOperation;
import org.xtext.alf.alf.LITERAL;
import org.xtext.alf.alf.LinkOperationExpression;
import org.xtext.alf.alf.LinkOperationKind;
import org.xtext.alf.alf.LinkOperationTuple;
import org.xtext.alf.alf.LinkOperationTupleElement;
import org.xtext.alf.alf.MultiplicativeExpression;
import org.xtext.alf.alf.NUMBER_LITERAL;
import org.xtext.alf.alf.NameExpression;
import org.xtext.alf.alf.NamedTemplateBinding;
import org.xtext.alf.alf.NonLiteralValueSpecification;
import org.xtext.alf.alf.NullExpression;
import org.xtext.alf.alf.OperationCallExpression;
import org.xtext.alf.alf.OperationCallExpressionWithoutDot;
import org.xtext.alf.alf.ParenthesizedExpression;
import org.xtext.alf.alf.PartialSequenceConstructionCompletion;
import org.xtext.alf.alf.PrimaryExpression;
import org.xtext.alf.alf.PropertyCallExpression;
import org.xtext.alf.alf.QualifiedNamePath;
import org.xtext.alf.alf.QualifiedNameWithBinding;
import org.xtext.alf.alf.RelationalExpression;
import org.xtext.alf.alf.STRING_LITERAL;
import org.xtext.alf.alf.SelectOrRejectOperation;
import org.xtext.alf.alf.SelectOrRejectOperator;
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
import org.xtext.alf.alf.TemplateBinding;
import org.xtext.alf.alf.ThisExpression;
import org.xtext.alf.alf.Tuple;
import org.xtext.alf.alf.TupleElement;
import org.xtext.alf.alf.UNLIMITED_LITERAL;
import org.xtext.alf.alf.UnaryExpression;
import org.xtext.alf.alf.UnqualifiedName;
import org.xtext.alf.alf.ValueSpecification;


public class ExpressionStringifier {
	private Expression expression;

	public ExpressionStringifier( Expression expression){
		this.setExpression(expression);
	}
	
	public ExpressionStringifier(){
	}
	
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}
	
	public String process() {
		return condTestExprToStr( (ConditionalTestExpression) this.expression );
	}
	
	public String exprToStr( Expression expression ){
		return condTestExprToStr( (ConditionalTestExpression) expression );
	}
	
	public  String condTestExprToStr(ConditionalTestExpression cte) {
		String res = new String();
		res = res.concat( condOrExprToStr( cte.getExp() ) );
		if ( cte.getWhenTrue() != null && cte.getWhenFalse() != null ){
			res = res.concat( " ? " + condTestExprToStr( cte.getWhenTrue() ) + " : " + condTestExprToStr( cte.getWhenFalse() ) );
		}
		return res;
	}
					
	public  String condOrExprToStr(ConditionalOrExpression exp) {
		String res = new String();
		EList<ConditionalAndExpression> condAndExprs = exp.getExp();
		for ( int iCondAnd = 0; iCondAnd < condAndExprs.size(); iCondAnd++ ){
			res = res.concat( conditionalAndExprToStr( condAndExprs.get( iCondAnd ) ) + " || " );
		}
		if ( !res.isEmpty() ){
			res = res.substring( 0 , res.length() - 4 );
		}
		return res;
	}

	public  String conditionalAndExprToStr(ConditionalAndExpression conditionalAndExpression) {
		String res = new String();
		EList<InclusiveOrExpression> incOrExprs = conditionalAndExpression.getExp();
		for ( int i = 0; i < incOrExprs.size(); i++){
			res = res.concat( inclusiveOrExpToStr( incOrExprs.get( i ) ) + " && " );
		}
		if ( !res.isEmpty() ){
			res = res.substring( 0 , res.length() - 4 );
		}
		return res;
	}

	public  String inclusiveOrExpToStr(InclusiveOrExpression inclusiveOrExpression) {
		String res = new String();
		EList<ExclusiveOrExpression> excOrExprs = inclusiveOrExpression.getExp();
		for ( int i = 0; i < excOrExprs.size(); i++){
			res = res.concat( exclusiveOrExpToStr( excOrExprs.get( i ) ) + " | " );
		}
		if ( !res.isEmpty() ){
			res = res.substring( 0 , res.length() - 3 );
		}
		return res;
	}

	public  String exclusiveOrExpToStr(ExclusiveOrExpression exclusiveOrExpression) {
		String res = new String();
		EList<AndExpression> andExprs = exclusiveOrExpression.getExp();
		for ( int i = 0; i < andExprs.size(); i++){
			res = res.concat( andExpToStr( andExprs.get( i ) ) + " ^ " );
		}
		if ( !res.isEmpty() ){
			res = res.substring( 0 , res.length() - 3 );
		}
		return res;
	}

	public  String andExpToStr(AndExpression andExpression) {
		String res = new String();
		EList<EqualityExpression> eqExprs = andExpression.getExp();
		for ( int i = 0; i < eqExprs.size(); i++){
			res = res.concat( eqExpToStr( eqExprs.get( i ) ) + " & " );
		}
		if ( !res.isEmpty() ){
			res = res.substring( 0 , res.length() - 3 );
		}
		return res;
	}

	public  String eqExpToStr(EqualityExpression equalityExpression) {
		String res = new String();
		EList<ClassificationExpression> classifExprs = equalityExpression.getExp();
		
		res = res.concat( classifExpToStr( classifExprs.get( 0 ) ) );
		for ( int i = 1; i < classifExprs.size(); i++){
			res = res.concat( " " + equalityExpression.getOp().get( i - 1 ) + " " + classifExpToStr( classifExprs.get( i ) ) );
		}
		return res;
	}

	public  String classifExpToStr(ClassificationExpression classificationExpression) {
		String res = new String();
		RelationalExpression relatExpr = classificationExpression.getExp();
		res = res.concat( relatExprToStr( relatExpr ) );
		String op = classificationExpression.getOp();
		NameExpression typeName = classificationExpression.getTypeName();
		if ( op != null && typeName != null ){
			res = res.concat( " " + op + " " + nameExprToStr( typeName ) );
		}
		return res;
	}

	public  String relatExprToStr(RelationalExpression relatExpr) {
		String res = new String();
		ShiftExpression leftShiftExpr = relatExpr.getLeft();
		res = res.concat( shiftExprToStr( leftShiftExpr ) );
		String op = relatExpr.getOp();
		ShiftExpression rightShiftExpr = relatExpr.getRight();
		if ( op != null && rightShiftExpr != null ){
			res = res.concat( " " + op + " " + shiftExprToStr( rightShiftExpr ) );
		}
		return res;
	}
	
	public  String shiftExprToStr(ShiftExpression shiftExpr) {
		String res = new String();
		EList<AdditiveExpression> additiveExprs = shiftExpr.getExp();
		
		res = res.concat( additiveExpToStr( additiveExprs.get( 0 ) ) );
		for ( int i = 1; i < additiveExprs.size(); i++){
			res = res.concat( " " + shiftExpr.getOp() + " " + additiveExpToStr( additiveExprs.get( i ) ) );
		}
		return res;
	}

	public  String additiveExpToStr(AdditiveExpression additiveExpression) {
		String res = new String();
		EList<MultiplicativeExpression> multiplExprs = additiveExpression.getExp();
		
		res = res.concat( multiplExpToStr( multiplExprs.get( 0 ) ) );
		for ( int i = 1; i < multiplExprs.size(); i++){
			res = res.concat( " " + additiveExpression.getOp().get( i - 1 ) + " " + multiplExpToStr( multiplExprs.get( i ) ) );
		}
		return res;
	}

	public  String multiplExpToStr(MultiplicativeExpression multiplicativeExpression) {
		String res = new String();
		EList<UnaryExpression> unaryExpr = multiplicativeExpression.getExp();
		
		res = res.concat( unaryExpToStr( unaryExpr.get( 0 ) ) );
		for ( int i = 1; i < unaryExpr.size(); i++){
			res = res.concat( " " + multiplicativeExpression.getOp().get( i - 1 ) + " " + unaryExpToStr( unaryExpr.get( i ) ) );
		}
		return res;
	}

	public  String unaryExpToStr(UnaryExpression unaryExpression) {
		String op = new String();
		if ( unaryExpression.getOp() != null ){
			op = unaryExpression.getOp();
		}
		return op.concat( primaryExpToStr( unaryExpression.getExp() ) );
	}

	public  String primaryExpToStr(PrimaryExpression exp) {
		return valueSpecToStr( exp.getPrefix() );
	}

	public  String valueSpecToStr(ValueSpecification valueSpec) {
		String res = new String();
		if ( valueSpec instanceof NameExpression ){
			res = nameExprToStr( (NameExpression) valueSpec );
		} else if ( valueSpec instanceof LITERAL ){
			res = literalToStr( (LITERAL) valueSpec );
		} else if ( valueSpec instanceof ThisExpression ){
			res = thisExprToStr( (ThisExpression) valueSpec );
		} else if ( valueSpec instanceof SuperInvocationExpression ){
			res = superInvocationExprToStr( (SuperInvocationExpression) valueSpec );
		} else if ( valueSpec instanceof InstanceCreationExpression ){
			res = instanceCreationExprToStr( (InstanceCreationExpression) valueSpec );
		} else if ( valueSpec instanceof ParenthesizedExpression ){
			res = parenthesizedExprToStr( (ParenthesizedExpression) valueSpec );
		} else if ( valueSpec instanceof NullExpression ){
			res = nullExprToStr( (NullExpression) valueSpec );
		} 
		return res;
	}

	public  String nameExprToStr(NameExpression nameExpression) {
		String res = new String();
		if ( nameExpression.getPrefixOp() != null && !nameExpression.getPrefixOp().isEmpty() ){
			res = res.concat( nameExpression.getPrefixOp() );
			if ( nameExpression.getPath() != null ){
				res = res.concat( qualifNamePathToStr( nameExpression.getPath() ) );
			}
			res = res.concat( nameExpression.getId() );
		} else {
			if ( nameExpression.getPath() != null ){
				res = res.concat( qualifNamePathToStr( nameExpression.getPath() ) );
			}
			res = res.concat( nameExpression.getId() );
			if ( nameExpression.getInvocationCompletion() != null ){
				res = res.concat( tupleToStr( nameExpression.getInvocationCompletion() ) );
			} else if ( nameExpression.getSequenceConstructionCompletion() != null ){
				res = res.concat( seqConstOrAccComplToStr( nameExpression.getSequenceConstructionCompletion() ) );
			} else if ( nameExpression.getPostfixOp() != null && !nameExpression.getPostfixOp().isEmpty() ){
				res = res.concat( nameExpression.getPostfixOp() );
			}
		}
		if ( nameExpression.getSuffix() != null ){
			res = res.concat( suffixExprToStr( nameExpression.getSuffix() ));
		}
		return res;
	}

	public  String seqConstOrAccComplToStr(SequenceConstructionOrAccessCompletion seq) {
		String res = new String();
		if ( seq.isMultiplicityIndicator() ){
			res = res.concat( "[" );
		}
		if ( seq.getAccessCompletion() != null ){
			res = res.concat( accesCompletionToStr( seq.getAccessCompletion() ) );
		} else if ( seq.getSequenceCompletion() != null){
			res = res.concat( partialSeqConstrComplToStr( seq.getSequenceCompletion() ) );
		} 
		if ( seq.getExpression() != null ){
			res = res.concat( seqConstrExprToStr(  seq.getExpression() ) );
		}
		return res;
	}

	public  String partialSeqConstrComplToStr(PartialSequenceConstructionCompletion sequenceCompletion) {
		String res = new String();
		res = res.concat( "]" );
		res = res.concat( seqConstrExprToStr( sequenceCompletion.getExpression() ) );
		return res;
	}

	public  String accesCompletionToStr(AccessCompletion accessCompletion) {
		String res = new String();
		res = res.concat( new ExpressionStringifier( accessCompletion.getAccessIndex() ).process() );
		res = res.concat( "]" );
		return res;
	}

	public  String qualifNamePathToStr(QualifiedNamePath path) {
		String res = new String();
		EList<UnqualifiedName> unqNamespaces = path.getNamespace();
		for ( int i = 0; i < unqNamespaces.size(); i++ ){
			res = res.concat( unqualifNameToStr( unqNamespaces.get(i) ) + "::" );
		}
		return res;
	}
	
	public  String thisExprToStr(ThisExpression expr) {
		return "this" + suffixExprToStr( expr.getSuffix() );
	}
	
	public  String superInvocationExprToStr(SuperInvocationExpression expr) {
		String res = new String();
		res = res.concat( "super" );
		if ( expr.getClassName() != null && !expr.getClassName().isEmpty() ){
			res = res.concat( "." + expr.getClassName() + "::" + opCallWithoutDotToStr( expr.getOperationCallWithoutDot() ) );
		} else {
			res = res.concat( opCallToStr( expr.getOperationCall() ) );
		}
		return res;
	}

	public  String opCallToStr(OperationCallExpression operationCall) {
		String res = new String();
		res = res.concat( "." );
		res = res.concat( operationCall.getOperationName() );
		res = res.concat( tupleToStr( operationCall.getTuple() ) );
		if ( operationCall.getSuffix() != null ){
			res = res.concat( suffixExprToStr( operationCall.getSuffix() ));
		}
		return res;
	}

	public  String opCallWithoutDotToStr(OperationCallExpressionWithoutDot operationCallWithoutDot) {
		String res = new String();
		res = res.concat( operationCallWithoutDot.getOperationName() );
		res = res.concat( tupleToStr( operationCallWithoutDot.getTuple() ) );
		if ( operationCallWithoutDot.getSuffix() != null ){
			res = res.concat( suffixExprToStr( operationCallWithoutDot.getSuffix() ));
		}
		return res;
	}
	
	public  String instanceCreationExprToStr(InstanceCreationExpression instanceCreation) {
		String res = new String();
		res = res.concat( "new " );
		res = res.concat( qualNameBindToStr( instanceCreation.getConstructor() ) );
		if ( instanceCreation.getTuple() != null ){
			res = res.concat( tupleToStr( instanceCreation.getTuple() ) );
		} else {
			res = res.concat( seqConstrComplToStr( instanceCreation.getSequenceConstuctionCompletion() ) );
		}
		if ( instanceCreation.getSuffix() != null ){
			res = res.concat( suffixExprToStr( instanceCreation.getSuffix() ));
		}
		return res;
	}

	public String seqConstrComplToStr(SequenceConstructionCompletion sequenceConstuctionCompletion) {
		String res = new String();
		if ( sequenceConstuctionCompletion.isMultiplicityIndicator() ){
			res = res.concat( "[]" );
		}
		res = res.concat( seqConstrExprToStr( sequenceConstuctionCompletion.getExpression() ) );
		return res;
	}

	public  String seqConstrExprToStr(SequenceConstructionExpression expression) {
		String res = new String();
		res = res.concat( "{" );
		EList<SequenceElement> seqElems = expression.getSequenceElement();
		for ( int i = 0; i < seqElems.size(); i++ ){
			res = res.concat( seqElemToStr( seqElems.get(i) ) + "," );
		}
		if ( seqElems.size() > 0 ){
			res = res.substring( 0 , res.length() - 1 );
		}
		if ( seqElems.size() == 1 ){
			res = res.concat( ".." + new ExpressionStringifier( expression.getRangeUpper() ).process() );
		}
		return res + "}";
	}

	public  String seqElemToStr(SequenceElement sequenceElement) {
		if ( sequenceElement instanceof Expression ){
			return new ExpressionStringifier( (Expression) sequenceElement ).process();
		} else {
			return seqConstrExprToStr( (SequenceConstructionExpression) sequenceElement );
		}
	}
	
	public  String parenthesizedExprToStr(ParenthesizedExpression expression) {
		String res = new String();
		res = res.concat( "(" );
		res = res.concat( new ExpressionStringifier( expression.getExpOrTypeCast() ).process() );
		res = res.concat( ")" );
		if ( expression.getCasted() != null ){
			res = res.concat( nonLitValueSpecToStr( expression.getCasted() ) );
		} else if ( expression.getSuffix() != null ){
			res = res.concat( suffixExprToStr( expression.getSuffix() ));
		}
		return res;
	}

	public  String nonLitValueSpecToStr(NonLiteralValueSpecification nlve) {
		String res = new String();
		if ( nlve instanceof NameExpression ){
			res = nameExprToStr( (NameExpression) nlve );
		} else if ( nlve instanceof ParenthesizedExpression ){
			res = parenthesizedExprToStr( (ParenthesizedExpression) nlve );
		} else if ( nlve instanceof InstanceCreationExpression ){
			res = instanceCreationExprToStr( (InstanceCreationExpression) nlve );
		} else if ( nlve instanceof ThisExpression ){
			res = thisExprToStr( (ThisExpression) nlve );
		} else if ( nlve instanceof SuperInvocationExpression ){
			res = superInvocationExprToStr( (SuperInvocationExpression) nlve );
		} 
		return res;
	}

	public  String nullExprToStr(NullExpression expr) {
		return "null";
	}
	
	public  String unqualifNameToStr(UnqualifiedName unqualifiedName) {
		String res = new String();
		res = res.concat( unqualifiedName.getName() );
		if ( unqualifiedName.getTemplateBinding() != null ){
			res = res.concat( templateBindingToStr( unqualifiedName.getTemplateBinding() ) );
		}
		return res;
	}

	public  String literalToStr(LITERAL literal) {
		String res = new String();
		if ( literal instanceof BOOLEAN_LITERAL ){
			BOOLEAN_LITERAL boolLit = (BOOLEAN_LITERAL) literal;
			res = boolLit.getValue().getLiteral();
			if ( boolLit.getSuffix() != null ){
				res = res.concat( suffixExprToStr( boolLit.getSuffix() ) );
			}
		} else if ( literal instanceof NUMBER_LITERAL ){
			NUMBER_LITERAL numberLit = (NUMBER_LITERAL) literal;
			if ( numberLit instanceof INTEGER_LITERAL ){
				INTEGER_LITERAL intLit = (INTEGER_LITERAL) numberLit;
				res = intLit.getValue();
				if ( intLit.getSuffix() != null ){
					res = res.concat( suffixExprToStr( intLit.getSuffix() ) );
				}
			} else if ( numberLit instanceof UNLIMITED_LITERAL ){
				UNLIMITED_LITERAL unlimitLit = (UNLIMITED_LITERAL) numberLit;
				res = unlimitLit.getValue();
				if ( unlimitLit.getSuffix() != null ){
					res = res.concat( suffixExprToStr( unlimitLit.getSuffix() ) );
				}
			}
		} else if ( literal instanceof STRING_LITERAL ){
			STRING_LITERAL strLit = (STRING_LITERAL) literal;
			res = "\"" + strLit.getValue() + "\"";
			if ( strLit.getSuffix() != null ){
				res = res.concat( suffixExprToStr( strLit.getSuffix() ) );
			}
		}
		return res;
	}

	public  String suffixExprToStr(SuffixExpression suffixExpr) {
		String res = new String();
		if (suffixExpr instanceof OperationCallExpression){
			res = res.concat ( opCallExprToStr( (OperationCallExpression) suffixExpr ) );
		} else if (suffixExpr instanceof PropertyCallExpression){
			res = res.concat ( propCallExprToStr( (PropertyCallExpression) suffixExpr ) );
		} else if (suffixExpr instanceof LinkOperationExpression){
			res = res.concat ( linkOpExprToStr( (LinkOperationExpression) suffixExpr ) );
		} else if (suffixExpr instanceof SequenceOperationExpression){
			res = res.concat ( seqOpExprToStr( (SequenceOperationExpression) suffixExpr ) );
		} else if (suffixExpr instanceof SequenceReductionExpression){
			res = res.concat ( seqRedExprToStr( (SequenceReductionExpression) suffixExpr ) );
		} else if (suffixExpr instanceof SequenceExpansionExpression){
			res = res.concat ( seqExpExprToStr( (SequenceExpansionExpression) suffixExpr ) );
		} else if (suffixExpr instanceof ClassExtentExpression){
			res = res.concat ( classExtExprToStr( (ClassExtentExpression) suffixExpr ) );
		}
		return res;
	}

	public  String classExtExprToStr(ClassExtentExpression suffixExpr) {
		return ".allInstances()";
	}

	public  String seqExpExprToStr(SequenceExpansionExpression suffixExpr) {
		String res = new String();
		if (suffixExpr instanceof SelectOrRejectOperation){
			res = res.concat ( selOrRejOpToStr( (SelectOrRejectOperation) suffixExpr ) );
		} else if (suffixExpr instanceof CollectOrIterateOperation){
			res = res.concat ( collOrIterOpToStr( (CollectOrIterateOperation) suffixExpr ) );
		} else if (suffixExpr instanceof ForAllOrExistsOrOneOperation){
			res = res.concat ( forAllOrExistOrOneOpToStr( (ForAllOrExistsOrOneOperation) suffixExpr ) );
		} else if (suffixExpr instanceof IsUniqueOperation){
			res = res.concat ( isUniqueOpToStr( (IsUniqueOperation) suffixExpr ) );
		}
		return res;
	}

	public  String isUniqueOpToStr(IsUniqueOperation suffixExpr) {
		String res = new String();
		res = res.concat( "->" + "isUnique " );
		res = res.concat( suffixExpr.getName() );
		res = res.concat( "(" + new ExpressionStringifier( suffixExpr.getExpr() ).process() + ")" );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public  String forAllOrExistOrOneOpToStr(ForAllOrExistsOrOneOperation suffixExpr) {
		String res = new String();
		res = res.concat( "->" );
		res = res.concat( forAllOrExistOrOneOperatorToStr( suffixExpr.getOp() ) );
		res = res.concat( "(" + suffixExpr.getExpr1() + "|" + suffixExpr.getExpr2() + "." + suffixExpr.getExpr3() + "=" + suffixExpr.getExpr4() + ")" );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public  String forAllOrExistOrOneOperatorToStr(ForAllOrExistsOrOneOperator op) {
		return op.getLiteral();
	}

	public  String collOrIterOpToStr(CollectOrIterateOperation suffixExpr) {
		String res = new String();
		res = res.concat( "->" );
		res = res.concat( collOrIterOperatorToStr( suffixExpr.getOp() ) );
		res = res.concat( "(" + suffixExpr.getExpr1() + "|" + suffixExpr.getExpr2() + "=" + suffixExpr.getExpr3() + ")" );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public  String collOrIterOperatorToStr(CollectOrIterateOperator op) {
		return op.getLiteral();
	}

	public  String selOrRejOpToStr(SelectOrRejectOperation suffixExpr) {
		String res = new String();
		res = res.concat( "->" );
		res = res.concat( selectOrRejectOperatorToStr( suffixExpr.getOp() ) + " " );
		res = res.concat( "(" + suffixExpr.getExpr1() + "|" + suffixExpr.getExpr2() + "=" + suffixExpr.getExpr3() + ")" );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public  String selectOrRejectOperatorToStr(SelectOrRejectOperator op) {
		return op.getLiteral();
	}

	public  String seqRedExprToStr(SequenceReductionExpression suffixExpr) {
		String res = new String();
		res = res.concat( "->" );
		res = res.concat( "reduce " );
		if ( suffixExpr.isIsOrdered() ){
			res = res.concat( "ordered " );
		}
		res = res.concat( qualNameBindToStr( suffixExpr.getBehavior() ) );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public String qualNameBindToStr(QualifiedNameWithBinding qualName) {
		String res = new String();
		res = res.concat( qualName.getId() );
		if ( qualName.getBinding() != null ){
			res = res.concat( templateBindingToStr( qualName.getBinding() ) );
		}
		if ( qualName.getRemaining() != null ){
				res = res.concat( "::" + qualNameBindToStr( qualName.getRemaining() ) );
			}
		return res;
	}

	public  String templateBindingToStr(TemplateBinding binding) {
		String res = new String();
		res = res.concat( "<" );
		EList<NamedTemplateBinding> bindings = binding.getBindings();
		for ( int i = 0; i < bindings.size(); i++ ){
			res = res.concat( namedTemplateBindingToStr( bindings.get(i) ) + "," );
		}
		if ( bindings.size() > 0 ){
			res = res.substring( 0 , res.length() - 1 );
		}
		return  res + ">";
	}

	public  String namedTemplateBindingToStr(NamedTemplateBinding namedTemplateBinding) {
		String res = new String();
		res = res.concat( namedTemplateBinding.getFormal() );
		res = res.concat( "=>" );
		res = res.concat( qualNameBindToStr( namedTemplateBinding.getActual() ) );
		return res;
	}

	public  String seqOpExprToStr(SequenceOperationExpression suffixExpr) {
		String res = new String();
		res = res.concat( "->" );
		res = res.concat( suffixExpr.getOperationName() );
		res = res.concat( tupleToStr( suffixExpr.getTuple() ) );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public  String linkOpExprToStr(LinkOperationExpression suffixExpr) {
		String res = new String();
		res = res.concat( "." );
		res = res.concat( linkOpKindToStr( suffixExpr.getKind() ) );
		res = res.concat( linkOpTupleToStr( suffixExpr.getTuple() ) );
		return res;
	}

	public  String linkOpTupleToStr(LinkOperationTuple linkOperationTuple) {
		String res = new String();
		res = res.concat( "(" );
		if ( linkOperationTuple != null ){
			EList<LinkOperationTupleElement> linkOperationTuples = linkOperationTuple.getLinkOperationTupleElement();
			for ( int i = 0; i < linkOperationTuples.size(); i++ ){
				res = res.concat( linkOperationTupleElemToStr( linkOperationTuples.get(i) ) + ", " );
			}
			if ( linkOperationTuples.size() > 0 ){
				res = res.substring( 0 , res.length() - 2 );
			}
		}
		return res + ")";
	}

	public  String linkOperationTupleElemToStr(LinkOperationTupleElement linkOperationTupleElement) {
		String res = new String();
		res = res.concat( linkOperationTupleElement.getObjectOrRole() );
		if ( linkOperationTupleElement.getRoleIndex() != null ){
			res = res.concat("[");
			res = res.concat( new ExpressionStringifier( linkOperationTupleElement.getRoleIndex() ).process() );
			res = res.concat("]");
		}
		if ( linkOperationTupleElement.getObjectValueSpec() != null ){
			res = res.concat( "=>" + valueSpecToStr( linkOperationTupleElement.getObjectValueSpec() ) );
		}
		return res;
	}

	public  String linkOpKindToStr(LinkOperationKind linkOperationKind) {
		return linkOperationKind.getLiteral();
	}

	public  String propCallExprToStr(PropertyCallExpression suffixExpr) {
		String res = new String();
		res = res.concat( "." );
		res = res.concat( suffixExpr.getPropertyName() );
		if ( suffixExpr.getIndex() != null ){
			res = res.concat( "[" + new ExpressionStringifier( suffixExpr.getIndex() ).process() + "]" );
		}
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public  String opCallExprToStr(OperationCallExpression suffixExpr) {
		String res = new String();
		res = res.concat( "." );
		res = res.concat( suffixExpr.getOperationName() );
		res = res.concat( tupleToStr( suffixExpr.getTuple() ) );
		if ( suffixExpr.getSuffix() != null ){
			res = res.concat( suffixExprToStr( suffixExpr.getSuffix() ));
		}
		return res;
	}

	public String tupleToStr(Tuple tuple) {
		String res = new String();
		res = res.concat( "(" );
		EList<TupleElement> tupleElems = tuple.getTupleElements();
		for ( int i = 0; i < tupleElems.size(); i++ ){
			res = res.concat( tupleElemToStr( tupleElems.get(i) ) + ", " );
		}
		if ( tupleElems.size() > 0 ){
			res = res.substring( 0 , res.length() - 2 );
		}
		return res + ")";
	}

	public  String tupleElemToStr(TupleElement tupleElement) {
		return new ExpressionStringifier( tupleElement.getArgument() ).process();
	}
}