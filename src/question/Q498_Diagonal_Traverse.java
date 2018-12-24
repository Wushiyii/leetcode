package question;

import javax.xml.bind.annotation.XmlType;

public class Q498_Diagonal_Traverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[]{};
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = 0;
        int[] res = new int[m * n];
        for (int i = 0;i < m * n;i ++){
            res[i] = matrix[row][col];
            if ((row + col) % 2 == 0){
                if (col == n - 1){
                    row ++;
                }else if (row == 0){
                    col ++;
                }else {
                    row --;
                    col ++;
                }
            }else{
                if (row == m - 1) {
                    col++;
                }else if (col == 0){
                    row ++;
                }else {
                    row ++;
                    col --;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] test = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Q498_Diagonal_Traverse demo = new Q498_Diagonal_Traverse();
        int[] diagonalOrder = demo.findDiagonalOrder(test);
        for (int i : diagonalOrder) {
            System.out.println(i);
        }
    }
}
