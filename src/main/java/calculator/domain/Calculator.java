package calculator.domain;

public class Calculator {

    private final DelimiterParser delimiterParser;
    private final NumberParser numberParser;

    public Calculator(DelimiterParser delimiterParser, NumberParser numberParser) {
        this.delimiterParser = delimiterParser;
        this.numberParser = numberParser;
    }

    public void calculate(final String input) {

    }
}
