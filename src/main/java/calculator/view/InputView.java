package calculator.view;

import calculator.common.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputTarget() {
        String input = Console.readLine();
        validate(input);
        return input;
    }

    private void validate(final String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
