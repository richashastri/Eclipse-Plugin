/**
 */
package CodeBlockMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CodeBlockMM.Icon#getName <em>Name</em>}</li>
 *   <li>{@link CodeBlockMM.Icon#getCodeblocks <em>Codeblocks</em>}</li>
 *   <li>{@link CodeBlockMM.Icon#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see CodeBlockMM.CodeBlockMMPackage#getIcon()
 * @model
 * @generated
 */
public interface Icon extends EObject {
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
	 * @see CodeBlockMM.CodeBlockMMPackage#getIcon_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CodeBlockMM.Icon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Codeblocks</b></em>' containment reference list.
	 * The list contents are of type {@link CodeBlockMM.Codeblock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codeblocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codeblocks</em>' containment reference list.
	 * @see CodeBlockMM.CodeBlockMMPackage#getIcon_Codeblocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Codeblock> getCodeblocks();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link CodeBlockMM.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see CodeBlockMM.CodeBlockMMPackage#getIcon_Connections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Icon
