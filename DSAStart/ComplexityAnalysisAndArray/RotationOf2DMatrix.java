package DSAStart.ComplexityAnalysisAndArray;
import java.util.Arrays;

public class RotationOf2DMatrix {
    public static void  rotationMatrix(int[][] arr){
          // step 1 transposethe 2d array 
          System.out.println(arr[1][1]); 
          System.out.println("work");
           int m = arr.length;
           int n = arr[0].length;
           for(int i=0;i<m;i++){
               for(int j=i;j<n;j++){
                   int temp = arr[i][j];
                   arr[i][j] = arr[j][i];
                   arr[j][i] = temp;
               }
            }
        // step 2 swap the left and right side 
        for(int i=0;i<m;i++){
           int li =0;
           int ri =n-1;
           while (li<ri) {
               int temp = arr[i][ri];
               arr[i][ri]=arr[i][li];
               arr[i][li] =temp; 
           }
        }
        System.out.println("hi");
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
          

        // System.out.println(m+" "+n);
        rotationMatrix(arr);
        // for(var mat:arr){
        //     System.out.println(Arrays.toString(mat));
        // }
    }
}
