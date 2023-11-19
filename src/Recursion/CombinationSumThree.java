package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumThree {
    public static void main(String[] args) {
        int k = 2, n = 18;
        System.out.println(combinationSum3(k,n));
    }

    private static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(0,1,ans,result,k,n);
        return result;
    }

    private static void helper(int sum, int start, List<Integer> ans, List<List<Integer>> result, int k, int n) {
        if(sum > n || ans.size() > k){
            return;
        }
        if(sum == n && ans.size() == k)
            result.add(new ArrayList<>(ans));

        for (int i = start; i < 10; i++) {
            ans.add(i);
            helper(sum+i,i+1,ans,result,k,n);
            ans.remove(ans.size()-1);
        }

    }
}
