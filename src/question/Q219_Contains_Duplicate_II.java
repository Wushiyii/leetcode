package question;

import java.util.HashMap;
import java.util.Map;

public class Q219_Contains_Duplicate_II {
    //使用map
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        int sub = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                sub = i - map.get(nums[i]);
                if (sub <= k)
                    return true;
                map.put(nums[i],i);

            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }

}
