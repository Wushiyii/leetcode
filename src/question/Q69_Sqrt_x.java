package question;

public class Q69_Sqrt_x {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int result = -1;
        int left = 0 , right = x;
        while (left <= right) {
            int mid = left + (left + right) / 2;
            if (mid * mid == x) {
                return mid;
            } else if( mid * mid < x) {
                left = mid + 1;
                result = left;
            }else {
                right = right - 1;
            }
        }
        return result;
    }
}
