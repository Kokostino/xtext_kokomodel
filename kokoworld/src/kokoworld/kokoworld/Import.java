/**
 */
package kokoworld.kokoworld;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokoworld.Import#getItem <em>Item</em>}</li>
 *   <li>{@link kokoworld.kokoworld.Import#getImportcontainer <em>Importcontainer</em>}</li>
 * </ul>
 *
 * @see kokoworld.kokoworld.KokoworldPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(String)
	 * @see kokoworld.kokoworld.KokoworldPackage#getImport_Item()
	 * @model
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link kokoworld.kokoworld.Import#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Returns the value of the '<em><b>Importcontainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link kokoworld.kokoworld.ImportContainer#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importcontainer</em>' container reference.
	 * @see #setImportcontainer(ImportContainer)
	 * @see kokoworld.kokoworld.KokoworldPackage#getImport_Importcontainer()
	 * @see kokoworld.kokoworld.ImportContainer#getImports
	 * @model opposite="imports" transient="false"
	 * @generated
	 */
	ImportContainer getImportcontainer();

	/**
	 * Sets the value of the '{@link kokoworld.kokoworld.Import#getImportcontainer <em>Importcontainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importcontainer</em>' container reference.
	 * @see #getImportcontainer()
	 * @generated
	 */
	void setImportcontainer(ImportContainer value);

} // Import
