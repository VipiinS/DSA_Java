package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {
    public static void main(String[] args) {
        int[] arr = {14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12};
        System.out.println(combinationSum2(arr,27));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
//        System.out.println(Arrays.toString(candidates));
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(candidates,target,0, ans, result);
        return result;
    }

    private static void helper(int[] candidates, int target, int start, ArrayList<Integer> ans, ArrayList<List<Integer>> result) {
        if(target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if(start > candidates.length)
            return;

        for (int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(candidates[i]>target) continue;
            ans.add(candidates[i]);
            helper(candidates,target - candidates[i],i+1,ans,result);
            ans.remove(ans.size()-1);
        }
    }
}
