package String;

public class maximumDepthOfParenthesis {
    public static void main(String[] args) {
        String s = "(1)+((2))+((((3))))";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') counter ++;
            else if (s.charAt(i) == ')') counter--;
            max = Math.max(max,counter);
        }

        return max;
    }
}
