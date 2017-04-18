/**
 */
package CodeBlockMM.tests;

import CodeBlockMM.CodeBlockMMFactory;
import CodeBlockMM.Codeblock;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Codeblock</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeblockTest extends TestCase {

	/**
	 * The fixture for this Codeblock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Codeblock fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CodeblockTest.class);
	}

	/**
	 * Constructs a new Codeblock test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeblockTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Codeblock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Codeblock fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Codeblock test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Codeblock getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CodeBlockMMFactory.eINSTANCE.createCodeblock());
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

} //CodeblockTest
