/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.PiviDiagram#getStatements <em>Statements</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.PiviDiagram#getStart <em>Start</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.PiviDiagram#getInputPort <em>Input Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getPiviDiagram()
 * @model
 * @generated
 */
public interface PiviDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getPiviDiagram_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see asu.ser.capstone.pivi.PiviPackage#getPiviDiagram_Start()
	 * @model containment="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.PiviDiagram#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' containment reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' containment reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getPiviDiagram_InputPort()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPort> getInputPort();

} // PiviDiagram
