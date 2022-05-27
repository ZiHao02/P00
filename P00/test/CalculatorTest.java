import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import helloWorld.Calculator;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21041399, May 27, 2022 10:42:38 AM
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator calculator = new Calculator();
			int actual = calculator.add(a, b);
			int expected = 9999;
			assertEquals(expected, actual);
	}
	@Test
	public void testAddZero() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 0000;
		
			Calculator calculator = new Calculator();
			int actual = calculator.add(a, b);
			int expected = 1234;
			assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator calculator = new Calculator();
			int actual = calculator.subtract(a, b);
			int expected = -7531;
			assertEquals(expected, actual);
	}
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator calculator = new Calculator();
			int actual = calculator.multiple(a, b);
			int expected = 10816010;
			assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
			Calculator calculator = new Calculator();
			int actual = calculator.divide(a, b);
			int expected = 2;
			assertEquals(expected, actual);
	}

}
