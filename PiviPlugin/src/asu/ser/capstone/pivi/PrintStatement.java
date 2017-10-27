/**
 */
package asu.ser.capstone.pivi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.PrintStatement#getPrintlines <em>Printlines</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getPrintStatement()
 * @model
 * @generated
 */
public interface PrintStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Printlines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Printlines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printlines</em>' attribute.
	 * @see #setPrintlines(String)
	 * @see asu.ser.capstone.pivi.PiviPackage#getPrintStatement_Printlines()
	 * @model
	 * @generated
	 */
	String getPrintlines();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.PrintStatement#getPrintlines <em>Printlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printlines</em>' attribute.
	 * @see #getPrintlines()
	 * @generated
	 */
	void setPrintlines(String value);

} // PrintStatement
