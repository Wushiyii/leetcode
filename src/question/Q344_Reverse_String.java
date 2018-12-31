package question;

public class Q344_Reverse_String {
    public String reverseString(String s) {
        if (null == s || s.length() <= 1) return s;
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left ++;
            right -- ;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Q344_Reverse_String demo = new Q344_Reverse_String();
        String abc = demo.reverseString("0z;z ; 0");
        System.out.println(abc);
        StringBuffer a = new StringBuffer();
        a.reverse();
    }
}
