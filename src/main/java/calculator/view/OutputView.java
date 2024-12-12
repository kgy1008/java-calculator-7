package calculator.view;

public class OutputView {

    public void printResult(final int result) {
        System.out.printf("결과 : %d", result);
    }

    public void printErrorMessage(final String message) {
        System.out.println(message);
    }
}
