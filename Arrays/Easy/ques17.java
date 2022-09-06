// 17. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)

public class ques17 {
    public static void main(String[] args) {
        int [][]mat ={{1,2,3},{4,5,6},{7,8,9}};
        
        int ans[][] = transpose(mat);
        for (int[] is : ans) {
            for (int is2 : is) {
                System.out.print(is2+" ");
                
            }
            System.out.println(" ");
            
        }

        
    }

    public static  int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int mat[][] = new int[col][row];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                mat[c][r] = matrix[r][c];
            }

        }
        return mat;

    }
    
}
