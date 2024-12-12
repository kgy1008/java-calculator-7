package calculator.domain;

import java.util.Arrays;
import java.util.List;

public class NumberParser {

    public List<Number> parse(final String target, final List<String> delimiters) {
        String regex = makeRegex(delimiters);
        return Arrays.stream(target.split(regex))
                .map(number -> new Number(number.trim()))
                .toList();
    }

    private String makeRegex(final List<String> delimiters) {
        StringBuilder regex = new StringBuilder();
        for (String delimiter : delimiters) {
            regex.append(delimiter).append("|");
        }
        return regex.substring(0, regex.length() - 1);
    }
}
