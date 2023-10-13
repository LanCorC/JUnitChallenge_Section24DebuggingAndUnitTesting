import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTestParameterized_removePairs {
    private Utilities utilities;
    @BeforeEach
    void setup(){
        utilities = new Utilities();
    }

    public static Stream<Arguments> testInput() {
        return Stream.of(
                //Input, Expected
                Arguments.of("ABCDEFF", "ABCDEF"),
                Arguments.of("AB88EFFG", "AB8EFG"),

                Arguments.of("112233445566", "123456"),

                Arguments.of("ZYZQQB", "ZYZQB"),

                Arguments.of("A", "A")
        );
    }

    @ParameterizedTest
    @MethodSource("testInput")
    void removePairs(String input, String expected) {
        assertEquals(expected, utilities.removePairs(input));
    }
}
