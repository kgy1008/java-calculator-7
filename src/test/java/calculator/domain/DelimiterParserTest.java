package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DelimiterParserTest {

    private DelimiterParser delimiterParser = new DelimiterParser();

    @Test
    @DisplayName("커스텀 구분자 파싱 테스트")
    void parseCustomDelimiter() {
        String input = "//;\\n1;2;3";
        List<String> delimiters = delimiterParser.parse(input);
        assertThat(delimiters).contains(";");
        assertThat(delimiters).containsAll(List.of(";", ":", ","));
    }
}
