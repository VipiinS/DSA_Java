package Binary_search;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,3};
        int target = 6;
        System.out.println(RotatedPivotSearch(arr));
    }
    public static int RotatedPivotSearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid = start + (end-start)/2;
            if( arr[mid] > arr[mid+1])
                return arr[mid];
            else if( arr[mid] < arr[mid -1 ])
                return arr[mid-1];
            else if (arr[mid] > arr[start])
                start = mid + 1;
            else if(arr[mid] < arr[start])
                end = mid -1;

        }
        return arr[start];
    }
}
