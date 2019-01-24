package question;

import java.util.HashMap;
import java.util.Map;

public class Q205_Isomorphic_Strings {
    //采用标准遍历判断
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i))) {
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }

    //采用ASCII码作为key进行索引
    public boolean isIsomorphic2(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] map = new int[512];
        for (int i = sc.length-1;i >= 0;i--) {
            if (map[sc[i]] != map[tc[i]+256]) {
                return false;
            }
            map[sc[i]] = map[tc[i] + 256] = i;
        }
        return true;

    }
}
