package question;

public class Q724_Find_Pivot_Index {

    public int pivotIndex(int[] nums) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int left= 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left +=nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                right +=nums[j];
            }
            if (left == right) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Q724_Find_Pivot_Index demo = new Q724_Find_Pivot_Index();
        int[] test = new int[]{-1,-1,0,0,-1,-1};
        int i = demo.pivotIndex(test);
        System.out.println(i);
    }
}
