/**
 */
package PiViMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PiViMM.Icons#getName <em>Name</em>}</li>
 *   <li>{@link PiViMM.Icons#getCodeblocks <em>Codeblocks</em>}</li>
 *   <li>{@link PiViMM.Icons#getCodeconnections <em>Codeconnections</em>}</li>
 * </ul>
 *
 * @see PiViMM.PiViMMPackage#getIcons()
 * @model
 * @generated
 */
public interface Icons extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PiViMM.PiViMMPackage#getIcons_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PiViMM.Icons#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Codeblocks</b></em>' containment reference list.
	 * The list contents are of type {@link PiViMM.CodeBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codeblocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codeblocks</em>' containment reference list.
	 * @see PiViMM.PiViMMPackage#getIcons_Codeblocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeBlock> getCodeblocks();

	/**
	 * Returns the value of the '<em><b>Codeconnections</b></em>' containment reference list.
	 * The list contents are of type {@link PiViMM.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codeconnections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codeconnections</em>' containment reference list.
	 * @see PiViMM.PiViMMPackage#getIcons_Codeconnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getCodeconnections();

} // Icons
