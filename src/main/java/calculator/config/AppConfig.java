package calculator.config;

import calculator.controller.CalculatorController;
import calculator.domain.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class AppConfig {

    public CalculatorController controller() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Calculator calculator = new Calculator();
        return new CalculatorController(inputView, outputView, calculator);
    }
}
