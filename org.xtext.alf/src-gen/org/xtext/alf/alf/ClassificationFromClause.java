/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification From Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.ClassificationFromClause#getQualifiedNameList <em>Qualified Name List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getClassificationFromClause()
 * @model
 * @generated
 */
public interface ClassificationFromClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name List</em>' containment reference.
   * @see #setQualifiedNameList(QualifiedNameList)
   * @see org.xtext.alf.alf.AlfPackage#getClassificationFromClause_QualifiedNameList()
   * @model containment="true"
   * @generated
   */
  QualifiedNameList getQualifiedNameList();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.ClassificationFromClause#getQualifiedNameList <em>Qualified Name List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name List</em>' containment reference.
   * @see #getQualifiedNameList()
   * @generated
   */
  void setQualifiedNameList(QualifiedNameList value);

} // ClassificationFromClause
