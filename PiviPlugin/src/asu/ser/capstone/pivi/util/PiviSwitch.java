/**
 */
package asu.ser.capstone.pivi.util;

import asu.ser.capstone.pivi.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see asu.ser.capstone.pivi.PiviPackage
 * @generated
 */
public class PiviSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PiviPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiviSwitch() {
		if (modelPackage == null) {
			modelPackage = PiviPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PiviPackage.IF_END: {
				IfEnd ifEnd = (IfEnd)theEObject;
				T result = caseIfEnd(ifEnd);
				if (result == null) result = caseStatement(ifEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.IF_START: {
				IfStart ifStart = (IfStart)theEObject;
				T result = caseIfStart(ifStart);
				if (result == null) result = caseStatement(ifStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = caseStatement(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.METHOD_END: {
				MethodEnd methodEnd = (MethodEnd)theEObject;
				T result = caseMethodEnd(methodEnd);
				if (result == null) result = caseStatement(methodEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.METHOD_START: {
				MethodStart methodStart = (MethodStart)theEObject;
				T result = caseMethodStart(methodStart);
				if (result == null) result = caseStatement(methodStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.PIVI_DIAGRAM: {
				PiviDiagram piviDiagram = (PiviDiagram)theEObject;
				T result = casePiviDiagram(piviDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.START_PORT: {
				StartPort startPort = (StartPort)theEObject;
				T result = caseStartPort(startPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.WHILE_END: {
				WhileEnd whileEnd = (WhileEnd)theEObject;
				T result = caseWhileEnd(whileEnd);
				if (result == null) result = caseStatement(whileEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.WHILE_START: {
				WhileStart whileStart = (WhileStart)theEObject;
				T result = caseWhileStart(whileStart);
				if (result == null) result = caseStatement(whileStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.THREAD_END: {
				ThreadEnd threadEnd = (ThreadEnd)theEObject;
				T result = caseThreadEnd(threadEnd);
				if (result == null) result = caseStatement(threadEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.THREAD_START: {
				ThreadStart threadStart = (ThreadStart)theEObject;
				T result = caseThreadStart(threadStart);
				if (result == null) result = caseStatement(threadStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.PRINT_STATEMENT: {
				PrintStatement printStatement = (PrintStatement)theEObject;
				T result = casePrintStatement(printStatement);
				if (result == null) result = caseStatement(printStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.SYNC_END: {
				SyncEnd syncEnd = (SyncEnd)theEObject;
				T result = caseSyncEnd(syncEnd);
				if (result == null) result = caseStatement(syncEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PiviPackage.SYNC_START: {
				SyncStart syncStart = (SyncStart)theEObject;
				T result = caseSyncStart(syncStart);
				if (result == null) result = caseStatement(syncStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfEnd(IfEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStart(IfStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodEnd(MethodEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodStart(MethodStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiviDiagram(PiviDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPort(StartPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileEnd(WhileEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStart(WhileStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadEnd(ThreadEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thread Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thread Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadStart(ThreadStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintStatement(PrintStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncEnd(SyncEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncStart(SyncStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PiviSwitch
