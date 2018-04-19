package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class DivisionTest {

	Divider division;
	@Test
	public void test() {
		division=new Divider();
		int expectedValue=5;
		int actualValue=division.divide(20,4);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
