package question;

public class Q724_Find_Pivot_Index {


    //左增右减实现
    public int pivotIndex(int[] nums) {
        if(nums.length < 3) return -1;
        int left=0, right=0;
        for(int i=1;i<nums.length;i++) {
            right+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if ( left == right) return i;
            if(i != nums.length-1) {
                left += nums[i];
                right -= nums[i+1];
            }
        }
        return -1;

    }


    //遍历取一半值
    public int pivotIndex3(int[] nums) {
        if(nums.length < 3) return -1;
        int sum=0 , left=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if ((float)(sum - nums[i])/2 == left){
                return i;
            }else {
                left += nums[i];
            }
        }
        return -1;
    }

    //穷举  n^2
    public int pivotIndex2(int[] nums) {
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
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Q724_Find_Pivot_Index demo = new Q724_Find_Pivot_Index();
        int[] test = new int[]{-1,-1,0,0,-1,-1};
        int i = demo.pivotIndex(test);
        System.out.println(i);
    }
}
