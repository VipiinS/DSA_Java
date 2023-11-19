package Binary_search;

import static Binary_search.FirstAndLastOccurance.search;

public class CountNumberOfOccurances {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,5,5,6,6,6,6,7};
        int target = 6;
        System.out.println(ans(arr,target));
    }

    private static int ans(int[] arr, int target) {

        return (search(arr,target,false)-search(arr,target,true));
    }
}
