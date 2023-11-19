package ArraysEasy;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4};
        System.out.println(check(arr));
    }
    public static  boolean check(int[] nums) {
        if(nums.length <=2) return true;
        int flag = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1])
                flag++;
        }
        if(flag == 1) return nums[0]>=nums[nums.length-1];
        return flag<1;
    }
}
