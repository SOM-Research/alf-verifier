/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.PropertyCallExpression#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.xtext.alf.alf.PropertyCallExpression#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.alf.alf.PropertyCallExpression#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getPropertyCallExpression()
 * @model
 * @generated
 */
public interface PropertyCallExpression extends SuffixExpression
{
  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see #setPropertyName(String)
   * @see org.xtext.alf.alf.AlfPackage#getPropertyCallExpression_PropertyName()
   * @model
   * @generated
   */
  String getPropertyName();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.PropertyCallExpression#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Expression)
   * @see org.xtext.alf.alf.AlfPackage#getPropertyCallExpression_Index()
   * @model containment="true"
   * @generated
   */
  Expression getIndex();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.PropertyCallExpression#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Suffix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Suffix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suffix</em>' containment reference.
   * @see #setSuffix(SuffixExpression)
   * @see org.xtext.alf.alf.AlfPackage#getPropertyCallExpression_Suffix()
   * @model containment="true"
   * @generated
   */
  SuffixExpression getSuffix();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.PropertyCallExpression#getSuffix <em>Suffix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suffix</em>' containment reference.
   * @see #getSuffix()
   * @generated
   */
  void setSuffix(SuffixExpression value);

} // PropertyCallExpression
