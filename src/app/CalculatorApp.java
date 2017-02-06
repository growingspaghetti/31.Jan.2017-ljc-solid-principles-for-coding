package app;

import calc.Calculator;
import calc.input.ConsoleInput;
import calc.output.ConsoleOutput;
import calc.input.IInput;
import calc.output.IOutput;

public class CalculatorApp {
    public static void main(String[] args) {
        IInput  inputImpl  = new ConsoleInput();
        IOutput outputImpl = new ConsoleOutput();
        new Calculator(inputImpl, outputImpl).run();
    }
}
