package com.calculator.operation;

import org.junit.Assert;
import org.junit.Test;

public class TestPercentOperation {

	PercentOperation percentOperation = new PercentOperation();
	
	@Test
	public void shouldProvidePercentResult() throws Exception {
		Assert.assertEquals(.5, percentOperation.calculate(50), 0);
	}
}
