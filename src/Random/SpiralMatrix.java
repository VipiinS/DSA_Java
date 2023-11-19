package Random;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(spiral(5).toString());
        System.out.println(Arrays.deepToString(spiral(5)));
    }

    private static int[][] spiral(int n) {
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int counter=left;
        int[][] arr = new int[n][n];
        
        while(left <= right && top <= bottom){

            //left to right
            for (int i = left; i <= right; i++) {
                arr[top][i]= counter++;
            }
            top++;

            //top to bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = counter++;
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = counter++;
                }
            }
            bottom--;
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = counter++;
                }
            }
            left++;
        }
        return arr;
    }
}
