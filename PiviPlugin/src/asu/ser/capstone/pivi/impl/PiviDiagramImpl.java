/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.InputPort;
import asu.ser.capstone.pivi.PiviDiagram;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.Start;
import asu.ser.capstone.pivi.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl#getStart <em>Start</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl#getInputPort <em>Input Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PiviDiagramImpl extends MinimalEObjectImpl.Container implements PiviDiagram {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PiviDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiviPackage.Literals.PIVI_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, PiviPackage.PIVI_DIAGRAM__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Start newStart, NotificationChain msgs) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PiviPackage.PIVI_DIAGRAM__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Start newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PiviPackage.PIVI_DIAGRAM__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PiviPackage.PIVI_DIAGRAM__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PiviPackage.PIVI_DIAGRAM__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputPort() {
		if (inputPort == null) {
			inputPort = new EObjectContainmentEList<InputPort>(InputPort.class, this, PiviPackage.PIVI_DIAGRAM__INPUT_PORT);
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PiviPackage.PIVI_DIAGRAM__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case PiviPackage.PIVI_DIAGRAM__START:
				return basicSetStart(null, msgs);
			case PiviPackage.PIVI_DIAGRAM__INPUT_PORT:
				return ((InternalEList<?>)getInputPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PiviPackage.PIVI_DIAGRAM__STATEMENTS:
				return getStatements();
			case PiviPackage.PIVI_DIAGRAM__START:
				return getStart();
			case PiviPackage.PIVI_DIAGRAM__INPUT_PORT:
				return getInputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PiviPackage.PIVI_DIAGRAM__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case PiviPackage.PIVI_DIAGRAM__START:
				setStart((Start)newValue);
				return;
			case PiviPackage.PIVI_DIAGRAM__INPUT_PORT:
				getInputPort().clear();
				getInputPort().addAll((Collection<? extends InputPort>)newValue);
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
			case PiviPackage.PIVI_DIAGRAM__STATEMENTS:
				getStatements().clear();
				return;
			case PiviPackage.PIVI_DIAGRAM__START:
				setStart((Start)null);
				return;
			case PiviPackage.PIVI_DIAGRAM__INPUT_PORT:
				getInputPort().clear();
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
			case PiviPackage.PIVI_DIAGRAM__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case PiviPackage.PIVI_DIAGRAM__START:
				return start != null;
			case PiviPackage.PIVI_DIAGRAM__INPUT_PORT:
				return inputPort != null && !inputPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PiviDiagramImpl
