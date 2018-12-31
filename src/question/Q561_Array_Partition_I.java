package question;

import java.util.Arrays;

public class Q561_Array_Partition_I {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i=i+2) {
            res += nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] test = {1,4,3,2};
        Q561_Array_Partition_I demo = new Q561_Array_Partition_I();
        int i = demo.arrayPairSum(test);
        System.out.println(i);
    }
}
