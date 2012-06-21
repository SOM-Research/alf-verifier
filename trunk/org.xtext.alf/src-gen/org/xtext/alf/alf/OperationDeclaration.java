/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.OperationDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.alf.alf.OperationDeclaration#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.xtext.alf.alf.OperationDeclaration#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.alf.alf.OperationDeclaration#getRedefinition <em>Redefinition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getOperationDeclaration()
 * @model
 * @generated
 */
public interface OperationDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.alf.alf.AlfPackage#getOperationDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.OperationDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Parameters</em>' containment reference.
   * @see #setFormalParameters(FormalParameters)
   * @see org.xtext.alf.alf.AlfPackage#getOperationDeclaration_FormalParameters()
   * @model containment="true"
   * @generated
   */
  FormalParameters getFormalParameters();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.OperationDeclaration#getFormalParameters <em>Formal Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Parameters</em>' containment reference.
   * @see #getFormalParameters()
   * @generated
   */
  void setFormalParameters(FormalParameters value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypePart)
   * @see org.xtext.alf.alf.AlfPackage#getOperationDeclaration_ReturnType()
   * @model containment="true"
   * @generated
   */
  TypePart getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.OperationDeclaration#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypePart value);

  /**
   * Returns the value of the '<em><b>Redefinition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Redefinition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Redefinition</em>' containment reference.
   * @see #setRedefinition(RedefinitionClause)
   * @see org.xtext.alf.alf.AlfPackage#getOperationDeclaration_Redefinition()
   * @model containment="true"
   * @generated
   */
  RedefinitionClause getRedefinition();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.OperationDeclaration#getRedefinition <em>Redefinition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Redefinition</em>' containment reference.
   * @see #getRedefinition()
   * @generated
   */
  void setRedefinition(RedefinitionClause value);

} // OperationDeclaration
