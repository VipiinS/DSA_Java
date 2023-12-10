package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s = "tar";
        String t = "rat";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        s = Arrays.toString(temp);
        temp = t.toCharArray();
        Arrays.sort(temp);
        t = Arrays.toString(temp);
        if(s.equals(t)) return true;
        return false;
    }
}
