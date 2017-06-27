package com.calculator.factory;

import org.junit.Assert;
import org.junit.Test;

import com.calculator.operation.AddOperation;
import com.calculator.operation.DivisionOperation;
import com.calculator.operation.ExponantOperation;
import com.calculator.operation.FactorialOperation;
import com.calculator.operation.MultiplyOperation;
import com.calculator.operation.PercentOperation;
import com.calculator.operation.SubstractOperation;

public class TestOperationFactory {
	

	@Test
	public void shouldProvideRightImplementationForOperatorAdd() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("+") instanceof AddOperation);
	}
	
	@Test
	public void shouldProvideRightImplementationForOperatorSubstract() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("-") instanceof SubstractOperation);
	}
	
	@Test
	public void shouldProvideRightImplementationForOperatorMultiply() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("*") instanceof MultiplyOperation);
	}
	
	@Test
	public void shouldProvideRightImplementationForOperatorDivision() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("/") instanceof DivisionOperation);
	}
	
	@Test
	public void shouldProvideRightImplementationForOperatorPercentage() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("%") instanceof PercentOperation);
	}
	
	@Test
	public void shouldProvideRightImplementationForOperatorExponant() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("^") instanceof ExponantOperation);
	}
	
	@Test
	public void shouldProvideRightImplementationForOperatorFactorial() throws Exception {
		Assert.assertTrue(OperationsFactory.getOperation("!") instanceof FactorialOperation);
	}

	

	
}
