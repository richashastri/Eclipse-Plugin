/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.OutputPort#getStatement <em>Statement</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.OutputPort#getInputPort <em>Input Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.Statement#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' container reference.
	 * @see #setStatement(Statement)
	 * @see asu.ser.capstone.pivi.PiviPackage#getOutputPort_Statement()
	 * @see asu.ser.capstone.pivi.Statement#getOutputs
	 * @model opposite="outputs" transient="false"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.OutputPort#getStatement <em>Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' container reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.InputPort#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(InputPort)
	 * @see asu.ser.capstone.pivi.PiviPackage#getOutputPort_InputPort()
	 * @see asu.ser.capstone.pivi.InputPort#getOutputPort
	 * @model opposite="outputPort"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.OutputPort#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(InputPort value);

} // OutputPort
