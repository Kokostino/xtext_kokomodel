/**
 */
package kokoworld.impl;

import java.util.Collection;

import kokoworld.Document;
import kokoworld.Import;
import kokoworld.ImportContainer;
import kokoworld.KokoworldPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kokoworld.impl.ImportContainerImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link kokoworld.impl.ImportContainerImpl#getDocument <em>Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportContainerImpl extends MinimalEObjectImpl.Container implements ImportContainer {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KokoworldPackage.Literals.IMPORT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentWithInverseEList<Import>(Import.class, this,
					KokoworldPackage.IMPORT_CONTAINER__IMPORTS, KokoworldPackage.IMPORT__IMPORTCONTAINER);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (eContainerFeatureID() != KokoworldPackage.IMPORT_CONTAINER__DOCUMENT)
			return null;
		return (Document) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newDocument, KokoworldPackage.IMPORT_CONTAINER__DOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		if (newDocument != eInternalContainer()
				|| (eContainerFeatureID() != KokoworldPackage.IMPORT_CONTAINER__DOCUMENT && newDocument != null)) {
			if (EcoreUtil.isAncestor(this, newDocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocument != null)
				msgs = ((InternalEObject) newDocument).eInverseAdd(this, KokoworldPackage.DOCUMENT__IMPORTCONTAINER,
						Document.class, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KokoworldPackage.IMPORT_CONTAINER__DOCUMENT,
					newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KokoworldPackage.IMPORT_CONTAINER__IMPORTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImports()).basicAdd(otherEnd, msgs);
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetDocument((Document) otherEnd, msgs);
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
		case KokoworldPackage.IMPORT_CONTAINER__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			return basicSetDocument(null, msgs);
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
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			return eInternalContainer().eInverseRemove(this, KokoworldPackage.DOCUMENT__IMPORTCONTAINER, Document.class,
					msgs);
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
		case KokoworldPackage.IMPORT_CONTAINER__IMPORTS:
			return getImports();
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			return getDocument();
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
		case KokoworldPackage.IMPORT_CONTAINER__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			setDocument((Document) newValue);
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
		case KokoworldPackage.IMPORT_CONTAINER__IMPORTS:
			getImports().clear();
			return;
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			setDocument((Document) null);
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
		case KokoworldPackage.IMPORT_CONTAINER__IMPORTS:
			return imports != null && !imports.isEmpty();
		case KokoworldPackage.IMPORT_CONTAINER__DOCUMENT:
			return getDocument() != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportContainerImpl
