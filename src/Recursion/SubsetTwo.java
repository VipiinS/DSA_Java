package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetTwo {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,5};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,0,new ArrayList<>(), result);
        return result;
    }

    private static void helper(int[] nums,int index, ArrayList<Integer> ans, List<List<Integer>> result) {
            result.add(new ArrayList<>(ans));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            ans.add(nums[i]);
            helper(nums, i + 1, ans, result);
            ans.remove(ans.size()-1);
        }
    }

}
