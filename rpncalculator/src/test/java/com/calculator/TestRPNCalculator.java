package com.calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestRPNCalculator {
	
	
	@Test
	public void shouldReturnValueForAdditionAndSubstractionOperator(){
		Assert.assertEquals(-4, new RPNCalculator().calculate("1 2 3 + -"), 0);
	}
	
	@Test
	public void shouldReturnValueForMultiplicationAndDivisionOperation(){
		Assert.assertEquals(4, new RPNCalculator().calculate("6 2 * 3 /"), 0);
	}
	
	@Test
	public void shouldReturnValueForExponantOperation(){
		Assert.assertEquals(17, new RPNCalculator().calculate("2 3 ^ 4 5 + +"), 0);
	}
	
	@Test
	public void shouldReturnValueForPercentageOperator(){
		Assert.assertEquals(1, new RPNCalculator().calculate("50 % 2 *"), 0);
	}
	
	
	@Test
	public void shouldReturnValueForFactorialOperator(){
		Assert.assertEquals(26, new RPNCalculator().calculate("3 ! 4 5 * +"), 0);
	}
	
	
	@Test
	public void shouldReturnValueForDivisionAndFactorialOperator(){
		Assert.assertEquals(24, new RPNCalculator().calculate("12 3 / !"), 0);
	}
	
	
	
	

}
