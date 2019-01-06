package question;

public class Q26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                index ++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        Q26_Remove_Duplicates_from_Sorted_Array demo = new Q26_Remove_Duplicates_from_Sorted_Array();
        int [] test = {};
        int length = demo.removeDuplicates(test);
        System.out.println(length);
    }
}
