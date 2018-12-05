package question;

public class Q13_Roman_to_Integer {

    public static int romanToInt(String s) {
        if ("".equals(s) || null == s){
            return 0;
        }
        int result = 0;

        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length;i++) {
            switch (chars[i]){
                case 'I':
                    if (i + 1 == chars.length) {
                        result += 1;
                        break;
                    } else {
                        if (chars[i+1] == 'V' || chars[i-1] == 'X') {
                            result -= 1;
                        }else {
                            result += 1;
                        }
                    }
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
