package question;

public class Q209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int s, int[] nums) {
        if(null == nums || nums.length == 0) return 0;

        int left = 0,right = -1,length = Integer.MAX_VALUE,sum = 0;
        while (left < nums.length) {
            if (sum < s && right < nums.length - 1) {
                sum += nums[++right];
            } else {
                sum -= nums[left++] ;
            }
            if (sum >= s) length = Math.min(length, right - left + 1);
        }
        return length == Integer.MAX_VALUE?0:length;
    }

    public static void main(String[] args) {
        Q209_Minimum_Size_Subarray_Sum demo = new Q209_Minimum_Size_Subarray_Sum();
        int[] test ={2,3,1,2,4,3};
        int i = demo.minSubArrayLen(7, test);
        System.out.println(i);
    }
}
