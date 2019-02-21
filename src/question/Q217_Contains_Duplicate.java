package question;

import java.util.Arrays;
import java.util.HashSet;

public class Q217_Contains_Duplicate {

    /**
     * 先排序后进行遍历判断
     * @param nums
     * @return
     */
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (nums[i] > nums[j]){
                    break;
                } else if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 使用Set过滤
     * @param nums
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        Q217_Contains_Duplicate demo = new Q217_Contains_Duplicate();
        boolean b = demo.containsDuplicate1(nums);
        System.out.println(b);
    }
}
