package question;

public class Q151_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        if (null == s || "".equals(s)) return "";
        String[] strings = s.split(" ");
        StringBuffer res = new StringBuffer();

        for (int i = strings.length-1; i >= 0; i--) {
            if (!strings[i].equals("")) {
                if (res.length() > 0){
                    res.append(" ");
                }
                res.append(strings[i]);
            }
        }
        return res.toString();


    }

    public static void main(String[] args) {
        Q151_Reverse_Words_in_a_String demo = new Q151_Reverse_Words_in_a_String();
        String s = demo.reverseWords("s");
        System.out.println(s);

    }

}
