/**
 */
package PiViMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PiViMM.PiViMMPackage
 * @generated
 */
public interface PiViMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PiViMMFactory eINSTANCE = PiViMM.impl.PiViMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Icons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Icons</em>'.
	 * @generated
	 */
	Icons createIcons();

	/**
	 * Returns a new object of class '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block</em>'.
	 * @generated
	 */
	CodeBlock createCodeBlock();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PiViMMPackage getPiViMMPackage();

} //PiViMMFactory
