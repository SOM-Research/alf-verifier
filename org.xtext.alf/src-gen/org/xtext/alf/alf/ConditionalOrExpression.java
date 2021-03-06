/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.ConditionalOrExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getConditionalOrExpression()
 * @model
 * @generated
 */
public interface ConditionalOrExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.alf.alf.ConditionalAndExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see org.xtext.alf.alf.AlfPackage#getConditionalOrExpression_Exp()
   * @model containment="true"
   * @generated
   */
  EList<ConditionalAndExpression> getExp();

} // ConditionalOrExpression
