package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q599_Minimum_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        List<String> res = new ArrayList<>();
        int sum = list1.length + list2.length;
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                int temp = map1.get(list2[i]) + i;
                if (temp < sum) {
                    res.clear();
                    res.add(list2[i]);
                    sum = temp;
                } else if (temp == sum) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }

}
