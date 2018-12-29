package question;

public class Q28_Implement_strStr {

    //穷举实现
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        char[] src = haystack.toCharArray();
        char[] target = needle.toCharArray();

        for (int i = 0; i < src.length; i++) {
            if (target[0] == src[i]) {
                if(target.length == 1){
                    return i;
                }
                if (target.length - 1 > src.length-i-1)
                    return -1;
                boolean flag = false;
                for (int j = 1; j < target.length; j++) {
                    if(target[j] != src[i+j]) {
                        flag = false;
                        break;
                    }
                    flag = true;
                }
                if(flag) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q28_Implement_strStr demo = new Q28_Implement_strStr();
        String src = "";
        String target = "a";
        int i = demo.strStr(src, target);
        System.out.println(i);
    }
}
