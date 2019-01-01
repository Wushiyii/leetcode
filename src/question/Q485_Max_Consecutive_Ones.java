package question;

public class Q485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0,length = nums.length,start = 0,end = 0;
        while (end < length) {
            if (nums[end] == 1){
                end ++;
            }else {
                res = Math.max(res,end-start);
                end ++;
                start = end;
            }
        }
        res = Math.max(res,end-start);
        return res;
    }

    public static void main(String[] args) {
        Q485_Max_Consecutive_Ones demo = new Q485_Max_Consecutive_Ones();
        int[] test = {1,1};
        int maxConsecutiveOnes = demo.findMaxConsecutiveOnes(test);
        System.out.println(maxConsecutiveOnes);
    }
}

