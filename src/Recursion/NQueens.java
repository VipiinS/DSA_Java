package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        String[][] ans = new String[n][n];
        boolean[][] track = new boolean[n][n];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
             ans[i][j] = ".";
             track[i][j] = false;
            }
        }
        helper(0,n,ans,result);
        return result;
    }
    private static void helper(int col, int n, String[][] ans, List<List<String>> result){
        if(col == n){
//            result.add(ans);
        }

    }
}
