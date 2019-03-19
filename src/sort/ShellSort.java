package sort;

import java.util.Arrays;

public class ShellSort {
    public static int[] sort(int[] nums) {
        int j = 0;
        int temp = 0;
        for (int incre = nums.length/2; incre > 0; incre /= 2) {
            for (int i = incre; i < nums.length; i++) {
                temp = nums[i];
                for (j = i - incre; j >= 0; j -= incre) {
                    if (temp < nums[j]) {
                        nums[j + incre] = nums[j];
                    }else {
                        break;
                    }
                }
                nums[j + incre] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
        sort(data);
        System.out.println(Arrays.toString(data));
    }
}
