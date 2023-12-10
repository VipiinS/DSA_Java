package ArraysMedium;

import java.util.Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] nums = {
                {0,1}
        };

        boolean[][] temp = new boolean[nums.length][nums[0].length];

        setMatrixZeros(nums,temp);
        for (boolean[] arr:temp
             ) {
            System.out.println(Arrays.toString(arr));
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                if(temp[row][col]){
                    nums[row][col] = 0;
                }
            }
        }

        for (int[] arr:nums
             ) {
            System.out.println(Arrays.toString(arr));
        }


    }

    private static void setMatrixZeros(int[][] nums, boolean[][] temp) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                if(nums[row][col] == 0){
                    setRowColZero(temp,row,col);
                }
            }
        }
    }

    private static void setRowColZero(boolean[][] temp, int row, int col) {
        int tempcol = 0;
        while(tempcol < temp[0].length){
            temp[row][tempcol] = true;
            tempcol ++;
        }
        int temprow = 0;
        while(temprow < temp.length){
            temp[temprow][col] = true;
            temprow++;
        }
    }
}
