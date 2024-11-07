import java.util.*;
public class Floodfill {


    public static void helper(int[][] image, int sr,int sc,int color,boolean vis[][],int orgCol) {

        //base condition 
        if(sr<0 || sc<0||sr>=image.length || sc>=image[0].length ||vis[sr][sc] ||image[sr][sc] !=orgCol){
            return;
        }

        image[sr][sc]=color;

        //left
        helper(image,sr,sc-1,color,vis,orgCol);  //recursive call

        //right
        helper(image, sr, sc+1, color, vis, orgCol); //recursive call

        //up
        helper(image, sr-1, sc, color, vis, orgCol); //recursive call

        //down
        helper(image, sr+1, sc, color, vis, orgCol);//recursive call
    }




   
   public static void flood_fill(int[][] image ,int sr,int sc,int color){
    boolean vis[][]=new boolean[image.length][image[0].length];
    helper(image, sr,sc,color,vis,image[sr][sc]);
   // return image;
   }

   public static void printimage(int[][] image){
    for(int i=0;i<image.length;i++) {
        for(int j=0;j<image[0].length;j++){
            System.out.print(image[i][j]+" ");
        }
        System.out.println();
    }
   }

    public static void main(String args[]){//O(m*n)

        int image[][]={{1,1,1},
                       {1,1,0},
                       {1,0,1}};

    int sr=1;
    int sc=1;
    int color=2;
    flood_fill(image,sr,sc,color);
    printimage(image);

    

    }
    
}
