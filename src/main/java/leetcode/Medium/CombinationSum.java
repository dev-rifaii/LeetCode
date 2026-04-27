package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), 0, target, candidates);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> path, int index, int remaining, int[] candidates) {
        if (remaining == 0) {
            results.add(new ArrayList<>(path));
            return;
        }

        if (remaining < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(results, path, i, remaining - candidates[i], candidates);
            path.removeLast();
        }
    }
}
