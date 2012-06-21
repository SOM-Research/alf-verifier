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
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.Test#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.alf.alf.Test#getAssignExpression <em>Assign Expression</em>}</li>
 *   <li>{@link org.xtext.alf.alf.Test#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.xtext.alf.alf.Test#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.alf.alf.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.alf.alf.AlfPackage#getTest_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

  /**
   * Returns the value of the '<em><b>Assign Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.alf.alf.AssignmentCompletion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign Expression</em>' containment reference list.
   * @see org.xtext.alf.alf.AlfPackage#getTest_AssignExpression()
   * @model containment="true"
   * @generated
   */
  EList<AssignmentCompletion> getAssignExpression();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.alf.alf.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.alf.alf.AlfPackage#getTest_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.xtext.alf.alf.AlfPackage#getTest_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.Test#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Test
