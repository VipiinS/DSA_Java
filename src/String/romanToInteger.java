package String;

public class romanToInteger {
    public static void main(String[] args) {
        String s = "III";
//        romanToInt(s);
//        System.out.println(romanToInt(s));
        char num = '1';
        String str = "111";
        System.out.println((String.valueOf(str)) + 2);
    }
    public static int romanToInt(String s) {
        if(s.length() == 1)
            return getValue(s.charAt(0));
        int ans = 0;
        int a;
        int b;
        for(int i = 0; i < s.length()-1; i++){
            a = getValue(s.charAt(i));
            b = getValue(s.charAt(i+1));
            if(a>=b)
                ans += a;
            else
                ans -= a;
        }
        return ans + getValue(s.charAt(s.length()-1));


    }
    public static  int getValue(char ch){
        if(ch == 'I')
            return 1;
        if(ch == 'V')
            return 5;
        if(ch == 'X')
            return 10;
        if(ch == 'L')
            return 50;
        if(ch == 'C')
            return 100;
        if(ch == 'D')
            return 500;
        else
            return 1000; // 'M'
    }
}
