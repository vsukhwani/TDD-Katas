package com.calculator.operation;

public class ExponantOperation implements Operation {

	@Override
	public double calculate(double... args) {
		return new Double(Math.pow(args[1], args[0])).intValue();
	}
	
}
