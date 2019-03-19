package sort;

public class QuickSort {
    public static void sort(int[]nums,int low ,int high) {
        if (low > high) return;
        int i = low,j = high,base = nums[i];

        while (i < j) {
            while (i <j && nums[j] >= base) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] <= base) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = base;
        sort(nums,low,i - 1);
        sort(nums,i + 1,high);
    }

    public static void main(String[] args) {
        int [] a= {5,4,3,2,1};
        sort(a,0,a.length-1);
        for (int i : a) {
            System.out.print(i);
        }
    }
}
