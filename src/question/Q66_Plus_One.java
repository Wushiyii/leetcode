package question;

public class Q66_Plus_One {
    public int[] plusOne(int[] digits) {
        String res = "";
        int end = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            int cur = digits[i] + end;
            if (i == digits.length -1) {
                cur = cur + 1;
            }
            if(cur == 10) {
                res = res + 0;
                end = 1;
            } else {
                res = cur + res;
                end = 0;
            }

        }
        if (end == 1) {
            res = 1 +res;
        }
        int[] result = new int[res.length()];
        for (int i = 0; i < res.length(); i++) {
            result[i] = Integer.valueOf("" + res.charAt(i));
        }
        return result;

    }

    public static void main(String[] args) {
        int[] a = new int[]{9,9,9,9,9,9,9,9,9,9};
        Q66_Plus_One demo = new Q66_Plus_One();
        int[] res = demo.plusOne(a);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
