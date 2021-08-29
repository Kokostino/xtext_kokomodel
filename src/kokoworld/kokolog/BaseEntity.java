/**
 */
package kokoworld.kokolog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokolog.BaseEntity#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link kokoworld.kokolog.BaseEntity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see kokoworld.kokolog.KokologPackage#getBaseEntity()
 * @model
 * @generated
 */
public interface BaseEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Logdocument</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kokoworld.kokolog.LogDocument#getBaseentities <em>Baseentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logdocument</em>' container reference.
	 * @see #setLogdocument(LogDocument)
	 * @see kokoworld.kokolog.KokologPackage#getBaseEntity_Logdocument()
	 * @see kokoworld.kokolog.LogDocument#getBaseentities
	 * @model opposite="baseentities" transient="false"
	 * @generated
	 */
	LogDocument getLogdocument();

	/**
	 * Sets the value of the '{@link kokoworld.kokolog.BaseEntity#getLogdocument <em>Logdocument</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logdocument</em>' container reference.
	 * @see #getLogdocument()
	 * @generated
	 */
	void setLogdocument(LogDocument value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kokoworld.kokolog.KokologPackage#getBaseEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kokoworld.kokolog.BaseEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BaseEntity
