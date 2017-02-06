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
public interface IOutput {
    void write(Params params, double result);
    void write(String message);
}
