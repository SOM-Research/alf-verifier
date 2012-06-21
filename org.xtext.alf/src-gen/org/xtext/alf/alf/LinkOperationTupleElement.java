/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Operation Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}</li>
 *   <li>{@link org.xtext.alf.alf.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}</li>
 *   <li>{@link org.xtext.alf.alf.LinkOperationTupleElement#getObjectValueSpec <em>Object Value Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getLinkOperationTupleElement()
 * @model
 * @generated
 */
public interface LinkOperationTupleElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Or Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Or Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Or Role</em>' attribute.
   * @see #setObjectOrRole(String)
   * @see org.xtext.alf.alf.AlfPackage#getLinkOperationTupleElement_ObjectOrRole()
   * @model
   * @generated
   */
  String getObjectOrRole();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.LinkOperationTupleElement#getObjectOrRole <em>Object Or Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Or Role</em>' attribute.
   * @see #getObjectOrRole()
   * @generated
   */
  void setObjectOrRole(String value);

  /**
   * Returns the value of the '<em><b>Role Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Index</em>' containment reference.
   * @see #setRoleIndex(Expression)
   * @see org.xtext.alf.alf.AlfPackage#getLinkOperationTupleElement_RoleIndex()
   * @model containment="true"
   * @generated
   */
  Expression getRoleIndex();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.LinkOperationTupleElement#getRoleIndex <em>Role Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role Index</em>' containment reference.
   * @see #getRoleIndex()
   * @generated
   */
  void setRoleIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Object Value Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Value Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Value Spec</em>' containment reference.
   * @see #setObjectValueSpec(ValueSpecification)
   * @see org.xtext.alf.alf.AlfPackage#getLinkOperationTupleElement_ObjectValueSpec()
   * @model containment="true"
   * @generated
   */
  ValueSpecification getObjectValueSpec();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.LinkOperationTupleElement#getObjectValueSpec <em>Object Value Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Value Spec</em>' containment reference.
   * @see #getObjectValueSpec()
   * @generated
   */
  void setObjectValueSpec(ValueSpecification value);

} // LinkOperationTupleElement
