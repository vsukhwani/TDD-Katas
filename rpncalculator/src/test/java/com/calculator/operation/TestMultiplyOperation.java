package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestMultiplyOperation {
	
	MultiplyOperation multiplyOperation = new MultiplyOperation();
	
	@Test
	public void shouldMultiplyTwoNumbers() throws Exception {
		Assert.assertEquals(21, multiplyOperation.calculate(7, 3), 0);
	}

}
