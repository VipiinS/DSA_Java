package ArraysMedium;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};

        System.out.println(buysell(nums));
    }

    private static int buysell(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            minPrice = Math.min(minPrice,nums[i]);
            maxProfit = Math.max(maxProfit,nums[i] - minPrice);


        }
        return maxProfit;
        }



}
