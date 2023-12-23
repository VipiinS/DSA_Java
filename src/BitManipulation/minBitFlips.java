package BitManipulation;

public class minBitFlips {
    public static void main(String[] args) {
        int start = 10;
        int end = 7;
        int count = 0;
        int xor = start^end;
        System.out.println("xor: " +xor);

        while(xor>0){
            if((xor&1) != 0) count++;
            xor = xor>>1;
        }
        System.out.println("ans: " + count );
    }
}
