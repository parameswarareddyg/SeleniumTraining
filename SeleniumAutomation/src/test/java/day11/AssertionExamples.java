package day11;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionExamples {

	public static void main(String[] args) {
		//Hard Assertions
		/*
		 * Assert.assertEquals(10, 10);
		 * System.out.println("Execution 1 step completed"); Assert.assertNotEquals(10,
		 * 11); System.out.println("Execution 2 step completed");
		 * Assert.assertTrue(10==10); System.out.println("Execution 3 step completed");
		 * Assert.assertFalse(10==10); System.out.println("Execution 4 step completed");
		 * Assert.assertNull(null); System.out.println("Execution 5 step completed");
		 * Assert.assertNotNull(10); System.out.println("Execution 6 step completed");
		 */
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(10, 110);
		System.out.println("step 1");
		softAssert.assertNotEquals("Paramesh", "Lokesh");
		System.out.println("step 2");
		softAssert.assertTrue("paramesh".equals("paramesh"));
		System.out.println("step 3");
		softAssert.assertFalse("paramesh".equals("Paramesh"));
		System.out.println("step 4");
		softAssert.assertNull(null);
		System.out.println("step 5");
		softAssert.assertNotNull("Rajesh");
		System.out.println("step 6");
		System.out.println("step 7");
		softAssert.assertAll();
		
	}
	

}
