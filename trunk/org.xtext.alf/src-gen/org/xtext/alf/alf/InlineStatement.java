/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.alf.alf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.alf.alf.InlineStatement#getLangageName <em>Langage Name</em>}</li>
 *   <li>{@link org.xtext.alf.alf.InlineStatement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.alf.alf.AlfPackage#getInlineStatement()
 * @model
 * @generated
 */
public interface InlineStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Langage Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Langage Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Langage Name</em>' attribute.
   * @see #setLangageName(String)
   * @see org.xtext.alf.alf.AlfPackage#getInlineStatement_LangageName()
   * @model
   * @generated
   */
  String getLangageName();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.InlineStatement#getLangageName <em>Langage Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Langage Name</em>' attribute.
   * @see #getLangageName()
   * @generated
   */
  void setLangageName(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see org.xtext.alf.alf.AlfPackage#getInlineStatement_Body()
   * @model
   * @generated
   */
  String getBody();

  /**
   * Sets the value of the '{@link org.xtext.alf.alf.InlineStatement#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
  void setBody(String value);

} // InlineStatement
