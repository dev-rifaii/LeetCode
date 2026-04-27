package leetcode.Medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CombinationSumTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testCombinationSum(int[] candidates, int target, List<List<Integer>> expected) {
        CombinationSum solution = new CombinationSum();

        List<List<Integer>> actual = solution.combinationSum(candidates, target);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                // Standard case
                arguments(
                        new int[]{2, 3, 6, 7},
                        7,
                        List.of(List.of(2, 2, 3), List.of(7))
                ),
                // Multiple combinations with same numbers
                arguments(
                        new int[]{2, 3, 5},
                        8,
                        List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5))
                ),

                // Target cannot be reached
                arguments(
                        new int[]{2},
                        1,
                        List.of()
                ),

                // Single element exactly matches target
                arguments(
                        new int[]{1},
                        1,
                        List.of(List.of(1))
                ),

                // Single element can be used multiple times
                arguments(
                        new int[]{1},
                        2,
                        List.of(List.of(1, 1))
                ),

                // Empty candidates
                arguments(
                        new int[]{},
                        8,
                        List.of()
                )
        );
    }
}
