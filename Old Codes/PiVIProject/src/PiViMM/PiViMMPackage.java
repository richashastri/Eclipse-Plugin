/**
 */
package PiViMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PiViMM.PiViMMFactory
 * @model kind="package"
 * @generated
 */
public interface PiViMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PiViMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pivi/1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pivi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PiViMMPackage eINSTANCE = PiViMM.impl.PiViMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link PiViMM.impl.IconsImpl <em>Icons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PiViMM.impl.IconsImpl
	 * @see PiViMM.impl.PiViMMPackageImpl#getIcons()
	 * @generated
	 */
	int ICONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Codeblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONS__CODEBLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Codeconnections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONS__CODECONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Icons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Icons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PiViMM.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PiViMM.impl.CodeBlockImpl
	 * @see PiViMM.impl.PiViMMPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODE = 1;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PiViMM.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PiViMM.impl.ConnectorImpl
	 * @see PiViMM.impl.PiViMMPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PiViMM.Icons <em>Icons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icons</em>'.
	 * @see PiViMM.Icons
	 * @generated
	 */
	EClass getIcons();

	/**
	 * Returns the meta object for the attribute '{@link PiViMM.Icons#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PiViMM.Icons#getName()
	 * @see #getIcons()
	 * @generated
	 */
	EAttribute getIcons_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link PiViMM.Icons#getCodeblocks <em>Codeblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codeblocks</em>'.
	 * @see PiViMM.Icons#getCodeblocks()
	 * @see #getIcons()
	 * @generated
	 */
	EReference getIcons_Codeblocks();

	/**
	 * Returns the meta object for the containment reference list '{@link PiViMM.Icons#getCodeconnections <em>Codeconnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codeconnections</em>'.
	 * @see PiViMM.Icons#getCodeconnections()
	 * @see #getIcons()
	 * @generated
	 */
	EReference getIcons_Codeconnections();

	/**
	 * Returns the meta object for class '{@link PiViMM.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see PiViMM.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the attribute '{@link PiViMM.CodeBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PiViMM.CodeBlock#getName()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Name();

	/**
	 * Returns the meta object for the attribute '{@link PiViMM.CodeBlock#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see PiViMM.CodeBlock#getCode()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EAttribute getCodeBlock_Code();

	/**
	 * Returns the meta object for class '{@link PiViMM.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see PiViMM.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link PiViMM.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PiViMM.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the reference '{@link PiViMM.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see PiViMM.Connector#getSource()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Source();

	/**
	 * Returns the meta object for the reference '{@link PiViMM.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see PiViMM.Connector#getTarget()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PiViMMFactory getPiViMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PiViMM.impl.IconsImpl <em>Icons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PiViMM.impl.IconsImpl
		 * @see PiViMM.impl.PiViMMPackageImpl#getIcons()
		 * @generated
		 */
		EClass ICONS = eINSTANCE.getIcons();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICONS__NAME = eINSTANCE.getIcons_Name();

		/**
		 * The meta object literal for the '<em><b>Codeblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONS__CODEBLOCKS = eINSTANCE.getIcons_Codeblocks();

		/**
		 * The meta object literal for the '<em><b>Codeconnections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONS__CODECONNECTIONS = eINSTANCE.getIcons_Codeconnections();

		/**
		 * The meta object literal for the '{@link PiViMM.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PiViMM.impl.CodeBlockImpl
		 * @see PiViMM.impl.PiViMMPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__NAME = eINSTANCE.getCodeBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_BLOCK__CODE = eINSTANCE.getCodeBlock_Code();

		/**
		 * The meta object literal for the '{@link PiViMM.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PiViMM.impl.ConnectorImpl
		 * @see PiViMM.impl.PiViMMPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getConnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getConnector_Target();

	}

} //PiViMMPackage
