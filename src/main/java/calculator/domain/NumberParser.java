package calculator.domain;

import java.util.Arrays;
import java.util.List;

public class NumberParser {

    public List<Number> parse(final String target, final List<String> delimiters) {
        String regex = makeRegex(delimiters);
        return Arrays.stream(target.split(regex))
                .filter(number -> !number.isBlank())
                .map(number -> new Number(number.trim()))
                .toList();
    }

    private String makeRegex(final List<String> delimiters) {
        return String.join("|", delimiters);
    }
}
