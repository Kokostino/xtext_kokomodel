/**
 */
package kokoworld.kokoworld;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokoworld.INamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see kokoworld.kokoworld.KokoworldPackage#getINamedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface INamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * has a globally defined unique name. Consists of prefix of the elements' name + prefixes of all other INamedElements in its containment hierarchy.
	 * Document is on top of the hierarchy, but does not itsself have an INamedElement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see kokoworld.kokoworld.KokoworldPackage#getINamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link kokoworld.kokoworld.INamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // INamedElement
