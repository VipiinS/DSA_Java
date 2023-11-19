package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumOne {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        System.out.println(combinationSum(arr,7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper1(candidates,target,0,ans,result);
        return result;
    }
    private static void helper1(int[] candidates, int target, int index, List<Integer> ans, List<List<Integer>> result){
        if(index == candidates.length) {
            return;
        }
        if (target == 0){
            result.add(new ArrayList<>(ans));
            return;
        }
        if(candidates[index] <= target){
            ans.add(candidates[index]);
            helper1(candidates,target - candidates[index],index,ans,result);
            ans.remove(ans.size()-1);
        }
        helper1(candidates,target,index + 1,ans,result);

    }

}
