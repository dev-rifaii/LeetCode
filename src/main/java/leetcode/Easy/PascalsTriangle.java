package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            triangle.add(new ArrayList<>());
            List<Integer> currentList = triangle.get(i);
            for (int j = 0; j <= i; j++) {
                if (i < 2) {
                    currentList.add(1);
                } else {
                    List<Integer> previousList = triangle.get(i - 1);
                    if (j - 1 < 0 || j > previousList.size() - 1) {
                        currentList.add(1);
                    } else {
                        currentList.add(previousList.get(j - 1) + previousList.get(j));
                    }
                }
            }
        }
        return triangle;
    }
}
