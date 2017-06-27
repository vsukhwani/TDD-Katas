package com.calculator.factory;

import java.util.HashMap;

import com.calculator.operation.AddOperation;
import com.calculator.operation.DivisionOperation;
import com.calculator.operation.ExponantOperation;
import com.calculator.operation.FactorialOperation;
import com.calculator.operation.MultiplyOperation;
import com.calculator.operation.Operation;
import com.calculator.operation.PercentOperation;
import com.calculator.operation.SubstractOperation;

public class OperationsFactory {
	
	public static HashMap<String, Operation> operations = new HashMap<String, Operation>();;
	
	static{
		operations.put("+", new AddOperation());
		operations.put("-", new SubstractOperation());
		operations.put("*", new MultiplyOperation());
		operations.put("/", new DivisionOperation());
		operations.put("^", new ExponantOperation());
		operations.put("%", new PercentOperation());
		operations.put("!", new FactorialOperation());
	}
	
	public static Operation getOperation(String oprator){
		return operations.get(oprator);
	}
	
}
