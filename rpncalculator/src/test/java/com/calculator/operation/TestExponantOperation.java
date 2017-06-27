package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestExponantOperation {
	
	ExponantOperation exponantOperation = new ExponantOperation();
	
	
	@Test
	public void shouldProvideExponantOperation() throws Exception {
		Assert.assertEquals(9, exponantOperation.calculate(2, 3), 0);
	}

}
