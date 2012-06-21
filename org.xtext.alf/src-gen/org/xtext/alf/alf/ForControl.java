/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getForControl()
 * @model
 * @generated
 */
public interface ForControl extends EObject
{
  /**
   * Returns the value of the '<em><b>Loop Variable Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loop Variable Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop Variable Definition</em>' containment reference.
   * @see #setLoopVariableDefinition(LoopVariableDefinition)
   * @see org.xtext.alf.alf.AlfPackage#getForControl_LoopVariableDefinition()
   * @model containment="true"
   * @generated
   */
  LoopVariableDefinition getLoopVariableDefinition();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop Variable Definition</em>' containment reference.
   * @see #getLoopVariableDefinition()
   * @generated
   */
  void setLoopVariableDefinition(LoopVariableDefinition value);

} // ForControl
