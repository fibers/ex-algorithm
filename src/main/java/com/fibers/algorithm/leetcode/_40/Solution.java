package com.fibers.algorithm.leetcode._40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 5, 2, 1, 2};

        Solution s = new Solution();
        System.out.println(s.combinationSum2(candidates, 5));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(candidates);
        backtracking(result, list, candidates, target, 0);

        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            result.add(new ArrayList<Integer>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                list.add(candidates[i]);
                backtracking(result, list, candidates, target - candidates[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
