/**
 */
package PiViMM.impl;

import PiViMM.CodeBlock;
import PiViMM.Connector;
import PiViMM.Icons;
import PiViMM.PiViMMPackage;

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
 * An implementation of the model object '<em><b>Icons</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PiViMM.impl.IconsImpl#getName <em>Name</em>}</li>
 *   <li>{@link PiViMM.impl.IconsImpl#getCodeblocks <em>Codeblocks</em>}</li>
 *   <li>{@link PiViMM.impl.IconsImpl#getCodeconnections <em>Codeconnections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IconsImpl extends MinimalEObjectImpl.Container implements Icons {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeblocks() <em>Codeblocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeblocks()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeBlock> codeblocks;

	/**
	 * The cached value of the '{@link #getCodeconnections() <em>Codeconnections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeconnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> codeconnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PiViMMPackage.Literals.ICONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PiViMMPackage.ICONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeBlock> getCodeblocks() {
		if (codeblocks == null) {
			codeblocks = new EObjectContainmentEList<CodeBlock>(CodeBlock.class, this, PiViMMPackage.ICONS__CODEBLOCKS);
		}
		return codeblocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getCodeconnections() {
		if (codeconnections == null) {
			codeconnections = new EObjectContainmentEList<Connector>(Connector.class, this, PiViMMPackage.ICONS__CODECONNECTIONS);
		}
		return codeconnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PiViMMPackage.ICONS__CODEBLOCKS:
				return ((InternalEList<?>)getCodeblocks()).basicRemove(otherEnd, msgs);
			case PiViMMPackage.ICONS__CODECONNECTIONS:
				return ((InternalEList<?>)getCodeconnections()).basicRemove(otherEnd, msgs);
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
			case PiViMMPackage.ICONS__NAME:
				return getName();
			case PiViMMPackage.ICONS__CODEBLOCKS:
				return getCodeblocks();
			case PiViMMPackage.ICONS__CODECONNECTIONS:
				return getCodeconnections();
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
			case PiViMMPackage.ICONS__NAME:
				setName((String)newValue);
				return;
			case PiViMMPackage.ICONS__CODEBLOCKS:
				getCodeblocks().clear();
				getCodeblocks().addAll((Collection<? extends CodeBlock>)newValue);
				return;
			case PiViMMPackage.ICONS__CODECONNECTIONS:
				getCodeconnections().clear();
				getCodeconnections().addAll((Collection<? extends Connector>)newValue);
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
			case PiViMMPackage.ICONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PiViMMPackage.ICONS__CODEBLOCKS:
				getCodeblocks().clear();
				return;
			case PiViMMPackage.ICONS__CODECONNECTIONS:
				getCodeconnections().clear();
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
			case PiViMMPackage.ICONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PiViMMPackage.ICONS__CODEBLOCKS:
				return codeblocks != null && !codeblocks.isEmpty();
			case PiViMMPackage.ICONS__CODECONNECTIONS:
				return codeconnections != null && !codeconnections.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IconsImpl
