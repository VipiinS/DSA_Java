package String;

public class largestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"dog","dacecar","dar"};
        System.out.println(count(str));

//        int count = 0;
//        int charIndex=0;
//        int stringIndex=1;

//        while(stringIndex < str.length){
//            char ch = str[0].charAt(charIndex);
//            char ch2 = str[stringIndex].charAt(charIndex);
//            if(ch == ch2) {
//                count++;
//
//            }
//            else break;
//        }
//        System.out.println(count);
//
//        for (int i = 0; i < str[0].length(); i++) {
//            char ch1 = str[0].charAt(i);
//            for (int j = 0; j < str[j].length(); j++) {
//                char ch2 = str[j].charAt(i);
//                if(ch1== ch2){
//                    count++;
//                }
//                else
//                    return;
//            }
//        }
//        System.out.println(count);
    }

    private static String count(String[] str){
        int count = 0;
        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 1; j <= str.length; j++) {
                char ch1 = str[0].charAt(i);
                if (i <= str[j].length()) {
                    char ch2 = str[j].charAt(i);
                    if (ch1 == ch2)
                    count++;
                } else
                    return str[0].substring(0,count);
            }
        }
        return str[0].substring(0,count);
    }
}
