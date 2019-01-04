package question;

public class Q189_Rotate_Array {

    /**
     * 解法1 有k次移动就有k次for循环，时间复杂度 O(kn)
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int tmp = nums[n-1];
            for (int j = n-1; j >0 ; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
    }

    /**
     * 对0~n-1-k进行翻转、n-k ~ n-1进行翻转，最后翻转0~n-1
     * 时间复杂度: O(n)
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public void rotate3(int[] nums, int k) {

    }


        public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        Q189_Rotate_Array demo = new Q189_Rotate_Array();
        demo.rotate(test, 3);
        for (int i : test) {
            System.out.println(i);
        }
    }

}
