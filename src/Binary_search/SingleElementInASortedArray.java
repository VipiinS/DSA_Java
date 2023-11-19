package Binary_search;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,8,8};
//        System.out.println(search(nums));
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            if(mid % 2 == 0 && nums[mid] == nums[mid+1] || mid % 2 == 1 && nums[mid] == nums[mid-1])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static int search(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            double mean = CalculateMean(nums, start, end);
            int mid = start + (end - start) / 2;

//            System.out.println("mean" + mean);
            if (nums[mid] < mean)
                end = mid;
            else if (nums[mid] > mean)
                start = mid;
//            System.out.println(nums[mid]+ " "+mean);
            if((nums[mid]) == (int)mean) {
                return nums[mid];
            }
        }
        return -1;
    }

    private static double CalculateMean(int[] nums, int start, int end) {
        int sum = 0;
        int length = end - start + 1;
        for(int i = start; i <= end ;i++){
            sum+=nums[i];
        }
//        System.out.println(sum + "+" + length );
        return (double)sum/length;
    }

}
