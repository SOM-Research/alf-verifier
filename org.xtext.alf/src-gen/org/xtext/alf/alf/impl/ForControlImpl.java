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
import org.xtext.alf.alf.ForControl;
import org.xtext.alf.alf.LoopVariableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.impl.ForControlImpl#getLoopVariableDefinition <em>Loop Variable Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForControlImpl extends MinimalEObjectImpl.Container implements ForControl
{
  /**
   * The cached value of the '{@link #getLoopVariableDefinition() <em>Loop Variable Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoopVariableDefinition()
   * @generated
   * @ordered
   */
  protected LoopVariableDefinition loopVariableDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForControlImpl()
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
    return AlfPackage.Literals.FOR_CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopVariableDefinition getLoopVariableDefinition()
  {
    return loopVariableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoopVariableDefinition(LoopVariableDefinition newLoopVariableDefinition, NotificationChain msgs)
  {
    LoopVariableDefinition oldLoopVariableDefinition = loopVariableDefinition;
    loopVariableDefinition = newLoopVariableDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION, oldLoopVariableDefinition, newLoopVariableDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoopVariableDefinition(LoopVariableDefinition newLoopVariableDefinition)
  {
    if (newLoopVariableDefinition != loopVariableDefinition)
    {
      NotificationChain msgs = null;
      if (loopVariableDefinition != null)
        msgs = ((InternalEObject)loopVariableDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION, null, msgs);
      if (newLoopVariableDefinition != null)
        msgs = ((InternalEObject)newLoopVariableDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION, null, msgs);
      msgs = basicSetLoopVariableDefinition(newLoopVariableDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION, newLoopVariableDefinition, newLoopVariableDefinition));
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        return basicSetLoopVariableDefinition(null, msgs);
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        return getLoopVariableDefinition();
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        setLoopVariableDefinition((LoopVariableDefinition)newValue);
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        setLoopVariableDefinition((LoopVariableDefinition)null);
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
      case AlfPackage.FOR_CONTROL__LOOP_VARIABLE_DEFINITION:
        return loopVariableDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //ForControlImpl
