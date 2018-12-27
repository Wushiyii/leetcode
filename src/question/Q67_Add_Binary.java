package question;


public class Q67_Add_Binary {
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        int carry = 0;
        while (indexA >= 0 || indexB >= 0) {
            int sum = carry;
            if (indexA >= 0) {
                sum += (a.charAt(indexA) - '0');
                indexA --;
            }
            if (indexB >= 0) {
                sum += (b.charAt(indexB) - '0');
                indexB --;
            }
            res.append(sum%2);
            carry = sum/2;
        }
        if(carry == 1){
            res.append('1');
        }
        return res.reverse().toString();
    }


    public static void main(String[] args) {
        Q67_Add_Binary demo = new Q67_Add_Binary();
        String a = "100000101";
        String b = "1";
        String s = demo.addBinary(a, b);
        System.out.println(s);

    }
}
