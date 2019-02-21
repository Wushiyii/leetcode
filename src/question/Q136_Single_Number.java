package question;


public class Q136_Single_Number {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a = a ^ num;
        }
        return a;
    }


    public static void main(String[] args) {
        Q136_Single_Number demo = new Q136_Single_Number();
        int i = demo.singleNumber(new int[]{1,2,3,4,1,2,3,4,6});
        System.out.println(i);
    }
}




