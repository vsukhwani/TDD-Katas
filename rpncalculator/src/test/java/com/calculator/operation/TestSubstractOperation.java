package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestSubstractOperation {
	
	SubstractOperation substractOperation = new SubstractOperation();
	
	@Test
	public void shouldSubstractTwoNumbers() throws Exception {
		Assert.assertEquals(1, substractOperation.calculate(2, 3), 0);
	}
	
	@Test
	public void shouldReturnNegativeNumber() throws Exception {
		Assert.assertEquals(-1, substractOperation.calculate(3, 2), 0);
	}
	
	
}
