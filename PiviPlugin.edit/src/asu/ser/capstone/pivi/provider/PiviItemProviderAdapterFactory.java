/**
 */
package asu.ser.capstone.pivi.provider;

import asu.ser.capstone.pivi.util.PiviAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PiviItemProviderAdapterFactory extends PiviAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.IfEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfEndItemProvider ifEndItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.IfEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfEndAdapter() {
		if (ifEndItemProvider == null) {
			ifEndItemProvider = new IfEndItemProvider(this);
		}

		return ifEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.IfStart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStartItemProvider ifStartItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.IfStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfStartAdapter() {
		if (ifStartItemProvider == null) {
			ifStartItemProvider = new IfStartItemProvider(this);
		}

		return ifStartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.InputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPortItemProvider inputPortItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.InputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputPortAdapter() {
		if (inputPortItemProvider == null) {
			inputPortItemProvider = new InputPortItemProvider(this);
		}

		return inputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.Instruction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionItemProvider instructionItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstructionAdapter() {
		if (instructionItemProvider == null) {
			instructionItemProvider = new InstructionItemProvider(this);
		}

		return instructionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.MethodEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodEndItemProvider methodEndItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.MethodEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodEndAdapter() {
		if (methodEndItemProvider == null) {
			methodEndItemProvider = new MethodEndItemProvider(this);
		}

		return methodEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.MethodStart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodStartItemProvider methodStartItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.MethodStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodStartAdapter() {
		if (methodStartItemProvider == null) {
			methodStartItemProvider = new MethodStartItemProvider(this);
		}

		return methodStartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.OutputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPortItemProvider outputPortItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.OutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputPortAdapter() {
		if (outputPortItemProvider == null) {
			outputPortItemProvider = new OutputPortItemProvider(this);
		}

		return outputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.PiviDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PiviDiagramItemProvider piviDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.PiviDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPiviDiagramAdapter() {
		if (piviDiagramItemProvider == null) {
			piviDiagramItemProvider = new PiviDiagramItemProvider(this);
		}

		return piviDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.Start} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartItemProvider startItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.Start}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartAdapter() {
		if (startItemProvider == null) {
			startItemProvider = new StartItemProvider(this);
		}

		return startItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.StartPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartPortItemProvider startPortItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.StartPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartPortAdapter() {
		if (startPortItemProvider == null) {
			startPortItemProvider = new StartPortItemProvider(this);
		}

		return startPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.WhileEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileEndItemProvider whileEndItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.WhileEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileEndAdapter() {
		if (whileEndItemProvider == null) {
			whileEndItemProvider = new WhileEndItemProvider(this);
		}

		return whileEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link asu.ser.capstone.pivi.WhileStart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileStartItemProvider whileStartItemProvider;

	/**
	 * This creates an adapter for a {@link asu.ser.capstone.pivi.WhileStart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileStartAdapter() {
		if (whileStartItemProvider == null) {
			whileStartItemProvider = new WhileStartItemProvider(this);
		}

		return whileStartItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (ifEndItemProvider != null) ifEndItemProvider.dispose();
		if (ifStartItemProvider != null) ifStartItemProvider.dispose();
		if (inputPortItemProvider != null) inputPortItemProvider.dispose();
		if (instructionItemProvider != null) instructionItemProvider.dispose();
		if (methodEndItemProvider != null) methodEndItemProvider.dispose();
		if (methodStartItemProvider != null) methodStartItemProvider.dispose();
		if (outputPortItemProvider != null) outputPortItemProvider.dispose();
		if (piviDiagramItemProvider != null) piviDiagramItemProvider.dispose();
		if (startItemProvider != null) startItemProvider.dispose();
		if (startPortItemProvider != null) startPortItemProvider.dispose();
		if (whileEndItemProvider != null) whileEndItemProvider.dispose();
		if (whileStartItemProvider != null) whileStartItemProvider.dispose();
	}

}
