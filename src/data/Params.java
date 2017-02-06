package data;

import java.util.Arrays;
import java.util.List;

public class Params {
	private final double operand1;
	private final double operand2;
	private final char operation;
	private final List<Character> validOps = Arrays.asList('+','-','x','/');
	
	public Params(double operand1, double operand2, char operation) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		if (validOps.contains(operation)){
			this.operation = operation;
		} else {
			throw new IllegalArgumentException(String.format("Invalid operation %c. Should be +,-,x or /", operation));
		}
	}
	
	public double getOperand1() {
		return this.operand1;
	}
	
	public double getOperand2() {
		return this.operand2;
	}
	
	public char getOperator() {
		return this.operation;
	}
}
