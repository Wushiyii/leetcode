package question;

public class Q704_Binary_Search {

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) /2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q704_Binary_Search demo = new Q704_Binary_Search();
        int[] nums = {-1,0,3,5,9,12};
        int search = demo.search(nums, 5);
        System.out.print(search);
    }
}
