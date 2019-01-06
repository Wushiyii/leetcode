package question;

public class Q557_Reverse_Words_in_a_String_III {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            res.append(this.reverse(strings[i]) + " ");
        }
        return res.toString().trim();
    }
    private String reverse(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Q557_Reverse_Words_in_a_String_III demo = new Q557_Reverse_Words_in_a_String_III();
        String str = "Let's take LeetCode contest";
        String s = demo.reverseWords(str);
        System.out.println(s);
    }
}
