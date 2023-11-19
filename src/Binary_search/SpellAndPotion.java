package Binary_search;

import java.util.Arrays;

public class SpellAndPotion {
    public static void main(String[] args) {
        int[] spell = {5,1,3};
        int[] potion = {1,2,3,4,5};
        int success = 7;
        System.out.println(Arrays.toString(sucessfullPairs(spell,potion,success)));
    }

    public static int[] sucessfullPairs(int[] spell, int[] potion, int success){
        int[] ans = new int[spell.length];
        Arrays.sort(potion);
        for (int i=0; i < spell.length; i++){
            ans[i] = noOfSuccessful(spell[i],potion,success);
        }
        return ans;
    }

    private static int noOfSuccessful(int spell, int[] potion, int success) {
        int n = potion.length - 1;
        if(spell * potion[0] >= success)
            return potion.length;
        if(spell * potion[n] < success)
            return 0;

        int start = 0;
        int end = n;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(spell * potion[mid] >= success)
                end = mid - 1;
            else {
                start = mid + 1;
            }
        }
        int ans = (n + 1 - start);
        return ans;
    }
}
