// 1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
import java.util.*;
class ques1{
    public static void main(String[] args) {
       // int mat [][]={ {1,2,3},{4,5,6},{7,8,9}};
         int mat2[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int mat3[][] ={{1,2},{3,4}};
        List<Integer>ans = spiralOrder(mat2);
        List<Integer> ans2 = spiralOrder(mat3);
        System.out.println(ans);
        System.out.println(ans2);
        
    }
    
    public  static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer>ans = new ArrayList<>();
        int cStart= 0;
        int cEnd= matrix[0].length-1;
        int rStart =0;
        int rEnd = matrix.length-1;

  
    


    while(cStart<= cEnd && rStart<= rEnd){
        for(int i= cStart;i<=cEnd;i++){
            ans.add(matrix[rStart][i]);
        }
        rStart++;
        for(int j = rStart;j<=rEnd;j++){
            ans.add(matrix[j][cEnd]);
        }
        cEnd--;

        if(rStart<= rEnd)
        {
            for(int i = cEnd;i>=cStart;i--){
                ans.add(matrix[rEnd][i]);
            }
          
        }
        cEnd--;
        if(cStart<=cEnd){
            for(int i = rEnd ;i>=rStart;i--)
            {
                ans.add(matrix[i][cStart]);
            }
          
        
        }
        cStart++;



    }
    return ans;
    }
}