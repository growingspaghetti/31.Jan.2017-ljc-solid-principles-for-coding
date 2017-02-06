/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.processor;

import data.Params;

/**
 *
 * @author ryoji
 */
public class SubstractingProcessor extends AbstractProcessor {
    public SubstractingProcessor(Params params) {
        super(params);
    }
    @Override
    public double apply() {
        return params.getOperand1() - params.getOperand2();
    }
}
