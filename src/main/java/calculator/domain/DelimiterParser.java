package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class DelimiterParser {

    private static final List<String> DEFAULT_DELIMITERS = List.of(",", ":");
    private static final String PREFIX = "//";
    private static final String SUFFIX = "\\n";

    public List<String> parse(final String input) {
        List<String> delimiters = new ArrayList<>(DEFAULT_DELIMITERS);
        if (isContainCustomDelimiter(input)) {
            String customDelimiter = input.substring(PREFIX.length(), input.indexOf(SUFFIX));
            delimiters.add(customDelimiter);
        }
        return delimiters;
    }

    private boolean isContainCustomDelimiter(final String input) {
        return input.contains(PREFIX) && input.contains(SUFFIX);
    }
}
