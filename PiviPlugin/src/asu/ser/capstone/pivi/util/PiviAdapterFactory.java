/**
 */
package asu.ser.capstone.pivi.util;

import asu.ser.capstone.pivi.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see asu.ser.capstone.pivi.PiviPackage
 * @generated
 */
public class PiviAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PiviPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PiviPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PiviSwitch<Adapter> modelSwitch =
		new PiviSwitch<Adapter>() {
			@Override
			public Adapter caseIfEnd(IfEnd object) {
				return createIfEndAdapter();
			}
			@Override
			public Adapter caseIfStart(IfStart object) {
				return createIfStartAdapter();
			}
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseMethodEnd(MethodEnd object) {
				return createMethodEndAdapter();
			}
			@Override
			public Adapter caseMethodStart(MethodStart object) {
				return createMethodStartAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter casePiviDiagram(PiviDiagram object) {
				return createPiviDiagramAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStartPort(StartPort object) {
				return createStartPortAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseWhileEnd(WhileEnd object) {
				return createWhileEndAdapter();
			}
			@Override
			public Adapter caseWhileStart(WhileStart object) {
				return createWhileStartAdapter();
			}
			@Override
			public Adapter caseThreadEnd(ThreadEnd object) {
				return createThreadEndAdapter();
			}
			@Override
			public Adapter caseThreadStart(ThreadStart object) {
				return createThreadStartAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.IfEnd <em>If End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.IfEnd
	 * @generated
	 */
	public Adapter createIfEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.IfStart <em>If Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.IfStart
	 * @generated
	 */
	public Adapter createIfStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.MethodEnd <em>Method End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.MethodEnd
	 * @generated
	 */
	public Adapter createMethodEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.MethodStart <em>Method Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.MethodStart
	 * @generated
	 */
	public Adapter createMethodStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.PiviDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.PiviDiagram
	 * @generated
	 */
	public Adapter createPiviDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.StartPort <em>Start Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.StartPort
	 * @generated
	 */
	public Adapter createStartPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.WhileEnd <em>While End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.WhileEnd
	 * @generated
	 */
	public Adapter createWhileEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.WhileStart <em>While Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.WhileStart
	 * @generated
	 */
	public Adapter createWhileStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.ThreadEnd <em>Thread End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.ThreadEnd
	 * @generated
	 */
	public Adapter createThreadEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link asu.ser.capstone.pivi.ThreadStart <em>Thread Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see asu.ser.capstone.pivi.ThreadStart
	 * @generated
	 */
	public Adapter createThreadStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PiviAdapterFactory
