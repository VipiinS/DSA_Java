package ArraysMedium;

import java.util.Arrays;

public class AlternativePositiveNegative {

    public static void main(String[] args) {
        int[] arr = {4,-2,-1,-2,3,2};
//        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));


    }
//    public static int[] rearrangeArray(int[] nums) {
//        int p = 0;
//        int n = 0;
//
//        while(p < nums.length && n < nums.length){
//
//        }
//    }

    public static void swap(int[] nums, int m, int h){
        int temp = nums[m];
        nums[m] = nums[h];
        nums[h] = temp;
    }
}
