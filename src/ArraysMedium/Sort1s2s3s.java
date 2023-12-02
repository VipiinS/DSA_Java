package ArraysMedium;

import java.util.Arrays;

public class Sort1s2s3s {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,0,1,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int l = 0,m = 0;
        int h = nums.length-1;

        while(m <= h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==1)    m++;
            else {
                swap(nums,m,h);
                h--;
            }
        }
    }

    public static void swap(int[] nums, int m, int h){
        int temp = nums[m];
        nums[m] = nums[h];
        nums[h] = temp;
    }

}
