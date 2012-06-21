/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.alf.alf.AlfPackage;
import org.xtext.alf.alf.Expression;
import org.xtext.alf.alf.LinkOperationTupleElement;
import org.xtext.alf.alf.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Operation Tuple Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.impl.LinkOperationTupleElementImpl#getObjectOrRole <em>Object Or Role</em>}</li>
 *   <li>{@link org.xtext.alf.alf.impl.LinkOperationTupleElementImpl#getRoleIndex <em>Role Index</em>}</li>
 *   <li>{@link org.xtext.alf.alf.impl.LinkOperationTupleElementImpl#getObjectValueSpec <em>Object Value Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkOperationTupleElementImpl extends MinimalEObjectImpl.Container implements LinkOperationTupleElement
{
  /**
   * The default value of the '{@link #getObjectOrRole() <em>Object Or Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectOrRole()
   * @generated
   * @ordered
   */
  protected static final String OBJECT_OR_ROLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjectOrRole() <em>Object Or Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectOrRole()
   * @generated
   * @ordered
   */
  protected String objectOrRole = OBJECT_OR_ROLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRoleIndex() <em>Role Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleIndex()
   * @generated
   * @ordered
   */
  protected Expression roleIndex;

  /**
   * The cached value of the '{@link #getObjectValueSpec() <em>Object Value Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectValueSpec()
   * @generated
   * @ordered
   */
  protected ValueSpecification objectValueSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkOperationTupleElementImpl()
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
    return AlfPackage.Literals.LINK_OPERATION_TUPLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjectOrRole()
  {
    return objectOrRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectOrRole(String newObjectOrRole)
  {
    String oldObjectOrRole = objectOrRole;
    objectOrRole = newObjectOrRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE, oldObjectOrRole, objectOrRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRoleIndex()
  {
    return roleIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoleIndex(Expression newRoleIndex, NotificationChain msgs)
  {
    Expression oldRoleIndex = roleIndex;
    roleIndex = newRoleIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, oldRoleIndex, newRoleIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoleIndex(Expression newRoleIndex)
  {
    if (newRoleIndex != roleIndex)
    {
      NotificationChain msgs = null;
      if (roleIndex != null)
        msgs = ((InternalEObject)roleIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, null, msgs);
      if (newRoleIndex != null)
        msgs = ((InternalEObject)newRoleIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, null, msgs);
      msgs = basicSetRoleIndex(newRoleIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX, newRoleIndex, newRoleIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueSpecification getObjectValueSpec()
  {
    return objectValueSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectValueSpec(ValueSpecification newObjectValueSpec, NotificationChain msgs)
  {
    ValueSpecification oldObjectValueSpec = objectValueSpec;
    objectValueSpec = newObjectValueSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC, oldObjectValueSpec, newObjectValueSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectValueSpec(ValueSpecification newObjectValueSpec)
  {
    if (newObjectValueSpec != objectValueSpec)
    {
      NotificationChain msgs = null;
      if (objectValueSpec != null)
        msgs = ((InternalEObject)objectValueSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC, null, msgs);
      if (newObjectValueSpec != null)
        msgs = ((InternalEObject)newObjectValueSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC, null, msgs);
      msgs = basicSetObjectValueSpec(newObjectValueSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC, newObjectValueSpec, newObjectValueSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
        return basicSetRoleIndex(null, msgs);
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC:
        return basicSetObjectValueSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
        return getObjectOrRole();
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
        return getRoleIndex();
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC:
        return getObjectValueSpec();
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
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
        setObjectOrRole((String)newValue);
        return;
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
        setRoleIndex((Expression)newValue);
        return;
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC:
        setObjectValueSpec((ValueSpecification)newValue);
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
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
        setObjectOrRole(OBJECT_OR_ROLE_EDEFAULT);
        return;
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
        setRoleIndex((Expression)null);
        return;
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC:
        setObjectValueSpec((ValueSpecification)null);
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
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_OR_ROLE:
        return OBJECT_OR_ROLE_EDEFAULT == null ? objectOrRole != null : !OBJECT_OR_ROLE_EDEFAULT.equals(objectOrRole);
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__ROLE_INDEX:
        return roleIndex != null;
      case AlfPackage.LINK_OPERATION_TUPLE_ELEMENT__OBJECT_VALUE_SPEC:
        return objectValueSpec != null;
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
    result.append(" (objectOrRole: ");
    result.append(objectOrRole);
    result.append(')');
    return result.toString();
  }

} //LinkOperationTupleElementImpl
