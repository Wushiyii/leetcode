package question;

import java.util.LinkedList;
import java.util.Queue;

public class Q200_Number_of_Islands {

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    toOceanBfs(grid, i, j, rows, cols);
                }
            }
        }
        return result;
    }

    private void toOseanDfs(char[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 0;
        toOseanDfs(grid, i + 1, j, rows, cols);
        toOseanDfs(grid, i - 1, j, rows, cols);
        toOseanDfs(grid, i, j + 1, rows, cols);
        toOseanDfs(grid, i, j - 1, rows, cols);
    }

    private void toOceanBfs(char[][] grid, int x, int y, int rows, int cols) {
        grid[x][y] = '0';
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int code = x * cols + y;
        queue.offer(code);
        while (!queue.isEmpty()) {
            code = queue.poll();
            int i = code / cols;
            int j = code % cols;
            if (i > 0 && grid[i - 1][j] == '1')    //search upward and mark adjacent '1's as '0'.
            {
                queue.offer((i - 1) * cols + j);
                grid[i - 1][j] = '0';
            }
            if (i < rows - 1 && grid[i + 1][j] == '1')  //down
            {
                queue.offer((i + 1) * cols + j);
                grid[i + 1][j] = '0';
            }
            if (j > 0 && grid[i][j - 1] == '1')  //left
            {
                queue.offer(i * cols + j - 1);
                grid[i][j - 1] = '0';
            }
            if (j < cols - 1 && grid[i][j + 1] == '1')  //right
            {
                queue.offer(i * cols + j + 1);
                grid[i][j + 1] = '0';
            }
        }
    }


    public static void main(String[] args) {
        Q200_Number_of_Islands a = new Q200_Number_of_Islands();
        char test[][] = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        int i = a.numIslands(test);
        System.out.println(i);
    }

}
