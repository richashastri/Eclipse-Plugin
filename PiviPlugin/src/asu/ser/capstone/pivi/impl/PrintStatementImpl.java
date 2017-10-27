/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.PrintStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.impl.PrintStatementImpl#getPrintlines <em>Printlines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintStatementImpl extends StatementImpl implements PrintStatement {
	/**
	 * The default value of the '{@link #getPrintlines() <em>Printlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintlines()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINTLINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrintlines() <em>Printlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintlines()
	 * @generated
	 * @ordered
	 */
	protected String printlines = PRINTLINES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiviPackage.Literals.PRINT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrintlines() {
		return printlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintlines(String newPrintlines) {
		String oldPrintlines = printlines;
		printlines = newPrintlines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PiviPackage.PRINT_STATEMENT__PRINTLINES, oldPrintlines, printlines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PiviPackage.PRINT_STATEMENT__PRINTLINES:
				return getPrintlines();
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
			case PiviPackage.PRINT_STATEMENT__PRINTLINES:
				setPrintlines((String)newValue);
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
			case PiviPackage.PRINT_STATEMENT__PRINTLINES:
				setPrintlines(PRINTLINES_EDEFAULT);
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
			case PiviPackage.PRINT_STATEMENT__PRINTLINES:
				return PRINTLINES_EDEFAULT == null ? printlines != null : !PRINTLINES_EDEFAULT.equals(printlines);
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
		result.append(" (printlines: ");
		result.append(printlines);
		result.append(')');
		return result.toString();
	}

} //PrintStatementImpl
