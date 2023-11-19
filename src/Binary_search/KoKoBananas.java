package Binary_search;

public class KoKoBananas {
    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000};
        int hour=3;
        System.out.println(minEatingSpeed(arr,hour));
    }
    public static int minEatingSpeed(int arr[],int hour){
        int start = 1;
        int end = 1;
        int ans = 1;
        for (int p: arr) {
        end = Math.max(end,p);
        }
        if(arr.length == hour ) return end;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(isPossible(arr,mid,hour)){
                ans = Math.min(end,mid);
                end = mid - 1 ;
            }
            else
                start = mid +1;
        }

        return ans;
    }

    private static boolean isPossible(int[] arr, int mid, int h) {
        int hour = 0;
        for (int p : arr) {
            hour += p/mid;
            if (p%mid !=0) hour++;
            if(hour>h) return false;
        }
        return true;
    }
}
