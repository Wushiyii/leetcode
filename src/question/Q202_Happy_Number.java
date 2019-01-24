package question;

public class Q202_Happy_Number {
    public boolean isHappy(int n) {
        if (n <= 0) return false;

        String num = String.valueOf(n);
        int sum = 0;

        while (sum != n) {
            for (int i = 0; i < num.length(); i++) {
                sum += Math.pow(Integer.valueOf(""+num.charAt(i)),2);
            }
            if (sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            } else {
                num = String.valueOf(sum);
                sum = 0;
            }
        }
        return false;
    }

    public boolean isHappy2(int n) {
        if (n <= 0) return false;
        int sum = 0;
        while (sum != n) {
            while (n > 0) {
                sum += Math.pow(n % 10 ,2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            } else {
                n = sum;
                sum = 0;
            }
        }
        return false;
    }
    public boolean isHappy3(int n) {
        if (n <= 0) return false;
        int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10 ,2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            } else {
                return isHappy3(sum);
            }
    }

    public static void main(String[] args) {
        Q202_Happy_Number demo = new Q202_Happy_Number();
        boolean happy = demo.isHappy2(19);
        System.out.println(happy);
    }

}
