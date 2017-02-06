/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.output;

import data.Params;

/**
 *
 * @author ryoji
 */
public class ConsoleOutput implements IOutput {
    @Override
    public void write(Params params, double result) {
        System.out.printf("%f %c %f = %f\n",
                params.getOperand1(),
                params.getOperator(),
                params.getOperand2(),
                result);
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
