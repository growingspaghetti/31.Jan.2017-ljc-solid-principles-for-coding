package calc;

import calc.output.IOutput;
import calc.input.IInput;
import data.Params;

public class Calculator {

    private final IInput iInput;
    private final IOutput iOutput;
    private final IParser iParser = new ParamsParser();

    public Calculator(IInput iInput, IOutput iOutput) {
        this.iInput = iInput;
        this.iOutput = iOutput;
    }

    public void run() {
        try {
            final Params params = iInput.getParams();
            final double result = iParser.parse(params)/*returns processor*/.apply();
            iOutput.write(params, result);
        } catch (Exception ex) {
            iOutput.write(ex.toString());
        }
    }
}
