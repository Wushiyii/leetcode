package question;

import java.util.*;

public class Q349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return nums1;
        Set<Integer> set = new HashSet<>(), set2 = new HashSet<>();
        for (int i : nums1) set.add(i);
        for (int i : nums2) if (set.contains(i)) set2.add(i);
        int[] res = new int[set2.size()];
        int index = 0;
        for (Integer integer : set2) res[index++] = integer;
        return res;
    }

}
