package String;

public class rotatedArray {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        s = s + s;
//        System.out.println(s);
        if(s.contains(goal)) return true;

        return false;
    }
}
