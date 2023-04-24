package leetcode.Easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MinimumIndexSumOfTwoListsTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void findRestaurant(String[] list1, String[] list2, String[] expectedOutput) {
        assertArrayEquals(expectedOutput, MinimumIndexSumOfTwoLists.findRestaurant(list1, list2));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments(
                        new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                        new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"},
                        new String[]{"Shogun"}
                )
        );
    }
}
