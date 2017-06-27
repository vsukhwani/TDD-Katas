package com.calculator.operation;

public class PercentOperation implements Operation{

	@Override
	public double calculate(double... args) {
		return args[0]/100;
	}

}
