package calculator.domain;

import calculator.common.ErrorMessage;

public class Number {

    private final int number;

    public Number(final String input) {
        int number = convertToInt(input);
        validatePositiveRange(number);
        this.number = number;
    }

    private void validatePositiveRange(final int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_RANGE.getMessage());
        }
    }

    private int convertToInt(final String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_TYPE.getMessage());
        }
    }
}
