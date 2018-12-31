package question;

public class Q167_Two_Sum_II_Input_array_is_sorted {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0,right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) left++;
            else if (sum == target) return new int[]{left+1,right+1};
            else right--;
        }
        return numbers;
    }

    public static void main(String[] args) {
        Q167_Two_Sum_II_Input_array_is_sorted demo = new Q167_Two_Sum_II_Input_array_is_sorted();
        int[] test = {1,2,3,4,4,9,56,90};
        int[] ints = demo.twoSum(test, 8);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
