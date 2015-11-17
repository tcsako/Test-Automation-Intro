package com.epam.training;


import org.junit.Assert;
import org.junit.Test;

public class AssertionsTest {

	
	private int a = 1;
	private int b = 5;
	
	@Test
	public void testAssertTrue() {
	
		Assert.assertTrue("'a' is greater than 'b'", a < b);

	}

	@Test
	public void testAssertFalse() {

		
		
		Assert.assertFalse("'a' is smaller than 'b'", a > b);


	}
	
	@Test
	public void testAssertEquals() {

		
		String expected = "aString";
		String actual = "anotherString";
		Assert.assertEquals(expected, actual);


	}
	
}
