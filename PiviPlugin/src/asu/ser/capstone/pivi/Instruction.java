/**
 */
package asu.ser.capstone.pivi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.Instruction#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see asu.ser.capstone.pivi.PiviPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends Statement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see #setInstructions(String)
	 * @see asu.ser.capstone.pivi.PiviPackage#getInstruction_Instructions()
	 * @model
	 * @generated
	 */
	String getInstructions();

	/**
	 * Sets the value of the '{@link asu.ser.capstone.pivi.Instruction#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);

} // Instruction
