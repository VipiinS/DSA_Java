package Recursion;

import java.util.ArrayList;

public class MaxSubset {

    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(helper2(arr));
    }


    public static void helper(int[] nums,ArrayList<Integer> ans,int maxSum,int index){
        if(index == nums.length){
            maxSum = Math.max(maxSum,total(ans));
            System.out.print(ans);
            System.out.print("   "+ maxSum);
            System.out.println();
            return;
        }

        ans.add(nums[index]);
        helper(nums,ans,maxSum,index+1);
        ans.remove(ans.size()-1);
        //right
        helper(nums,ans,maxSum,index+1);

    }
    public static int helper2(int[] nums){
        int currSum= nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i],currSum+nums[i]);
            max= Math.max(currSum,max);
        }
        return max;

    }

    private static int total(ArrayList<Integer> arr){
        int sum = 0;
        for (int num: arr) {
            sum+=num;
        }
        return sum;
    }
}
