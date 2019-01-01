package question;

public class Q27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index ++ ;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Q27_Remove_Element demo = new Q27_Remove_Element();
        int[] a = {0,1,2,2,3,0,4,2};
        int ints = demo.removeElement(a, 2);
        System.out.println(ints);
    }
}
