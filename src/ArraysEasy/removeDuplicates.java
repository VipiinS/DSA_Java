package ArraysEasy;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicatesInaArray(nums));
        System.out.println(Arrays.toString(nums));
    }
     static int removeDuplicatesInaArray(int[] nums) {
        if(nums.length == 1) return 1;
        int l = 0;
        int r = 1;

        while(r< nums.length){
            if(nums[r] == nums[r-1])
                r++;
            if(nums[r] != nums[r-1]){
                nums[++l] = nums[r++];
            }
        }
        return l+1;
    }
}
