package Binary_search;

public class ShipPackages {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(arr,days));
    }
    public static int shipWithinDays(int[] arr, int days){
        int max =Integer.MIN_VALUE;
        int sum = 0;

        for(int num : arr){
            max = Math.max(max,num);
            sum += num;
        }

        int start = max;
        int end = sum;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (isPossible(arr,mid,days)) {
                start = mid +1;
            }
            else end = mid - 1;
        }
        return start;
    }

    private static boolean isPossible(int[] arr, int mid, int daysGiven) {
        int sum = 0;
        int daysTaken = 0;
        for(int p : arr){
            sum += p;
            if(sum>mid){
                daysTaken++;
                sum = 0;
                sum += p;
            }
        }
        daysTaken++;
        return  daysTaken > daysGiven ;// then the weight capacity is to be increased
    }
}
