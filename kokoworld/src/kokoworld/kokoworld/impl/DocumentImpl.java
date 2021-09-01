/**
 */
package kokoworld.kokoworld.impl;

import java.util.Collection;
import kokoworld.kokoworld.Document;
import kokoworld.kokoworld.ImportContainer;
import kokoworld.kokoworld.KokoworldPackage;

import kokoworld.kokoworld.Member;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.kokoworld.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link kokoworld.kokoworld.impl.DocumentImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link kokoworld.kokoworld.impl.DocumentImpl#getImportcontainer <em>Importcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getImportcontainer() <em>Importcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportcontainer()
	 * @generated
	 * @ordered
	 */
	protected ImportContainer importcontainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KokoworldPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KokoworldPackage.DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<Member>(Member.class, this, KokoworldPackage.DOCUMENT__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportContainer getImportcontainer() {
		return importcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportcontainer(ImportContainer newImportcontainer, NotificationChain msgs) {
		ImportContainer oldImportcontainer = importcontainer;
		importcontainer = newImportcontainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KokoworldPackage.DOCUMENT__IMPORTCONTAINER, oldImportcontainer, newImportcontainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportcontainer(ImportContainer newImportcontainer) {
		if (newImportcontainer != importcontainer) {
			NotificationChain msgs = null;
			if (importcontainer != null)
				msgs = ((InternalEObject)importcontainer).eInverseRemove(this, KokoworldPackage.IMPORT_CONTAINER__DOCUMENT, ImportContainer.class, msgs);
			if (newImportcontainer != null)
				msgs = ((InternalEObject)newImportcontainer).eInverseAdd(this, KokoworldPackage.IMPORT_CONTAINER__DOCUMENT, ImportContainer.class, msgs);
			msgs = basicSetImportcontainer(newImportcontainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KokoworldPackage.DOCUMENT__IMPORTCONTAINER, newImportcontainer, newImportcontainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KokoworldPackage.DOCUMENT__IMPORTCONTAINER:
				if (importcontainer != null)
					msgs = ((InternalEObject)importcontainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KokoworldPackage.DOCUMENT__IMPORTCONTAINER, null, msgs);
				return basicSetImportcontainer((ImportContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KokoworldPackage.DOCUMENT__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case KokoworldPackage.DOCUMENT__IMPORTCONTAINER:
				return basicSetImportcontainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KokoworldPackage.DOCUMENT__NAME:
				return getName();
			case KokoworldPackage.DOCUMENT__MEMBERS:
				return getMembers();
			case KokoworldPackage.DOCUMENT__IMPORTCONTAINER:
				return getImportcontainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KokoworldPackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case KokoworldPackage.DOCUMENT__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case KokoworldPackage.DOCUMENT__IMPORTCONTAINER:
				setImportcontainer((ImportContainer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case KokoworldPackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KokoworldPackage.DOCUMENT__MEMBERS:
				getMembers().clear();
				return;
			case KokoworldPackage.DOCUMENT__IMPORTCONTAINER:
				setImportcontainer((ImportContainer)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KokoworldPackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KokoworldPackage.DOCUMENT__MEMBERS:
				return members != null && !members.isEmpty();
			case KokoworldPackage.DOCUMENT__IMPORTCONTAINER:
				return importcontainer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
