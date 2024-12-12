package calculator.domain;

import java.util.List;

public class Calculator {

    private static final int DEFAULT_DELIMITER_COUNT = 2;
    private static final String SUFFIX = "\\n";

    private final DelimiterParser delimiterParser;
    private final NumberParser numberParser;

    public Calculator(DelimiterParser delimiterParser, NumberParser numberParser) {
        this.delimiterParser = delimiterParser;
        this.numberParser = numberParser;
    }

    public int calculate(final String input) {
        List<String> delimiters = delimiterParser.parse(input);
        String target = parseString(input, delimiters);
        List<Number> numbers = numberParser.parse(target, delimiters);
        return numbers.stream()
                .mapToInt(Number::getNumber)
                .sum();
    }

    private String parseString(final String input, final List<String> delimiters) {
        if (isContainCustomDelimiter(delimiters)) {
            int index = input.indexOf(SUFFIX);
            return input.substring(index + SUFFIX.length());
        }
        return input.trim();
    }

    private boolean isContainCustomDelimiter(final List<String> delimiters) {
        return delimiters.size() > DEFAULT_DELIMITER_COUNT;
    }
}
