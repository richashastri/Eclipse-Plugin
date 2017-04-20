/**
 */
package CodeBlockMM;

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
 * @see CodeBlockMM.CodeBlockMMFactory
 * @model kind="package"
 * @generated
 */
public interface CodeBlockMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CodeBlockMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://codeblock/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "codeblock";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeBlockMMPackage eINSTANCE = CodeBlockMM.impl.CodeBlockMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link CodeBlockMM.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodeBlockMM.impl.IconImpl
	 * @see CodeBlockMM.impl.CodeBlockMMPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Codeblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__CODEBLOCKS = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__CONNECTIONS = 2;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodeBlockMM.impl.CodeblockImpl <em>Codeblock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodeBlockMM.impl.CodeblockImpl
	 * @see CodeBlockMM.impl.CodeBlockMMPackageImpl#getCodeblock()
	 * @generated
	 */
	int CODEBLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEBLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEBLOCK__CODE = 1;

	/**
	 * The number of structural features of the '<em>Codeblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEBLOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Codeblock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODEBLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CodeBlockMM.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CodeBlockMM.impl.ConnectionImpl
	 * @see CodeBlockMM.impl.CodeBlockMMPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CodeBlockMM.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see CodeBlockMM.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link CodeBlockMM.Icon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CodeBlockMM.Icon#getName()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link CodeBlockMM.Icon#getCodeblocks <em>Codeblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codeblocks</em>'.
	 * @see CodeBlockMM.Icon#getCodeblocks()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_Codeblocks();

	/**
	 * Returns the meta object for the containment reference list '{@link CodeBlockMM.Icon#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see CodeBlockMM.Icon#getConnections()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_Connections();

	/**
	 * Returns the meta object for class '{@link CodeBlockMM.Codeblock <em>Codeblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Codeblock</em>'.
	 * @see CodeBlockMM.Codeblock
	 * @generated
	 */
	EClass getCodeblock();

	/**
	 * Returns the meta object for the attribute '{@link CodeBlockMM.Codeblock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CodeBlockMM.Codeblock#getName()
	 * @see #getCodeblock()
	 * @generated
	 */
	EAttribute getCodeblock_Name();

	/**
	 * Returns the meta object for the attribute '{@link CodeBlockMM.Codeblock#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see CodeBlockMM.Codeblock#getCode()
	 * @see #getCodeblock()
	 * @generated
	 */
	EAttribute getCodeblock_Code();

	/**
	 * Returns the meta object for class '{@link CodeBlockMM.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see CodeBlockMM.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link CodeBlockMM.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CodeBlockMM.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the reference '{@link CodeBlockMM.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see CodeBlockMM.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link CodeBlockMM.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CodeBlockMM.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeBlockMMFactory getCodeBlockMMFactory();

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
		 * The meta object literal for the '{@link CodeBlockMM.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodeBlockMM.impl.IconImpl
		 * @see CodeBlockMM.impl.CodeBlockMMPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__NAME = eINSTANCE.getIcon_Name();

		/**
		 * The meta object literal for the '<em><b>Codeblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__CODEBLOCKS = eINSTANCE.getIcon_Codeblocks();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__CONNECTIONS = eINSTANCE.getIcon_Connections();

		/**
		 * The meta object literal for the '{@link CodeBlockMM.impl.CodeblockImpl <em>Codeblock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodeBlockMM.impl.CodeblockImpl
		 * @see CodeBlockMM.impl.CodeBlockMMPackageImpl#getCodeblock()
		 * @generated
		 */
		EClass CODEBLOCK = eINSTANCE.getCodeblock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEBLOCK__NAME = eINSTANCE.getCodeblock_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODEBLOCK__CODE = eINSTANCE.getCodeblock_Code();

		/**
		 * The meta object literal for the '{@link CodeBlockMM.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CodeBlockMM.impl.ConnectionImpl
		 * @see CodeBlockMM.impl.CodeBlockMMPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

	}

} //CodeBlockMMPackage
