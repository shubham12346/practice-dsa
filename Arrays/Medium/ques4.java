// 4. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        int mat [][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(mat);
        for (int[] is : mat) {
            for(int i : is){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }


    }

    public static  void setZeroes(int[][] matrix) {
        List<List<Integer>> ans = new ArrayList<>();

        int row = -1, col = -1;
        int flag = 0;

        for (int i = 0; i < matrix.length; i++) {
         
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> li = new ArrayList<>();
                    li.add(i);
                    li.add(j);

                    flag = 1;
                    ans.add(new ArrayList<>(li));
                    
                }
            }
          
        }

     
         if (flag == 1) {


            for (int s = 0; s < ans.size(); s++) {
              row = ans.get(s).get(0);
              col = ans.get(s).get(1);

                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[row][i] = 0;
                }

                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][col] = 0;
                }

            }

        }



    }
}


    

