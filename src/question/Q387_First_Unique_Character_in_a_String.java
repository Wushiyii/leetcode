package question;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q387_First_Unique_Character_in_a_String {

    public int firstUniqChar(String s) {
        int res = -1;
        if ("".equals(s)) return res;
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)) {
                Integer a = map.get(c);
                map.put(c,++a);
            }else {
                map.put(c,1);
            }
        }
        for(int i = 0; i < chars.length; i++){
            if(map.get(chars[i]) == 1){
                res = i;
                break;
            }
        }
        return res;
    }
}
