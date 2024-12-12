package calculator.config;

import calculator.controller.CalculatorController;
import calculator.domain.Calculator;
import calculator.domain.DelimiterParser;
import calculator.domain.NumberParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class AppConfig {

    public CalculatorController controller() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Calculator calculator = calculator();
        return new CalculatorController(inputView, outputView, calculator);
    }

    public Calculator calculator() {
        return new Calculator(new DelimiterParser(), new NumberParser());
    }
}
