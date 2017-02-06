/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.processor;

import calc.IProcessor;
import data.Params;

/**
 *
 * @author ryoji
 */
abstract class AbstractProcessor implements IProcessor {
    protected final Params params;
    public AbstractProcessor(Params params) {
        this.params = params;
    }
}
