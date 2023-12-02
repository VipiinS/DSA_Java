package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOne {
    public static void main(String[] args) {
        int[] arr = {-3,4,-1,2,1,-5};
        System.out.println(subsets(arr));

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,0,new ArrayList<>(), result);
        return result;
    }

    private static void helper(int[] nums,int index,List<Integer> ans,List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        //left
        ans.add(nums[index]);
        helper(nums,index+1,ans,result);
        ans.remove(ans.size()-1);
        //right
        helper(nums,index+1,ans,result);

    }

}
