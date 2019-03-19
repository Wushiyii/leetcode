package sort;

public class MergeSort {
    public static int[] sort(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(nums, low, mid);
            sort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
        return nums;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;//左指针
        int j = mid + 1;//右指针
        int k = 0;

        //将每次对比 较小的数放入数组
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        //剩余判断
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++)
        {
            nums[k2 + low] = temp[k2];
        }
    }

    public static void main(String[] args) {
        int [] a = {5,4,2,3,1};
        int[] sort = sort(a, 0, 4);
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
