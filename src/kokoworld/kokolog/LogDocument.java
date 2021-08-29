/**
 */
package kokoworld.kokolog;

import kokoworld.kokoworld.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokolog.LogDocument#getBaseentities <em>Baseentities</em>}</li>
 * </ul>
 *
 * @see kokoworld.kokolog.KokologPackage#getLogDocument()
 * @model
 * @generated
 */
public interface LogDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Baseentities</b></em>' containment reference list.
	 * The list contents are of type {@link kokoworld.kokolog.BaseEntity}.
	 * It is bidirectional and its opposite is '{@link kokoworld.kokolog.BaseEntity#getLogdocument <em>Logdocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseentities</em>' containment reference list.
	 * @see kokoworld.kokolog.KokologPackage#getLogDocument_Baseentities()
	 * @see kokoworld.kokolog.BaseEntity#getLogdocument
	 * @model opposite="logdocument" containment="true"
	 * @generated
	 */
	EList<BaseEntity> getBaseentities();

} // LogDocument
