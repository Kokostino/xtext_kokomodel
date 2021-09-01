/**
 */
package kokoworld.impl;

import kokoworld.Import;
import kokoworld.ImportContainer;
import kokoworld.KokoworldPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.impl.ImportImpl#getItem <em>Item</em>}</li>
 *   <li>{@link kokoworld.impl.ImportImpl#getImportcontainer <em>Importcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
	/**
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected String item = ITEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KokoworldPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(String newItem) {
		String oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KokoworldPackage.IMPORT__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportContainer getImportcontainer() {
		if (eContainerFeatureID() != KokoworldPackage.IMPORT__IMPORTCONTAINER)
			return null;
		return (ImportContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportcontainer(ImportContainer newImportcontainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newImportcontainer, KokoworldPackage.IMPORT__IMPORTCONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportcontainer(ImportContainer newImportcontainer) {
		if (newImportcontainer != eInternalContainer()
				|| (eContainerFeatureID() != KokoworldPackage.IMPORT__IMPORTCONTAINER && newImportcontainer != null)) {
			if (EcoreUtil.isAncestor(this, newImportcontainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportcontainer != null)
				msgs = ((InternalEObject) newImportcontainer).eInverseAdd(this,
						KokoworldPackage.IMPORT_CONTAINER__IMPORTS, ImportContainer.class, msgs);
			msgs = basicSetImportcontainer(newImportcontainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KokoworldPackage.IMPORT__IMPORTCONTAINER,
					newImportcontainer, newImportcontainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetImportcontainer((ImportContainer) otherEnd, msgs);
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
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
			return eInternalContainer().eInverseRemove(this, KokoworldPackage.IMPORT_CONTAINER__IMPORTS,
					ImportContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KokoworldPackage.IMPORT__ITEM:
			return getItem();
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
			return getImportcontainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case KokoworldPackage.IMPORT__ITEM:
			setItem((String) newValue);
			return;
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
			setImportcontainer((ImportContainer) newValue);
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
		case KokoworldPackage.IMPORT__ITEM:
			setItem(ITEM_EDEFAULT);
			return;
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
			setImportcontainer((ImportContainer) null);
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
		case KokoworldPackage.IMPORT__ITEM:
			return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
		case KokoworldPackage.IMPORT__IMPORTCONTAINER:
			return getImportcontainer() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (item: ");
		result.append(item);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
