package question;

public class Q14_Longest_Common_Prefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {return "";}
        String str = strs[0];
        String result = "";
        char[] chars = str.toCharArray();
        boolean flag = true;
        if (chars.length == 0){
            return "";
        }
        String current = String.valueOf(chars[0]);
        int j = 1;
        int length = chars.length;
        for (int i = 0; i < chars.length; i++) {
            for (String s : strs) {
                if ("".equals(s) || !s.startsWith(current)) {
                      flag = false;
                }
            }
            if(flag){
                result = current;
                if(j <= length -1 ) {
                    current += String.valueOf(chars[j]);
                    j++;
                }
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String []{"","aaa"}));
    }
}
