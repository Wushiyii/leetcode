package question;

import java.util.Arrays;
import java.util.Stack;

public class Q747_Largest_Number_At_Least_Twice_of_Others {

    public int dominantIndex(int[] nums) {
        if (nums.length <= 1) return 0;
        int [] temp = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        int max = temp[temp.length-1];
        int second = temp[temp.length-2];
        if (second * 2 <= max) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == max) {
                    res =  i;
                }

            }
            return res;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int[] a = {0,0,1,2};
        Q747_Largest_Number_At_Least_Twice_of_Others demo = new Q747_Largest_Number_At_Least_Twice_of_Others();
        int i = demo.dominantIndex(a);
        System.out.println(i);
    }
}
