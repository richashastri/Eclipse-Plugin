/**
 */
package asu.ser.capstone.pivi.tests;

import asu.ser.capstone.pivi.PiviFactory;
import asu.ser.capstone.pivi.SyncStart;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sync Start</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SyncStartTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SyncStartTest.class);
	}

	/**
	 * Constructs a new Sync Start test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncStartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sync Start test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SyncStart getFixture() {
		return (SyncStart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PiviFactory.eINSTANCE.createSyncStart());
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

} //SyncStartTest
