package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberParserTest {

    private NumberParser numberParser = new NumberParser();

    @Test
    @DisplayName("숫자 파싱 테스트")
    void parseNumber() {
        String target = "1;2;3";
        List<String> delimiters = List.of(":", ",", ";");
        List<Number> numbers = numberParser.parse(target, delimiters);
        assertThat(3).isEqualTo(numbers.size());
    }
}
