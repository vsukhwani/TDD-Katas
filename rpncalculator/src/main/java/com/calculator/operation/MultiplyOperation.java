package com.calculator.operation;

public class MultiplyOperation implements Operation{

	@Override
	public double calculate(double... args) {
		double i = 1;
		for (double j : args) {
			i = j*i;
		}
		return i;
	}
	
}
