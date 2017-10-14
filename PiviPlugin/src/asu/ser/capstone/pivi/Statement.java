/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.Statement#getStart <em>Start</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.Statement#getInputs <em>Inputs</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.Statement#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.StartPort}.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.StartPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatement_Start()
	 * @see asu.ser.capstone.pivi.StartPort#getStatement
	 * @model opposite="statement" containment="true"
	 * @generated
	 */
	EList<StartPort> getStart();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.InputPort}.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.InputPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatement_Inputs()
	 * @see asu.ser.capstone.pivi.InputPort#getStatement
	 * @model opposite="statement" containment="true"
	 * @generated
	 */
	EList<InputPort> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.OutputPort}.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.OutputPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getStatement_Outputs()
	 * @see asu.ser.capstone.pivi.OutputPort#getStatement
	 * @model opposite="statement" containment="true"
	 * @generated
	 */
	EList<OutputPort> getOutputs();

} // Statement
