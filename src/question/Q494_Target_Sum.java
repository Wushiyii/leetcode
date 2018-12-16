package question;

import java.util.Arrays;

public class Q494_Target_Sum {

    int count = 0;

    public int findTargetSumWays(int[] nums, int S) {
        int[][] mem = new int[nums.length][2001];
        for (int[] row : mem) {
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return this.calculate(nums,0,0,S,mem);
    }

    private int calculate(int[] nums, int i, int sum, int target,int[][] mem) {
        if(i == nums.length) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }else {
            if (mem[i][sum+1000] != Integer.MIN_VALUE) {
                return mem[i][sum+1000];
            }
            int add = calculate(nums,i+1,sum + nums[i],target,mem);
            int sub = calculate(nums,i+1,sum - nums[i],target,mem);
            mem[i][sum+1000] = add + sub;
            return mem[i][sum+1000];
        }

    }

    public static void main(String[] args) {
        int[] test = new int[]{1,1,1,1,1};
        Q494_Target_Sum demo = new Q494_Target_Sum();
        int targetSumWays = demo.findTargetSumWays(test, 3);
        System.out.println(targetSumWays);
    }

}
