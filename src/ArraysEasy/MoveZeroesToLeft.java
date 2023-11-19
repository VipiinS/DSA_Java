package ArraysEasy;

import java.util.Arrays;

public class MoveZeroesToLeft {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0,3,2,0,0,4,0};
        System.out.println(Arrays.toString(moveZeroes(arr)));

    }
    public static int[] moveZeroes(int[] nums) {
        if(nums.length == 1)
            return nums;
        int l = 0 , r = 0;
        while(r<nums.length){
            if (nums[r] == 0) {
//                l++;
                r++;
            }
            else if(nums[r] != 0){
                nums[l++] = nums[r++];
            }
            else if (nums[r] == 0)
                r++;
        }
//        l++;
        while(l < nums.length)
            nums[l++] = 0;
        return nums;
    }
}

