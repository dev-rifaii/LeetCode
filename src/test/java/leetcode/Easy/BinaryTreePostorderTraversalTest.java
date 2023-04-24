package leetcode.Easy;

import leetcode.datastructures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePostorderTraversalTest {

    @ParameterizedTest
    @MethodSource("arguments")
    void postorderTraversal(TreeNode root, List<Integer> expectedOutput) {
//        assertEquals(expectedOutput, BinaryTreePostorderTraversal.postorderTraversal(root));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void postorderTraversalRecursive(TreeNode root, List<Integer> expectedOutput) {
        assertEquals(expectedOutput, BinaryTreePostorderTraversal.postorderTraversalRecursive(root));
    }

    static Stream<Arguments> arguments() {
        TreeNode example1 = new TreeNode(
                1, null, new TreeNode(
                2, new TreeNode(
                3), null));

        //Passes on LC and fails Locally
        TreeNode example2 = new TreeNode();
        TreeNode example3 = new TreeNode(1);
        TreeNode example4 = new TreeNode(
                1, null, new TreeNode(
                0, new TreeNode(
                3), null));
        TreeNode example5 = new TreeNode(
                0, null, new TreeNode(
                2, new TreeNode(
                3
        ), null));

        TreeNode example6 = new TreeNode(
                3, new TreeNode(
                1), new TreeNode(
                2)
        );

        TreeNode example7 = new TreeNode(
                3, new TreeNode(
                1, null, new TreeNode(
                2
        )
        ), null);

        return Stream.of(
                Arguments.arguments(example1, List.of(3, 2, 1)),
//                Arguments.arguments(example2, emptyList()),
                Arguments.arguments(example3, List.of(1)),
                Arguments.arguments(example4, List.of(3, 0, 1)),
                Arguments.arguments(example5, List.of(3, 2, 0)),
                Arguments.arguments(example6, List.of(1, 2, 3)),
                Arguments.arguments(example7, List.of(2, 1, 3))
        );
    }
}
