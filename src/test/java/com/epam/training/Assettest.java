package com.epam.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class Assettest {
	private int a = 1;
    private int b = 5;

	@Test
	public void test() {
		
	     
		boolean isASmallerThanB = a > b;
		//System.out.println("It's a smaller than b?" + (a < b));
		Assert.assertTrue("Is 'a' greater than 'b'" , isASmallerThanB);
		Assert.assertFalse("'a' is smaller than 'b'" , isASmallerThanB);
	}
	@Test
	public void testAssertEquals() {
		String expected = "aString";
		String actual = "anotherString";
		Assert.assertEquals(expected,  actual);
	
	}

}
