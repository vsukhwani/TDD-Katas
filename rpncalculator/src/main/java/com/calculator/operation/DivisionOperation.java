package com.calculator.operation;

public class DivisionOperation implements Operation {

	@Override
	public double calculate(double... args) {
		return args[1] / args[0];
	}

}
