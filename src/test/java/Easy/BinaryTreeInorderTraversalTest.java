package Easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInorderTraversalTest {


    @ParameterizedTest
    @MethodSource("arguments")
    void inorderTraversalTest(BinaryTreeInorderTraversal.TreeNode root, List<Integer> expectedOutput) {
        assertEquals(expectedOutput, BinaryTreeInorderTraversal.inorderTraversal(root));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void inorderTraversalRecursiveTest(BinaryTreeInorderTraversal.TreeNode root, List<Integer> expectedOutput) {
        assertEquals(expectedOutput, BinaryTreeInorderTraversal.inorderTraversalRecursive(root));
    }

    static Stream<Arguments> arguments() {
        BinaryTreeInorderTraversal.TreeNode example1 = new BinaryTreeInorderTraversal.TreeNode(
                1, null, new BinaryTreeInorderTraversal.TreeNode(
                2, new BinaryTreeInorderTraversal.TreeNode(
                3), null));

        //Passes on LC and fails Locally
        BinaryTreeInorderTraversal.TreeNode example2 = new BinaryTreeInorderTraversal.TreeNode();
        BinaryTreeInorderTraversal.TreeNode example3 = new BinaryTreeInorderTraversal.TreeNode(1);
        BinaryTreeInorderTraversal.TreeNode example4 = new BinaryTreeInorderTraversal.TreeNode(
                1, null, new BinaryTreeInorderTraversal.TreeNode(
                0, new BinaryTreeInorderTraversal.TreeNode(
                3), null));

        return Stream.of(
                Arguments.arguments(example1, List.of(1, 3, 2)),
//                Arguments.arguments(example2, emptyList()),
                Arguments.arguments(example3, List.of(1)),
                Arguments.arguments(example4, List.of(1, 3, 0))
        );
    }
}
