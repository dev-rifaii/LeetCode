package Easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void majorityElementTest(int[] nums, int expectedOutput) {
        assertEquals(MajorityElement.majorityElement(nums), expectedOutput);
    }

    static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments(new int[]{3, 2, 3}, 3),
                Arguments.arguments(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }
}
