package Binary_search;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        searchRange(nums,8);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums, target, false);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        return ans;
    }
    public static int search(int[] nums,int target,boolean first){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target)
                end = mid -1;
            if(nums[mid]<target)
                start = mid + 1;
            else{
//                System.out.println("in else");
                if(first){
                    ans = mid;
//                    System.out.println(ans);
                    end = mid - 1;
                }
                else{
                    ans = mid;
                    start = mid + 1;
                }
            }

        }

        return ans;
    }

}
