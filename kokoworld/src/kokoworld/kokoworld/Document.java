/**
 */
package kokoworld.kokoworld;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokoworld.Document#getName <em>Name</em>}</li>
 *   <li>{@link kokoworld.kokoworld.Document#getMembers <em>Members</em>}</li>
 *   <li>{@link kokoworld.kokoworld.Document#getImportcontainer <em>Importcontainer</em>}</li>
 * </ul>
 *
 * @see kokoworld.kokoworld.KokoworldPackage#getDocument()
 * @model abstract="true"
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kokoworld.kokoworld.KokoworldPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kokoworld.kokoworld.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link kokoworld.kokoworld.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see kokoworld.kokoworld.KokoworldPackage#getDocument_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Importcontainer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link kokoworld.kokoworld.ImportContainer#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importcontainer</em>' containment reference.
	 * @see #setImportcontainer(ImportContainer)
	 * @see kokoworld.kokoworld.KokoworldPackage#getDocument_Importcontainer()
	 * @see kokoworld.kokoworld.ImportContainer#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	ImportContainer getImportcontainer();

	/**
	 * Sets the value of the '{@link kokoworld.kokoworld.Document#getImportcontainer <em>Importcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importcontainer</em>' containment reference.
	 * @see #getImportcontainer()
	 * @generated
	 */
	void setImportcontainer(ImportContainer value);

} // Document
