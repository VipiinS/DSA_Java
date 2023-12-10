package arraysHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subArraySumZero {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
//        int i = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length -1;
            while(j < k){
                int sum = nums[i]+ nums[j] + nums[k];
                if(sum == 0) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    System.out.println(ans);
                    result.add(ans);j++;k--;
                        while(j<k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while (j<k && nums[k] == nums[k+1]) {
                        k--;
                    }
                }
                    else if(sum < 0) j++;
                    else k--;
            }

        }
        return result;
    }

}
