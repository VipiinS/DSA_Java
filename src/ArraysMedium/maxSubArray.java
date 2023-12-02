package ArraysMedium;

public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {-5,-6,-6,-1};
        System.out.println(maxsubArray(nums));
    }

    private static int maxsubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        int tempMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            tempMax = Math.max(tempMax,nums[i]);
            if(sum <= 0) sum = 0;

            max = Math.max(max,sum);
        }
        return tempMax > 0 ? max : tempMax;

    }
}
