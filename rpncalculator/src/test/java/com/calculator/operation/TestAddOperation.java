package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestAddOperation {
	
	AddOperation addOperation = new AddOperation();
	
	@Test
	public void shouldAddTwoNumbers() throws Exception {
		
		Assert.assertEquals(5, addOperation.calculate(2 ,3), 0);
	}
	
	@Test
	public void shouldAddThreeNumbers() throws Exception {
		
		Assert.assertEquals(9, addOperation.calculate(2 ,3, 4), 0);
	}

}
