/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.Instruction;
import asu.ser.capstone.pivi.PiviPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.impl.InstructionImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends StatementImpl implements Instruction {
	/**
	 * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected String instructions = INSTRUCTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiviPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructions(String newInstructions) {
		String oldInstructions = instructions;
		instructions = newInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PiviPackage.INSTRUCTION__INSTRUCTIONS, oldInstructions, instructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PiviPackage.INSTRUCTION__INSTRUCTIONS:
				return getInstructions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PiviPackage.INSTRUCTION__INSTRUCTIONS:
				setInstructions((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PiviPackage.INSTRUCTION__INSTRUCTIONS:
				setInstructions(INSTRUCTIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PiviPackage.INSTRUCTION__INSTRUCTIONS:
				return INSTRUCTIONS_EDEFAULT == null ? instructions != null : !INSTRUCTIONS_EDEFAULT.equals(instructions);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (instructions: ");
		result.append(instructions);
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
