/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.alf.alf.AlfPackage;
import org.xtext.alf.alf.SelectOrRejectOperation;
import org.xtext.alf.alf.SelectOrRejectOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Or Reject Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl#getExpr1 <em>Expr1</em>}</li>
 *   <li>{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl#getExpr2 <em>Expr2</em>}</li>
 *   <li>{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl#getExpr3 <em>Expr3</em>}</li>
 *   <li>{@link org.xtext.alf.alf.impl.SelectOrRejectOperationImpl#getExpr4 <em>Expr4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectOrRejectOperationImpl extends SequenceExpansionExpressionImpl implements SelectOrRejectOperation
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final SelectOrRejectOperator OP_EDEFAULT = SelectOrRejectOperator.SELECT;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected SelectOrRejectOperator op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr1() <em>Expr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected static final String EXPR1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr1() <em>Expr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr1()
   * @generated
   * @ordered
   */
  protected String expr1 = EXPR1_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr2() <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected static final String EXPR2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr2() <em>Expr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr2()
   * @generated
   * @ordered
   */
  protected String expr2 = EXPR2_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr3() <em>Expr3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr3()
   * @generated
   * @ordered
   */
  protected static final String EXPR3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr3() <em>Expr3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr3()
   * @generated
   * @ordered
   */
  protected String expr3 = EXPR3_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr4() <em>Expr4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr4()
   * @generated
   * @ordered
   */
  protected static final String EXPR4_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr4() <em>Expr4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr4()
   * @generated
   * @ordered
   */
  protected String expr4 = EXPR4_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectOrRejectOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlfPackage.Literals.SELECT_OR_REJECT_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectOrRejectOperator getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(SelectOrRejectOperator newOp)
  {
    SelectOrRejectOperator oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SELECT_OR_REJECT_OPERATION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr1()
  {
    return expr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr1(String newExpr1)
  {
    String oldExpr1 = expr1;
    expr1 = newExpr1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR1, oldExpr1, expr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr2()
  {
    return expr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr2(String newExpr2)
  {
    String oldExpr2 = expr2;
    expr2 = newExpr2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR2, oldExpr2, expr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr3()
  {
    return expr3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr3(String newExpr3)
  {
    String oldExpr3 = expr3;
    expr3 = newExpr3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR3, oldExpr3, expr3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr4()
  {
    return expr4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr4(String newExpr4)
  {
    String oldExpr4 = expr4;
    expr4 = newExpr4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR4, oldExpr4, expr4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlfPackage.SELECT_OR_REJECT_OPERATION__OP:
        return getOp();
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR1:
        return getExpr1();
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR2:
        return getExpr2();
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR3:
        return getExpr3();
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR4:
        return getExpr4();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlfPackage.SELECT_OR_REJECT_OPERATION__OP:
        setOp((SelectOrRejectOperator)newValue);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR1:
        setExpr1((String)newValue);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR2:
        setExpr2((String)newValue);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR3:
        setExpr3((String)newValue);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR4:
        setExpr4((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.SELECT_OR_REJECT_OPERATION__OP:
        setOp(OP_EDEFAULT);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR1:
        setExpr1(EXPR1_EDEFAULT);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR2:
        setExpr2(EXPR2_EDEFAULT);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR3:
        setExpr3(EXPR3_EDEFAULT);
        return;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR4:
        setExpr4(EXPR4_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlfPackage.SELECT_OR_REJECT_OPERATION__OP:
        return op != OP_EDEFAULT;
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR1:
        return EXPR1_EDEFAULT == null ? expr1 != null : !EXPR1_EDEFAULT.equals(expr1);
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR2:
        return EXPR2_EDEFAULT == null ? expr2 != null : !EXPR2_EDEFAULT.equals(expr2);
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR3:
        return EXPR3_EDEFAULT == null ? expr3 != null : !EXPR3_EDEFAULT.equals(expr3);
      case AlfPackage.SELECT_OR_REJECT_OPERATION__EXPR4:
        return EXPR4_EDEFAULT == null ? expr4 != null : !EXPR4_EDEFAULT.equals(expr4);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(", expr1: ");
    result.append(expr1);
    result.append(", expr2: ");
    result.append(expr2);
    result.append(", expr3: ");
    result.append(expr3);
    result.append(", expr4: ");
    result.append(expr4);
    result.append(')');
    return result.toString();
  }

} //SelectOrRejectOperationImpl
