/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.InputPort#getStatement <em>Statement</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.InputPort#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getInputPort()
 * @model
 * @generated
 */
public interface InputPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.Statement#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' container reference.
	 * @see #setStatement(Statement)
	 * @see asu.ser.capstone.pivi.PiviPackage#getInputPort_Statement()
	 * @see asu.ser.capstone.pivi.Statement#getInputs
	 * @model opposite="inputs" transient="false"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.InputPort#getStatement <em>Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' container reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.OutputPort#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' reference.
	 * @see #setOutputPort(OutputPort)
	 * @see asu.ser.capstone.pivi.PiviPackage#getInputPort_OutputPort()
	 * @see asu.ser.capstone.pivi.OutputPort#getInputPort
	 * @model opposite="inputPort"
	 * @generated
	 */
	OutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.InputPort#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(OutputPort value);

} // InputPort
