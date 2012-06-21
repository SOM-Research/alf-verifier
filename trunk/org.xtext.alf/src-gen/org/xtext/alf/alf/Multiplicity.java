/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.Multiplicity#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.alf.alf.Multiplicity#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.xtext.alf.alf.Multiplicity#isNonUnique <em>Non Unique</em>}</li>
 *   <li>{@link org.xtext.alf.alf.Multiplicity#isSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(MultiplicityRange)
   * @see org.xtext.alf.alf.AlfPackage#getMultiplicity_Range()
   * @model containment="true"
   * @generated
   */
  MultiplicityRange getRange();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.Multiplicity#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(MultiplicityRange value);

  /**
   * Returns the value of the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordered</em>' attribute.
   * @see #setOrdered(boolean)
   * @see org.xtext.alf.alf.AlfPackage#getMultiplicity_Ordered()
   * @model
   * @generated
   */
  boolean isOrdered();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.Multiplicity#isOrdered <em>Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordered</em>' attribute.
   * @see #isOrdered()
   * @generated
   */
  void setOrdered(boolean value);

  /**
   * Returns the value of the '<em><b>Non Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Non Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Non Unique</em>' attribute.
   * @see #setNonUnique(boolean)
   * @see org.xtext.alf.alf.AlfPackage#getMultiplicity_NonUnique()
   * @model
   * @generated
   */
  boolean isNonUnique();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.Multiplicity#isNonUnique <em>Non Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Non Unique</em>' attribute.
   * @see #isNonUnique()
   * @generated
   */
  void setNonUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' attribute.
   * @see #setSequence(boolean)
   * @see org.xtext.alf.alf.AlfPackage#getMultiplicity_Sequence()
   * @model
   * @generated
   */
  boolean isSequence();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.Multiplicity#isSequence <em>Sequence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' attribute.
   * @see #isSequence()
   * @generated
   */
  void setSequence(boolean value);

} // Multiplicity
