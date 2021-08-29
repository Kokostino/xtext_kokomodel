/**
 */
package kokoworld.impl;

import kokoworld.BaseEntity;
import kokoworld.Document;
import kokoworld.KokoworldFactory;
import kokoworld.KokoworldPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KokoworldPackageImpl extends EPackageImpl implements KokoworldPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEntityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kokoworld.KokoworldPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KokoworldPackageImpl() {
		super(eNS_URI, KokoworldFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link KokoworldPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KokoworldPackage init() {
		if (isInited)
			return (KokoworldPackage) EPackage.Registry.INSTANCE.getEPackage(KokoworldPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKokoworldPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KokoworldPackageImpl theKokoworldPackage = registeredKokoworldPackage instanceof KokoworldPackageImpl
				? (KokoworldPackageImpl) registeredKokoworldPackage
				: new KokoworldPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theKokoworldPackage.createPackageContents();

		// Initialize created meta-data
		theKokoworldPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKokoworldPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KokoworldPackage.eNS_URI, theKokoworldPackage);
		return theKokoworldPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Name() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseEntity() {
		return baseEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseEntity_Name() {
		return (EAttribute) baseEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KokoworldFactory getKokoworldFactory() {
		return (KokoworldFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NAME);

		baseEntityEClass = createEClass(BASE_ENTITY);
		createEAttribute(baseEntityEClass, BASE_ENTITY__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Document.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEntityEClass, BaseEntity.class, "BaseEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseEntity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //KokoworldPackageImpl
