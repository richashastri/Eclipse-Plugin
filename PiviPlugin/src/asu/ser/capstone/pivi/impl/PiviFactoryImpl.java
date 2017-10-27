/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PiviFactoryImpl extends EFactoryImpl implements PiviFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PiviFactory init() {
		try {
			PiviFactory thePiviFactory = (PiviFactory)EPackage.Registry.INSTANCE.getEFactory(PiviPackage.eNS_URI);
			if (thePiviFactory != null) {
				return thePiviFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PiviFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PiviPackage.IF_END: return createIfEnd();
			case PiviPackage.IF_START: return createIfStart();
			case PiviPackage.INPUT_PORT: return createInputPort();
			case PiviPackage.INSTRUCTION: return createInstruction();
			case PiviPackage.METHOD_END: return createMethodEnd();
			case PiviPackage.METHOD_START: return createMethodStart();
			case PiviPackage.OUTPUT_PORT: return createOutputPort();
			case PiviPackage.PIVI_DIAGRAM: return createPiviDiagram();
			case PiviPackage.START: return createStart();
			case PiviPackage.START_PORT: return createStartPort();
			case PiviPackage.WHILE_END: return createWhileEnd();
			case PiviPackage.WHILE_START: return createWhileStart();
			case PiviPackage.THREAD_END: return createThreadEnd();
			case PiviPackage.THREAD_START: return createThreadStart();
			case PiviPackage.PRINT_STATEMENT: return createPrintStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfEnd createIfEnd() {
		IfEndImpl ifEnd = new IfEndImpl();
		return ifEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStart createIfStart() {
		IfStartImpl ifStart = new IfStartImpl();
		return ifStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodEnd createMethodEnd() {
		MethodEndImpl methodEnd = new MethodEndImpl();
		return methodEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodStart createMethodStart() {
		MethodStartImpl methodStart = new MethodStartImpl();
		return methodStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviDiagram createPiviDiagram() {
		PiviDiagramImpl piviDiagram = new PiviDiagramImpl();
		return piviDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartPort createStartPort() {
		StartPortImpl startPort = new StartPortImpl();
		return startPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileEnd createWhileEnd() {
		WhileEndImpl whileEnd = new WhileEndImpl();
		return whileEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStart createWhileStart() {
		WhileStartImpl whileStart = new WhileStartImpl();
		return whileStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadEnd createThreadEnd() {
		ThreadEndImpl threadEnd = new ThreadEndImpl();
		return threadEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadStart createThreadStart() {
		ThreadStartImpl threadStart = new ThreadStartImpl();
		return threadStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintStatement createPrintStatement() {
		PrintStatementImpl printStatement = new PrintStatementImpl();
		return printStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviPackage getPiviPackage() {
		return (PiviPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PiviPackage getPackage() {
		return PiviPackage.eINSTANCE;
	}

} //PiviFactoryImpl
