package question;

public class Q7_Reverse_Integer {

    public static int reverse(int x) {
        int current = 0;
        while (x!=0) {
            int left = x%10; //余数
            x = x / 10;
            if (current > Integer.MAX_VALUE/10 || (current == Integer.MAX_VALUE / 10 && left > 7)) return 0;
            if (current < Integer.MIN_VALUE/10 || (current == Integer.MIN_VALUE / 10 && left < -8)) return 0;
            current =current*10 + left;
        }
        return current;
    }

    public static void main(String[] args) {
//        System.out.println(reverse(1534236469));
        int a = 964632435;
        System.out.println(a*10);
        System.out.println(a*10 + 7);
    }
}
