package ArraysMedium;

public class countSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        int k = 6;
        System.out.println(subarraySum(arr,k));
    }

    public static int subarraySum(int[] arr, int num) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while (left < arr.length) {
            // if window's leading edge has NOT reached the end of the array
            // AND window's values do NOT add up to num, grow window to right
            if (right < arr.length && sum < num) {
                // increase sum by the value at window's leading edge
                sum += arr[right];
                // increment window's leading edge to grow window
                right++;
            } else if (sum >= num) {
                // if window's values DO add up to AT LEAST num, shrink window from left
                // update smallest subarray length to the lesser of current minLen or window's length
//                minLen = Math.min(minLen, right - left)
                // decrease sum by the value at window's trailing edge
                if(sum == num) count++;
                sum -= arr[left];
                // increment window's trailing edge to shrink window
                left++;
            } else {
                // current sum is less than num, BUT window's leading edge HAS reached end of array
                // needed to prevent an infinite loop
                break;
            }
        }
        return count;
    };
}

