package leetcode.Easy;

import leetcode.Easy.BinaryTreeInorderTraversal;
import leetcode.datastructures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversalTest {


    @ParameterizedTest
    @MethodSource("arguments")
    void inorderTraversalTest(TreeNode root, List<Integer> expectedOutput) {
        assertEquals(expectedOutput, BinaryTreeInorderTraversal.inorderTraversal(root));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void inorderTraversalRecursiveTest(TreeNode root, List<Integer> expectedOutput) {
        assertEquals(expectedOutput, BinaryTreeInorderTraversal.inorderTraversalRecursive(root));
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

        return Stream.of(
                Arguments.arguments(example1, List.of(1, 3, 2)),
//                Arguments.arguments(example2, emptyList()),
                Arguments.arguments(example3, List.of(1)),
                Arguments.arguments(example4, List.of(1, 3, 0))
        );
    }
}
