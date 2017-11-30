/**
 */
package asu.ser.capstone.pivi.impl;

import asu.ser.capstone.pivi.IfEnd;
import asu.ser.capstone.pivi.IfStart;
import asu.ser.capstone.pivi.InputPort;
import asu.ser.capstone.pivi.Instruction;
import asu.ser.capstone.pivi.MethodEnd;
import asu.ser.capstone.pivi.MethodStart;
import asu.ser.capstone.pivi.OutputPort;
import asu.ser.capstone.pivi.PiviDiagram;
import asu.ser.capstone.pivi.PiviFactory;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.PrintStatement;
import asu.ser.capstone.pivi.Start;
import asu.ser.capstone.pivi.StartPort;
import asu.ser.capstone.pivi.Statement;
import asu.ser.capstone.pivi.SyncEnd;
import asu.ser.capstone.pivi.SyncStart;
import asu.ser.capstone.pivi.ThreadEnd;
import asu.ser.capstone.pivi.ThreadStart;
import asu.ser.capstone.pivi.WhileEnd;
import asu.ser.capstone.pivi.WhileStart;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PiviPackageImpl extends EPackageImpl implements PiviPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piviDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncStartEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see asu.ser.capstone.pivi.PiviPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PiviPackageImpl() {
		super(eNS_URI, PiviFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PiviPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PiviPackage init() {
		if (isInited) return (PiviPackage)EPackage.Registry.INSTANCE.getEPackage(PiviPackage.eNS_URI);

		// Obtain or create and register package
		PiviPackageImpl thePiviPackage = (PiviPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PiviPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PiviPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePiviPackage.createPackageContents();

		// Initialize created meta-data
		thePiviPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePiviPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PiviPackage.eNS_URI, thePiviPackage);
		return thePiviPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfEnd() {
		return ifEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStart() {
		return ifStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIfStart_Condition() {
		return (EAttribute)ifStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_Statement() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPort_OutputPort() {
		return (EReference)inputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Instructions() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodEnd() {
		return methodEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodStart() {
		return methodStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodStart_Name() {
		return (EAttribute)methodStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_Statement() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPort_InputPort() {
		return (EReference)outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiviDiagram() {
		return piviDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPiviDiagram_Statements() {
		return (EReference)piviDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPiviDiagram_Start() {
		return (EReference)piviDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPiviDiagram_InputPort() {
		return (EReference)piviDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_StartPort() {
		return (EReference)startEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartPort() {
		return startPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartPort_Statement() {
		return (EReference)startPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartPort_Start() {
		return (EReference)startPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Start() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Inputs() {
		return (EReference)statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Outputs() {
		return (EReference)statementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileEnd() {
		return whileEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStart() {
		return whileStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhileStart_Condition() {
		return (EAttribute)whileStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadEnd() {
		return threadEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadStart() {
		return threadStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadStart_Condition() {
		return (EAttribute)threadStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintStatement() {
		return printStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrintStatement_Printlines() {
		return (EAttribute)printStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncEnd() {
		return syncEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyncStart() {
		return syncStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyncStart_Condition() {
		return (EAttribute)syncStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviFactory getPiviFactory() {
		return (PiviFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ifEndEClass = createEClass(IF_END);

		ifStartEClass = createEClass(IF_START);
		createEAttribute(ifStartEClass, IF_START__CONDITION);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__STATEMENT);
		createEReference(inputPortEClass, INPUT_PORT__OUTPUT_PORT);

		instructionEClass = createEClass(INSTRUCTION);
		createEAttribute(instructionEClass, INSTRUCTION__INSTRUCTIONS);

		methodEndEClass = createEClass(METHOD_END);

		methodStartEClass = createEClass(METHOD_START);
		createEAttribute(methodStartEClass, METHOD_START__NAME);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__STATEMENT);
		createEReference(outputPortEClass, OUTPUT_PORT__INPUT_PORT);

		piviDiagramEClass = createEClass(PIVI_DIAGRAM);
		createEReference(piviDiagramEClass, PIVI_DIAGRAM__STATEMENTS);
		createEReference(piviDiagramEClass, PIVI_DIAGRAM__START);
		createEReference(piviDiagramEClass, PIVI_DIAGRAM__INPUT_PORT);

		startEClass = createEClass(START);
		createEReference(startEClass, START__START_PORT);

		startPortEClass = createEClass(START_PORT);
		createEReference(startPortEClass, START_PORT__STATEMENT);
		createEReference(startPortEClass, START_PORT__START);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__START);
		createEReference(statementEClass, STATEMENT__INPUTS);
		createEReference(statementEClass, STATEMENT__OUTPUTS);

		whileEndEClass = createEClass(WHILE_END);

		whileStartEClass = createEClass(WHILE_START);
		createEAttribute(whileStartEClass, WHILE_START__CONDITION);

		threadEndEClass = createEClass(THREAD_END);

		threadStartEClass = createEClass(THREAD_START);
		createEAttribute(threadStartEClass, THREAD_START__CONDITION);

		printStatementEClass = createEClass(PRINT_STATEMENT);
		createEAttribute(printStatementEClass, PRINT_STATEMENT__PRINTLINES);

		syncEndEClass = createEClass(SYNC_END);

		syncStartEClass = createEClass(SYNC_START);
		createEAttribute(syncStartEClass, SYNC_START__CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ifEndEClass.getESuperTypes().add(this.getStatement());
		ifStartEClass.getESuperTypes().add(this.getStatement());
		instructionEClass.getESuperTypes().add(this.getStatement());
		methodEndEClass.getESuperTypes().add(this.getStatement());
		methodStartEClass.getESuperTypes().add(this.getStatement());
		whileEndEClass.getESuperTypes().add(this.getStatement());
		whileStartEClass.getESuperTypes().add(this.getStatement());
		threadEndEClass.getESuperTypes().add(this.getStatement());
		threadStartEClass.getESuperTypes().add(this.getStatement());
		printStatementEClass.getESuperTypes().add(this.getStatement());
		syncEndEClass.getESuperTypes().add(this.getStatement());
		syncStartEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(ifEndEClass, IfEnd.class, "IfEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifStartEClass, IfStart.class, "IfStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIfStart_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, IfStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_Statement(), this.getStatement(), this.getStatement_Inputs(), "statement", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPort_OutputPort(), this.getOutputPort(), this.getOutputPort_InputPort(), "outputPort", null, 0, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstruction_Instructions(), ecorePackage.getEString(), "instructions", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEndEClass, MethodEnd.class, "MethodEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodStartEClass, MethodStart.class, "MethodStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodStart_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Statement(), this.getStatement(), this.getStatement_Outputs(), "statement", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_InputPort(), this.getInputPort(), this.getInputPort_OutputPort(), "inputPort", null, 0, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(piviDiagramEClass, PiviDiagram.class, "PiviDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPiviDiagram_Statements(), this.getStatement(), null, "statements", null, 0, -1, PiviDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPiviDiagram_Start(), this.getStart(), null, "start", null, 0, 1, PiviDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPiviDiagram_InputPort(), this.getInputPort(), null, "inputPort", null, 0, -1, PiviDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStart_StartPort(), this.getStartPort(), this.getStartPort_Start(), "startPort", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startPortEClass, StartPort.class, "StartPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartPort_Statement(), this.getStatement(), this.getStatement_Start(), "statement", null, 0, 1, StartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartPort_Start(), this.getStart(), this.getStart_StartPort(), "start", null, 0, 1, StartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Start(), this.getStartPort(), this.getStartPort_Statement(), "start", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Inputs(), this.getInputPort(), this.getInputPort_Statement(), "inputs", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Outputs(), this.getOutputPort(), this.getOutputPort_Statement(), "outputs", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEndEClass, WhileEnd.class, "WhileEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileStartEClass, WhileStart.class, "WhileStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhileStart_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, WhileStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threadEndEClass, ThreadEnd.class, "ThreadEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadStartEClass, ThreadStart.class, "ThreadStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreadStart_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, ThreadStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printStatementEClass, PrintStatement.class, "PrintStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrintStatement_Printlines(), ecorePackage.getEString(), "printlines", null, 0, 1, PrintStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(syncEndEClass, SyncEnd.class, "SyncEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(syncStartEClass, SyncStart.class, "SyncStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSyncStart_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, SyncStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PiviPackageImpl
