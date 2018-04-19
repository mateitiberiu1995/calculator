package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class MultiplyTest {

	private Multiplier multiply;
	@Test
	public void test() {
		multiply= new Multiplier();
		int expectedValue=20;
		int actualValue=multiply.multiplying(4,5);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
