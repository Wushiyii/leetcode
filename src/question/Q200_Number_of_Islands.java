package question;

public class Q200_Number_of_Islands {

    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length ==0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    res++;
                    toOcean(grid,i,j,rows,cols);
                }
            }
        }
        return res;
    }

    private void toOcean(char[][] grid, int i, int j, int rows, int cols) {
        if(i <0 || j< 0 || i >= rows || j >= cols) {
            return;
        }
        if( grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        toOcean(grid,i + 1,j,rows,cols);
        toOcean(grid,i - 1,j,rows,cols);
        toOcean(grid,i,j + 1,rows,cols);
        toOcean(grid,i,j - 1,rows,cols);
    }

    public static void main(String[] args) {
        Q200_Number_of_Islands a = new Q200_Number_of_Islands();
        char test[][] = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        int i = a.numIslands(test);
        System.out.println(i);
    }

}
