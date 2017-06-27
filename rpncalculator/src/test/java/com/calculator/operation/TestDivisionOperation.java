package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestDivisionOperation {
	
	DivisionOperation divisionOperation = new DivisionOperation();
	
	
	@Test
	public void shouldDivideTwoNumbers() throws Exception {
		Assert.assertEquals(4, divisionOperation.calculate(3, 12), 0);
	}

}
