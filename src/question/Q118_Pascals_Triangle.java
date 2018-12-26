package question;

import java.util.ArrayList;
import java.util.List;

public class Q118_Pascals_Triangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) {
            return res;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
               row.add(1);
            } else if (i == 1) {
                row.add(1);
                row.add(1);
            } else {
                row.add(1);
                for (int j = 0; j < i-1; j++) {
                    row.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
                }
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
        Q118_Pascals_Triangle demo = new Q118_Pascals_Triangle();
        List<List<Integer>> generate = demo.generate(5);
        System.out.println(generate);
    }
}
