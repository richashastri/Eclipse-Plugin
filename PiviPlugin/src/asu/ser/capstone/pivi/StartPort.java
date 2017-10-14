/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.StartPort#getStatement <em>Statement</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.StartPort#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getStartPort()
 * @model
 * @generated
 */
public interface StartPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.Statement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' container reference.
	 * @see #setStatement(Statement)
	 * @see asu.ser.capstone.pivi.PiviPackage#getStartPort_Statement()
	 * @see asu.ser.capstone.pivi.Statement#getStart
	 * @model opposite="start" transient="false"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StartPort#getStatement <em>Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' container reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.Start#getStartPort <em>Start Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Start)
	 * @see asu.ser.capstone.pivi.PiviPackage#getStartPort_Start()
	 * @see asu.ser.capstone.pivi.Start#getStartPort
	 * @model opposite="startPort"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.StartPort#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

} // StartPort
