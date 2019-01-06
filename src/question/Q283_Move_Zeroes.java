package question;

public class Q283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index ++;
            }
        }
        while (index < nums.length) nums[index++] = 0;
    }

    public static void main(String[] args) {
        Q283_Move_Zeroes demo = new Q283_Move_Zeroes();
        int[] test = {0,1,0,3,12};
        demo.moveZeroes(test);
    }
}
