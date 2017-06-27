package com.calculator;

import java.util.Stack;

import com.calculator.factory.OperationsFactory;

public class RPNCalculator implements Calculator {
	
	public double calculate(String expression){
		
		double returnValue = 0;
		Stack<Double> stack = new Stack<Double>();
 
		for (String operator : expression.split(" ")) {
			if (!isValidOperator(operator)) { 
				stack.push(new Double(operator));
			} else {
				if(operator.equals("%") || operator.equals("!")){
					Double a = Double.valueOf(stack.pop());
					stack.push(OperationsFactory.getOperation(operator).calculate(a));
				}else{
					double a = stack.pop();
					double b = stack.pop();
					stack.push(OperationsFactory.getOperation(operator).calculate(a,b));
				}
			}
		}
		returnValue = stack.pop();
		return returnValue;
		
	}

	private boolean isValidOperator(String operator) {
		return OperationsFactory.operations.containsKey(operator);
	}
	
}
