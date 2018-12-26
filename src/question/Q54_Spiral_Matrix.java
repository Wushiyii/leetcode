package question;

import java.util.ArrayList;
import java.util.List;

public class Q54_Spiral_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }


        //需要输入的矩阵的长宽.每次往里缩一格.宽高各-2
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        //左上角i,j坐标
        int i = 0;
        int j = 0;

        //中心节点的i,j坐标
        int centerI = rowLen / 2;
        int centerJ = colLen / 2;


        while (i <= centerI && j <= centerJ && rowLen != 0 && colLen != 0) {
            print(matrix, res, i, j, rowLen, colLen);
            i++;
            j++;
            colLen -= 2;
            rowLen -= 2;
        }

        return res;
    }

    public void print(int[][] matrix, List<Integer> res, int i, int j, int rowLen, int colLen) {

        //遍历第一行.
        for (int k = j; k < j + colLen; k++) {
            res.add(matrix[i][k]);
        }
        //防止在row为一行的情况下.执行下去导致行遍历两遍
        if (rowLen == 1) {
            return;
        }
        //遍历第二列
        for (int k = i + 1; k < i + rowLen; k++) {
            res.add(matrix[k][j + colLen - 1]);
        }
        //防止在col为一行的情况下.执行下去又执行一遍
        if (colLen == 1) {
            return;
        }
        //遍历第三行
        for (int k = j + colLen - 2; k >= j; k--) {
            res.add(matrix[i + rowLen - 1][k]);
        }
        //遍历第四行
        for (int k = i + rowLen - 2; k > i; k--) {
            res.add(matrix[k][j]);
        }

    }

    public static void main(String[] args) {
        Q54_Spiral_Matrix demo = new Q54_Spiral_Matrix();
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> integers = demo.spiralOrder(test);
        System.out.println(integers);
    }
}
