/**
 */
package asu.ser.capstone.pivi.tests;

import asu.ser.capstone.pivi.PiviFactory;
import asu.ser.capstone.pivi.ThreadStart;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thread Start</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadStartTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreadStartTest.class);
	}

	/**
	 * Constructs a new Thread Start test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadStartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Thread Start test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThreadStart getFixture() {
		return (ThreadStart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createThreadStart());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ThreadStartTest
