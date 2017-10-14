/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.InputPort;
import asu.ser.capstone.pivi.OutputPort;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.StartPort;
import asu.ser.capstone.pivi.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link asu.ser.capstone.pivi.impl.StatementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.impl.StatementImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link asu.ser.capstone.pivi.impl.StatementImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StatementImpl extends MinimalEObjectImpl.Container implements Statement {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EList<StartPort> start;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPort> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiviPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartPort> getStart() {
		if (start == null) {
			start = new EObjectContainmentWithInverseEList<StartPort>(StartPort.class, this, PiviPackage.STATEMENT__START, PiviPackage.START_PORT__STATEMENT);
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<InputPort>(InputPort.class, this, PiviPackage.STATEMENT__INPUTS, PiviPackage.INPUT_PORT__STATEMENT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPort> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList<OutputPort>(OutputPort.class, this, PiviPackage.STATEMENT__OUTPUTS, PiviPackage.OUTPUT_PORT__STATEMENT);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PiviPackage.STATEMENT__START:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStart()).basicAdd(otherEnd, msgs);
			case PiviPackage.STATEMENT__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
			case PiviPackage.STATEMENT__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PiviPackage.STATEMENT__START:
				return ((InternalEList<?>)getStart()).basicRemove(otherEnd, msgs);
			case PiviPackage.STATEMENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case PiviPackage.STATEMENT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case PiviPackage.STATEMENT__START:
				return getStart();
			case PiviPackage.STATEMENT__INPUTS:
				return getInputs();
			case PiviPackage.STATEMENT__OUTPUTS:
				return getOutputs();
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
			case PiviPackage.STATEMENT__START:
				getStart().clear();
				getStart().addAll((Collection<? extends StartPort>)newValue);
				return;
			case PiviPackage.STATEMENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputPort>)newValue);
				return;
			case PiviPackage.STATEMENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPort>)newValue);
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
			case PiviPackage.STATEMENT__START:
				getStart().clear();
				return;
			case PiviPackage.STATEMENT__INPUTS:
				getInputs().clear();
				return;
			case PiviPackage.STATEMENT__OUTPUTS:
				getOutputs().clear();
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
			case PiviPackage.STATEMENT__START:
				return start != null && !start.isEmpty();
			case PiviPackage.STATEMENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case PiviPackage.STATEMENT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatementImpl
