/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import calc.processor.DividingProcessor;
import calc.processor.MultiplyingProcessor;
import calc.processor.SubstractingProcessor;
import calc.processor.SummingProcessor;
import data.Params;

/**
 *
 * @author ryoji
 */
public class ParamsParser implements IParser {

    @Override
    public IProcessor parse(Params params) {
        switch (params.getOperator()) {
            case '+':   return new SummingProcessor(params);
            case '-':   return new SubstractingProcessor(params);
            case 'x':   return new MultiplyingProcessor(params);
            case '/':   return new DividingProcessor(params);
            default:
                    throw new IllegalArgumentException(String.format("Invalid operator %c", params.getOperator()));
        }
    }
    
}
