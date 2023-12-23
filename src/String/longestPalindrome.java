package String;

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "xaabacxcabaaxcabaax";
        System.out.println(longestPalindromee(s)); //xaabacxcabaax
    }
    public static String longestPalindrome(String str) {
        if(str.length()==1) return str;
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            int e = str.length() -1;
            while(i <= e) {
                if(str.charAt(i) == str.charAt(e)){
                    if(isPalindrome(str,i,e))
                    {
                        if (result.length() <= e - i)
                            result = str.substring(i, e + 1);
                    }
                }
                e--;
            }
        }
        return result;
    }
    public static String longestPalindromee(String str) {
        if(str.length()==1) return str;
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            int e = str.length() -1;
            while(i <= e) {
                if(str.charAt(i) == str.charAt(e)){
                    int start = i;
                    int end = e;
                    while (start<=end){
                        if(str.charAt(start) == str.charAt(end)){
                            start++;
                            end--;
                        }
                        else {
                            e = end;
                            break;
                        }
                    }
                    if(start>end){
                            if (result.length() <= e - i)
                                result = str.substring(i, e + 1);
                            e--;
                    }
                }
                else{
                e--;
                }
            }
        }
        return result;
    }


    private static boolean isPalindrome(String str,int s,int e){
        while(s <=e ){
            if(str.charAt(s) == str.charAt(e)){
                s++;
                e--;
            }
            else return false;
        }

        return true;
    }

}
