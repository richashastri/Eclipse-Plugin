/**
 */
package asu.ser.capstone.pivi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see asu.ser.capstone.pivi.PiviFactory
 * @model kind="package"
 * @generated
 */
public interface PiviPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pivi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///asu/ser/capstone/pivi.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asu.ser.capstone.pivi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PiviPackage eINSTANCE = asu.ser.capstone.pivi.impl.PiviPackageImpl.init();

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StatementImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__START = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__OUTPUTS = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.IfEndImpl <em>If End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.IfEndImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfEnd()
	 * @generated
	 */
	int IF_END = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>If End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_END_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.IfStartImpl <em>If Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.IfStartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfStart()
	 * @generated
	 */
	int IF_START = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>If Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_START_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.InputPortImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__OUTPUT_PORT = 1;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.InstructionImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INSTRUCTIONS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.MethodEndImpl <em>Method End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.MethodEndImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getMethodEnd()
	 * @generated
	 */
	int METHOD_END = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_END__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_END__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_END__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Method End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_END_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_END_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.MethodStartImpl <em>Method Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.MethodStartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getMethodStart()
	 * @generated
	 */
	int METHOD_START = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_START__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_START__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_START__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_START__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_START_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_START_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.OutputPortImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__INPUT_PORT = 1;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.PiviDiagramImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getPiviDiagram()
	 * @generated
	 */
	int PIVI_DIAGRAM = 7;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM__START = 1;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM__INPUT_PORT = 2;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIVI_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStart()
	 * @generated
	 */
	int START = 8;

	/**
	 * The feature id for the '<em><b>Start Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__START_PORT = 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.StartPortImpl <em>Start Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.StartPortImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStartPort()
	 * @generated
	 */
	int START_PORT = 9;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PORT__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PORT__START = 1;

	/**
	 * The number of structural features of the '<em>Start Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Start Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.WhileEndImpl <em>While End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.WhileEndImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileEnd()
	 * @generated
	 */
	int WHILE_END = 11;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_END__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_END__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_END__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>While End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_END_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_END_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.WhileStartImpl <em>While Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.WhileStartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileStart()
	 * @generated
	 */
	int WHILE_START = 12;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_START__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_START__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_START__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_START__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_START_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_START_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.ThreadEndImpl <em>Thread End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.ThreadEndImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getThreadEnd()
	 * @generated
	 */
	int THREAD_END = 13;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_END__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_END__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_END__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Thread End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_END_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thread End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_END_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asu.ser.capstone.pivi.impl.ThreadStartImpl <em>Thread Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asu.ser.capstone.pivi.impl.ThreadStartImpl
	 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getThreadStart()
	 * @generated
	 */
	int THREAD_START = 14;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_START__START = STATEMENT__START;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_START__INPUTS = STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_START__OUTPUTS = STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_START__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thread Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_START_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Thread Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_START_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.IfEnd <em>If End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If End</em>'.
	 * @see asu.ser.capstone.pivi.IfEnd
	 * @generated
	 */
	EClass getIfEnd();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.IfStart <em>If Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Start</em>'.
	 * @see asu.ser.capstone.pivi.IfStart
	 * @generated
	 */
	EClass getIfStart();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.IfStart#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see asu.ser.capstone.pivi.IfStart#getCondition()
	 * @see #getIfStart()
	 * @generated
	 */
	EAttribute getIfStart_Condition();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see asu.ser.capstone.pivi.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for the container reference '{@link asu.ser.capstone.pivi.InputPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.InputPort#getStatement()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.InputPort#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see asu.ser.capstone.pivi.InputPort#getOutputPort()
	 * @see #getInputPort()
	 * @generated
	 */
	EReference getInputPort_OutputPort();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see asu.ser.capstone.pivi.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.Instruction#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see asu.ser.capstone.pivi.Instruction#getInstructions()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Instructions();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.MethodEnd <em>Method End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method End</em>'.
	 * @see asu.ser.capstone.pivi.MethodEnd
	 * @generated
	 */
	EClass getMethodEnd();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.MethodStart <em>Method Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Start</em>'.
	 * @see asu.ser.capstone.pivi.MethodStart
	 * @generated
	 */
	EClass getMethodStart();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.MethodStart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asu.ser.capstone.pivi.MethodStart#getName()
	 * @see #getMethodStart()
	 * @generated
	 */
	EAttribute getMethodStart_Name();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see asu.ser.capstone.pivi.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for the container reference '{@link asu.ser.capstone.pivi.OutputPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.OutputPort#getStatement()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.OutputPort#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see asu.ser.capstone.pivi.OutputPort#getInputPort()
	 * @see #getOutputPort()
	 * @generated
	 */
	EReference getOutputPort_InputPort();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.PiviDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram
	 * @generated
	 */
	EClass getPiviDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.PiviDiagram#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram#getStatements()
	 * @see #getPiviDiagram()
	 * @generated
	 */
	EReference getPiviDiagram_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link asu.ser.capstone.pivi.PiviDiagram#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram#getStart()
	 * @see #getPiviDiagram()
	 * @generated
	 */
	EReference getPiviDiagram_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.PiviDiagram#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Port</em>'.
	 * @see asu.ser.capstone.pivi.PiviDiagram#getInputPort()
	 * @see #getPiviDiagram()
	 * @generated
	 */
	EReference getPiviDiagram_InputPort();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the reference list '{@link asu.ser.capstone.pivi.Start#getStartPort <em>Start Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start Port</em>'.
	 * @see asu.ser.capstone.pivi.Start#getStartPort()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_StartPort();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.StartPort <em>Start Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Port</em>'.
	 * @see asu.ser.capstone.pivi.StartPort
	 * @generated
	 */
	EClass getStartPort();

	/**
	 * Returns the meta object for the container reference '{@link asu.ser.capstone.pivi.StartPort#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.StartPort#getStatement()
	 * @see #getStartPort()
	 * @generated
	 */
	EReference getStartPort_Statement();

	/**
	 * Returns the meta object for the reference '{@link asu.ser.capstone.pivi.StartPort#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.StartPort#getStart()
	 * @see #getStartPort()
	 * @generated
	 */
	EReference getStartPort_Start();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see asu.ser.capstone.pivi.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.Statement#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getStart()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.Statement#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getInputs()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link asu.ser.capstone.pivi.Statement#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see asu.ser.capstone.pivi.Statement#getOutputs()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Outputs();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.WhileEnd <em>While End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While End</em>'.
	 * @see asu.ser.capstone.pivi.WhileEnd
	 * @generated
	 */
	EClass getWhileEnd();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.WhileStart <em>While Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Start</em>'.
	 * @see asu.ser.capstone.pivi.WhileStart
	 * @generated
	 */
	EClass getWhileStart();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.WhileStart#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see asu.ser.capstone.pivi.WhileStart#getCondition()
	 * @see #getWhileStart()
	 * @generated
	 */
	EAttribute getWhileStart_Condition();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.ThreadEnd <em>Thread End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread End</em>'.
	 * @see asu.ser.capstone.pivi.ThreadEnd
	 * @generated
	 */
	EClass getThreadEnd();

	/**
	 * Returns the meta object for class '{@link asu.ser.capstone.pivi.ThreadStart <em>Thread Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread Start</em>'.
	 * @see asu.ser.capstone.pivi.ThreadStart
	 * @generated
	 */
	EClass getThreadStart();

	/**
	 * Returns the meta object for the attribute '{@link asu.ser.capstone.pivi.ThreadStart#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see asu.ser.capstone.pivi.ThreadStart#getCondition()
	 * @see #getThreadStart()
	 * @generated
	 */
	EAttribute getThreadStart_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PiviFactory getPiviFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.IfEndImpl <em>If End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.IfEndImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfEnd()
		 * @generated
		 */
		EClass IF_END = eINSTANCE.getIfEnd();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.IfStartImpl <em>If Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.IfStartImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getIfStart()
		 * @generated
		 */
		EClass IF_START = eINSTANCE.getIfStart();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_START__CONDITION = eINSTANCE.getIfStart_Condition();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.InputPortImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__STATEMENT = eINSTANCE.getInputPort_Statement();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PORT__OUTPUT_PORT = eINSTANCE.getInputPort_OutputPort();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.InstructionImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__INSTRUCTIONS = eINSTANCE.getInstruction_Instructions();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.MethodEndImpl <em>Method End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.MethodEndImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getMethodEnd()
		 * @generated
		 */
		EClass METHOD_END = eINSTANCE.getMethodEnd();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.MethodStartImpl <em>Method Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.MethodStartImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getMethodStart()
		 * @generated
		 */
		EClass METHOD_START = eINSTANCE.getMethodStart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_START__NAME = eINSTANCE.getMethodStart_Name();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.OutputPortImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__STATEMENT = eINSTANCE.getOutputPort_Statement();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PORT__INPUT_PORT = eINSTANCE.getOutputPort_InputPort();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.PiviDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.PiviDiagramImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getPiviDiagram()
		 * @generated
		 */
		EClass PIVI_DIAGRAM = eINSTANCE.getPiviDiagram();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVI_DIAGRAM__STATEMENTS = eINSTANCE.getPiviDiagram_Statements();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVI_DIAGRAM__START = eINSTANCE.getPiviDiagram_Start();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIVI_DIAGRAM__INPUT_PORT = eINSTANCE.getPiviDiagram_InputPort();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StartImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Start Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__START_PORT = eINSTANCE.getStart_StartPort();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StartPortImpl <em>Start Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StartPortImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStartPort()
		 * @generated
		 */
		EClass START_PORT = eINSTANCE.getStartPort();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_PORT__STATEMENT = eINSTANCE.getStartPort_Statement();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_PORT__START = eINSTANCE.getStartPort_Start();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.StatementImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__START = eINSTANCE.getStatement_Start();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__INPUTS = eINSTANCE.getStatement_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__OUTPUTS = eINSTANCE.getStatement_Outputs();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.WhileEndImpl <em>While End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.WhileEndImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileEnd()
		 * @generated
		 */
		EClass WHILE_END = eINSTANCE.getWhileEnd();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.WhileStartImpl <em>While Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.WhileStartImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getWhileStart()
		 * @generated
		 */
		EClass WHILE_START = eINSTANCE.getWhileStart();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE_START__CONDITION = eINSTANCE.getWhileStart_Condition();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.ThreadEndImpl <em>Thread End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.ThreadEndImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getThreadEnd()
		 * @generated
		 */
		EClass THREAD_END = eINSTANCE.getThreadEnd();

		/**
		 * The meta object literal for the '{@link asu.ser.capstone.pivi.impl.ThreadStartImpl <em>Thread Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asu.ser.capstone.pivi.impl.ThreadStartImpl
		 * @see asu.ser.capstone.pivi.impl.PiviPackageImpl#getThreadStart()
		 * @generated
		 */
		EClass THREAD_START = eINSTANCE.getThreadStart();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD_START__CONDITION = eINSTANCE.getThreadStart_Condition();

	}

} //PiviPackage
