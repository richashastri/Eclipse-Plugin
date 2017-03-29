/**
 */
package SquareMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SquareMM.Architecture#getName <em>Name</em>}</li>
 *   <li>{@link SquareMM.Architecture#getSquares <em>Squares</em>}</li>
 *   <li>{@link SquareMM.Architecture#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see SquareMM.SquareMMPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends EObject {
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
	 * @see SquareMM.SquareMMPackage#getArchitecture_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SquareMM.Architecture#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Squares</b></em>' containment reference list.
	 * The list contents are of type {@link SquareMM.Square}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Squares</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squares</em>' containment reference list.
	 * @see SquareMM.SquareMMPackage#getArchitecture_Squares()
	 * @model containment="true"
	 * @generated
	 */
	EList<Square> getSquares();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link SquareMM.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see SquareMM.SquareMMPackage#getArchitecture_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Architecture
