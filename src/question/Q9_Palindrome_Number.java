package question;

public class Q9_Palindrome_Number {

    public static boolean isPalindrome(int x) {
        int current = 0;
        if (x < 0 || (x != 0 && x % 10 == 0) ){
            return false;
        }else {
            int temp = x;
            while (x != 0) {
                int left = x % 10;
                x = x / 10;
                current = current * 10 +left;
            }
            return temp == current;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

}
