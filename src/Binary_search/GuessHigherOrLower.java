package Binary_search;
public class GuessHigherOrLower {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (guess(mid) == -1) {
                end = mid - 1;
            }
            else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }

    public static int guess(int num){
        if(num == 6){
            return 0;
        }
        if(num>6)
            return -1;
        return  1;
    }
}



