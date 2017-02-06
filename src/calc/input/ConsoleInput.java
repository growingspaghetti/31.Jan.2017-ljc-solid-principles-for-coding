/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.input;

import data.Params;
//import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author ryoji
 */
public class ConsoleInput implements IInput {
//    private final Console console;
//    public ConsoleInput() {
//	console = System.console();
//    }
    
    @Override
    public Params getParams() {
        //final String line = console.readLine();
        System.out.println("write something..");
        Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        final String[] parts = line.split(" ");
        final double operand1 = Double.parseDouble(parts[0]);
        final double operand2 = Double.parseDouble(parts[2]);
        final char   operator = parts[1].charAt(0);
        return new Params(operand1, operand2, operator);
    }
}