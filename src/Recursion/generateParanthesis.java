package Recursion;


import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public static void main(String[] args) {
        int num = 3;
//        StringBuilder str = new StringBuilder("sss");
//        str.delete(str.length()-1,str.length());
//        str.append(")");
//        System.out.println(str);
        System.out.println(generateParenthesis(num));
    }
    public static List<String> generateParenthesis(int n) {
        StringBuilder ans = new StringBuilder();
        List<String> result = new ArrayList<>();
        helper2(n, 0,0,ans,result);
        return result;
    }

    private static void helper(int n,int left, int right, String ans, List<String> result) {
        if(ans.length() == 2*n){
            result.add(ans);
            return;
        }
        if(left<right) return;
        if(left < n)
            helper(n,left+1,right,ans+"(",result);
        if(right<n)
            helper(n,left,right+1,ans+")",result);

    }
    private static void helper2(int strLength,int left, int right, StringBuilder ans, List<String> result) {
        if(ans.length() == 2*strLength){
            result.add(String.valueOf(ans));
            return;
        }
        if(left<right) return;
        if(left < strLength) {
            ans.append("(");
            left++;
            helper2(strLength, left, right, ans, result);
            ans.deleteCharAt(ans.length() - 1);
            left--;
        }
        if(right<left){
            ans.append(")");
            right++;
            helper2(strLength, left, right, ans, result);
            ans.deleteCharAt(ans.length() - 1);
            right--;
        }
    }
}
