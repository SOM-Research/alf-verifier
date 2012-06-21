/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Or Reject Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.SelectOrRejectOperation#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr2 <em>Expr2</em>}</li>
 *   <li>{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr3 <em>Expr3</em>}</li>
 *   <li>{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr4 <em>Expr4</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getSelectOrRejectOperation()
 * @model
 * @generated
 */
public interface SelectOrRejectOperation extends SequenceExpansionExpression
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.alf.alf.SelectOrRejectOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.xtext.alf.alf.SelectOrRejectOperator
   * @see #setOp(SelectOrRejectOperator)
   * @see org.xtext.alf.alf.AlfPackage#getSelectOrRejectOperation_Op()
   * @model
   * @generated
   */
  SelectOrRejectOperator getOp();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.SelectOrRejectOperation#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.xtext.alf.alf.SelectOrRejectOperator
   * @see #getOp()
   * @generated
   */
  void setOp(SelectOrRejectOperator value);

  /**
   * Returns the value of the '<em><b>Expr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr1</em>' attribute.
   * @see #setExpr1(String)
   * @see org.xtext.alf.alf.AlfPackage#getSelectOrRejectOperation_Expr1()
   * @model
   * @generated
   */
  String getExpr1();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr1 <em>Expr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr1</em>' attribute.
   * @see #getExpr1()
   * @generated
   */
  void setExpr1(String value);

  /**
   * Returns the value of the '<em><b>Expr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr2</em>' attribute.
   * @see #setExpr2(String)
   * @see org.xtext.alf.alf.AlfPackage#getSelectOrRejectOperation_Expr2()
   * @model
   * @generated
   */
  String getExpr2();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr2 <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr2</em>' attribute.
   * @see #getExpr2()
   * @generated
   */
  void setExpr2(String value);

  /**
   * Returns the value of the '<em><b>Expr3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr3</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr3</em>' attribute.
   * @see #setExpr3(String)
   * @see org.xtext.alf.alf.AlfPackage#getSelectOrRejectOperation_Expr3()
   * @model
   * @generated
   */
  String getExpr3();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr3 <em>Expr3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr3</em>' attribute.
   * @see #getExpr3()
   * @generated
   */
  void setExpr3(String value);

  /**
   * Returns the value of the '<em><b>Expr4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr4</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr4</em>' attribute.
   * @see #setExpr4(String)
   * @see org.xtext.alf.alf.AlfPackage#getSelectOrRejectOperation_Expr4()
   * @model
   * @generated
   */
  String getExpr4();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.SelectOrRejectOperation#getExpr4 <em>Expr4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr4</em>' attribute.
   * @see #getExpr4()
   * @generated
   */
  void setExpr4(String value);

} // SelectOrRejectOperation
