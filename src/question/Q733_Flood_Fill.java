package question;

public class Q733_Flood_Fill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image.length == 0 || image[0].length == 0) return image;
        if (image[sr][sc] != newColor)
            floodFill(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }

    public void floodFill(int[][] image,int sr,int sc,int newColor,int oldColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) return;
        image[sr][sc] = newColor;
        floodFill(image,sr-1,sc,newColor,oldColor);
        floodFill(image,sr+1,sc,newColor,oldColor);
        floodFill(image,sr,sc-1,newColor,oldColor);
        floodFill(image,sr,sc+1,newColor,oldColor);
    }


    public static void main(String[] args) {
        int[][] test = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        Q733_Flood_Fill demo = new Q733_Flood_Fill();
        int[][] ints = demo.floodFill(test, 1, 1, 2);
        System.out.println(ints.toString());

    }
}
