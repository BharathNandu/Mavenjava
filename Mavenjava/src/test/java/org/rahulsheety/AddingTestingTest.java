package org.rahulsheety;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingTestingTest {
	
	private Calculator mycal = new Calculator();
	
	@Test
	public void addTwoPositiveNumbers() {
		int expectedResult = 30;
		int actualResult = mycal.add(10,20);
		//Assert.assertEquals("The the sum of two positive numbers is correct" , expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void addTwoNegativeNumbers()
	{
		int expectedResult = -30;
		int actualResult = mycal.add(-10, -20);
		//Assert.assertEquals("The the sum of two negative numbers is correct" , expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		

}
}
