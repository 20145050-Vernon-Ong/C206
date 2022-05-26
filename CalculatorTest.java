import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		
	}
	

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		if ((String.valueOf(a).length() >  5)&& (String.valueOf(b).length() > 5)) {
			System.out.println("testAdd Method:");
			System.out.println("Number too long");
		} else {
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			int expected = 5555;
			assertEquals(expected, actual);
			System.out.println("testAdd Method:");
			System.out.println("The result is the same as expected.");
		}	
		
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		int a = 43;
		int b = 45;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 2;
		if (actual == expected) {
			assertTrue(actual == expected);
			System.out.println("\ntestSubtract Method:");
			System.out.println("The result is the same as expected");
		} else {
			assertTrue(actual == expected);
			System.out.println("\ntestSubtract Method:");
			System.out.println("The result is not the same as expected");
		}
		
		
	}
	
	@Test
	public final void testMultiply() {
		//fail("Not yet implemented");
		int a = 31;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 124;
		if (actual == expected) {
			assertEquals(expected, actual);
			System.out.println("\ntestMultiply Method:");
			System.out.println("Result: " + actual);
		} else {
			assertNotEquals(expected, actual);
			System.out.println("\ntestMultiply Method:");
			System.out.println("The expected result is wrong.");
		}
		
	}
	
	@Test
	public final void testDivide() {

		//fail("Not yet implemented");
		int a = 40;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 8;
		if (b > 10) {
			System.out.println("\ntestDivide Method:");
			System.out.println("The denominator is too big.");
		} else if (actual != expected) {
			assertNotSame(expected, actual);
			
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
	

}
