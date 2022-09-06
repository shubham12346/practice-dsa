// 25. [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)

public class ques25 {
    public static void main(String[] args) {
        int mat[][] = {{1,2},{1,2}};

        int ans[][]= matrixReshape(mat,1,4);

        for (int[] li : ans) {
            for (int  i : li) {
                System.out.print( i+" ");
                
            }
            System.out.println( " ");
            
        }




        
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        // int row = mat.length;
        // int col = mat[0].length;

        // if(row*col != r*c)
        // {
        // return mat;
        // }

        // int matnew[][] = new int[r][c];
        // List<Integer> li = new ArrayList<>();
        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // li.add(mat[i][j]);
        // }
        // }
        // int k=0;
        // for(int i=0;i<r;i++){
        // for(int j=0;j<c;j++){
        // matnew[i][j] = li.get(k);
        // k++;
        // }
        // }

        // return matnew;

        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int row = 0;
        int col = 0;
        int matNew[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                matNew[i][j] = mat[row][col];
                col++;
                if (col == mat[0].length) {
                    row++;
                    col = 0;
                }
            }
        }
        return matNew;

    }
    
}
