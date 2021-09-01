/**
 */
package kokoworld.kokoworld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * to auf & zuklappen of imports in the beginning of the document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokoworld.ImportContainer#getImports <em>Imports</em>}</li>
 *   <li>{@link kokoworld.kokoworld.ImportContainer#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @see kokoworld.kokoworld.KokoworldPackage#getImportContainer()
 * @model
 * @generated
 */
public interface ImportContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link kokoworld.kokoworld.Import}.
	 * It is bidirectional and its opposite is '{@link kokoworld.kokoworld.Import#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see kokoworld.kokoworld.KokoworldPackage#getImportContainer_Imports()
	 * @see kokoworld.kokoworld.Import#getImportcontainer
	 * @model opposite="importcontainer" containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kokoworld.kokoworld.Document#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(Document)
	 * @see kokoworld.kokoworld.KokoworldPackage#getImportContainer_Document()
	 * @see kokoworld.kokoworld.Document#getImportcontainer
	 * @model opposite="importcontainer" transient="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link kokoworld.kokoworld.ImportContainer#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

} // ImportContainer
