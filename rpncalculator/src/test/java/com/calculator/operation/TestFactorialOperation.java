package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestFactorialOperation {
	
	FactorialOperation factorialOperation = new FactorialOperation();
	
	
	@Test
	public void shouldProvideFactorialOperation() throws Exception {
		Assert.assertEquals(120, factorialOperation.calculate(5), 0);
	}

}
