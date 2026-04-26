package leetcode.Easy;

import leetcode.datastructures.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class BinaryTreePathsTest {

    @ParameterizedTest
    @MethodSource("provideTrees")
    void testBinaryTreePaths(TreeNode root, List<String> expected) {
        BinaryTreePaths solution = new BinaryTreePaths();

        List<String> actual = solution.binaryTreePaths(root);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideTrees() {
        return Stream.of(
                // null tree
                arguments(null, List.of()),

                // single node
                arguments(new TreeNode(1), List.of("1")),

                //     1
                //    / \
                //   2   3
                //    \
                //     5
                arguments(
                        node(1,
                                node(2, null, node(5)),
                                node(3)
                        ),
                        List.of("1->2->5", "1->3")
                ),

                // left-skewed: 1 -> 2 -> 3
                arguments(
                        node(1,
                                node(2,
                                        node(3),
                                        null),
                                null
                        ),
                        List.of("1->2->3")
                ),

                // right-skewed: 1 -> 2 -> 3
                arguments(
                        node(1,
                                null,
                                node(2,
                                        null,
                                        node(3))
                        ),
                        List.of("1->2->3")
                )
        );
    }

    private static TreeNode node(int val) {
        return new TreeNode(val);
    }

    private static TreeNode node(int val, TreeNode left, TreeNode right) {
        TreeNode n = new TreeNode(val);
        n.left = left;
        n.right = right;
        return n;
    }
}