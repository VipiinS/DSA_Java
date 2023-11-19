package Binary_search;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {76};
        System.out.println(peak(arr));
    }

    private static int peak(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        if(end == 0) return arr[0];
        while(end-start>1){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid] ){
                return arr[mid];
            }
            else if(arr[mid-1]>arr[mid])
                end = mid-1;
            else
                start = mid+1;
        }
        return arr[0]>arr[1]?arr[0]:arr[1];
//        return arr[start];
    }
}
