package question;

import java.util.*;

public class Q49_Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
       return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] a = {"eat","tea","tan","ate","nat","bat"};
        Q49_Group_Anagrams demo = new Q49_Group_Anagrams();
        List<List<String>> lists = demo.groupAnagrams(a);
        System.out.println(lists);
    }
}
