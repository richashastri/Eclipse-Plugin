/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.Start#getStartPort <em>Start Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Port</b></em>' reference list.
	 * The list contents are of type {@link asu.ser.capstone.pivi.StartPort}.
	 * It is bidirectional and its opposite is '{@link asu.ser.capstone.pivi.StartPort#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Port</em>' reference list.
	 * @see asu.ser.capstone.pivi.PiviPackage#getStart_StartPort()
	 * @see asu.ser.capstone.pivi.StartPort#getStart
	 * @model opposite="start"
	 * @generated
	 */
	EList<StartPort> getStartPort();

} // Start
