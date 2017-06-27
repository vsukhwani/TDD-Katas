package com.calculator.operation;

public class AddOperation implements Operation {

	@Override
	public double calculate(double... args) {
		double i = 0;
		for (double j : args) {
			i = i + j;
		}
		return i;
	}

}
