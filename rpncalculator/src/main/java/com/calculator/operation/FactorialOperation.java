package com.calculator.operation;

public class FactorialOperation implements Operation {

	@Override
	public double calculate(double... args) {
		double result = 1;
	       for (double i = 1; i <= args[0]; i++) {
	           result = result * i;
	       }
	       return result;
	}
	
}
