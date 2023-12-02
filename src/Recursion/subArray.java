package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subArray {
    public static void main(String[] args) {
        int[] nums = {4,-1,2,1,-5,4};
//        subArrays(nums, 0,new ArrayList<Integer>());
//        int maxSum = 0;
        int maxSum = subArrays(nums,0,nums.length,0);
        System.out.println(maxSum);
    }

    private static void subArrays(int[] nums, int start,ArrayList<Integer> ans) {

        for (int i = start; i < nums.length; i++) {
            ans.add(nums[start]);
            subArrays(nums,start+1,ans);
            System.out.println(ans);
            ans.remove(ans.size()-1);
        }
    }

    private static int subArrays(int[]nums,int start, int end,int maxSum){
//        if(start>=end) return;
        for (int i = start; i < end; i++) {
            int total = findTotal(nums,start,end);
            maxSum = Math.max(maxSum,total);
            System.out.print(maxSum);
            System.out.println("-> " + Arrays.toString(Arrays.copyOfRange(nums,start,end)));
            subArrays(nums,start+1,end,maxSum);
        }
        return maxSum;
    }

    private static int findTotal(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum+=nums[i];
        }
        return sum;
    }
}
