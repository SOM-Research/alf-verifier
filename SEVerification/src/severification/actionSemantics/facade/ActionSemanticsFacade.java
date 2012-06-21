package severification.actionSemantics.facade;

import java.util.ArrayList;
import java.util.Iterator;

import severification.actionSemantics.AddStructuralFeature;
import severification.actionSemantics.Association;
import severification.actionSemantics.ClearAssociation;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.CreateObject;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Guard;
import severification.actionSemantics.Object;
import severification.actionSemantics.Operation;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class ActionSemanticsFacade {

	@SuppressWarnings("unchecked")
	public static Operation operationFromExecutionPaths( ArrayList< ArrayList<Instruction> > execPaths, String mainOperation ){
		Operation op = new Operation();
		int idTerm = 0;
		for ( int i = 0; i < execPaths.size(); i++ ){
			ArrayList<Instruction> execPath = execPaths.get( i );
			ExecutionPath path = new ExecutionPath();
			for ( int j = 0; j < execPath.size(); j++ ){
				Instruction instruction = execPath.get( j );
				if ( instruction.getType() != InstructionType.EMPTY ){
					Term term = new Term( idTerm++ , instruction.getMultiplicity() , instruction.getLiteral() , 
							new Operation( instruction.getOperationBelonging() ) );
					Iterator<String> guardsIter = instruction.getGuards().iterator();
					while ( guardsIter.hasNext() ){
						term.addGuard( new Guard( guardsIter.next() ) );
					}
					if ( instruction.getType() == InstructionType.ADD_STRUCTURAL_FEATURE ){
						String value = instruction.getArguments().get(2).toString();
//						value = value.replace("\"", "");
						term.setAction( new AddStructuralFeature( 	
							instruction.getArguments().get(0)!=null?
							instruction.getArguments().get(0).toString():null , 
							instruction.getArguments().get(1).toString() , 
							value ,
							instruction.getArguments().get(3) != null ? instruction.getArguments().get(3).toString() : null ) );
					} else if ( instruction.getType() == InstructionType.CLEAR_ASSOCIATION ){
						term.setAction( new ClearAssociation(	new Association( instruction.getArguments().get(0).toString() ),
																instruction.getArguments().get(1).toString() , 
																instruction.getArguments().get(2).toString()
																 ) );
					} else if ( instruction.getType() == InstructionType.CREATE_LINK ){
						term.setAction( new CreateLink(	new Association( instruction.getArguments().get(0).toString() ) , 
														instruction.getArguments().get(1).toString(),
														instruction.getArguments().get(2).toString(),
														instruction.getArguments().get(3).toString(),
														instruction.getArguments().get(4).toString() ) );
						
					} else if ( instruction.getType() == InstructionType.CREATE_OBJECT ){
						term.setAction( new CreateObject( new Object( 	instruction.getArguments().get(0)!=null?
																		instruction.getArguments().get(0).toString():null, 
																		instruction.getArguments().get(1).toString() ) ) );
						
					} else if ( instruction.getType() == InstructionType.DESTROY_LINK ){
						term.setAction( new DestroyLink(	new Association( instruction.getArguments().get(0).toString() ) , 
															instruction.getArguments().get(1).toString(),
															instruction.getArguments().get(2).toString(),
															instruction.getArguments().get(3).toString(),
															instruction.getArguments().get(4).toString() ) );
					} else if ( instruction.getType() == InstructionType.DESTROY_OBJECT ){
						String clazz = instruction.getArguments().size()>1 && instruction.getArguments().get(1)!=null?
											instruction.getArguments().get(1).toString():
											null;
						term.setAction( new DestroyObject( new Object( instruction.getArguments().get(0).toString() , clazz ) ) );
					} else if ( instruction.getType() == InstructionType.RECLASSIFY_OBJECT ){
						term.setAction( new ReclassifyObject( 	instruction.getArguments().get(0).toString() , 
																( ArrayList<String> )instruction.getArguments().get(1), 
																( ArrayList<String> )instruction.getArguments().get(2) ) );
					}
					path.addTerm( term );
				}
			}
			op.addExecutionPath( path );
			idTerm = 0;
		}
		op.setName( mainOperation );
		return op;
	}
}