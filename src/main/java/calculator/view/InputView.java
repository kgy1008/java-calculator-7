package calculator.view;

import calculator.common.ErrorMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputTarget() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        validate(input);
        return input;
    }

    private void validate(final String input) {
        if (input == null) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT.getMessage());
        }
    }
}
