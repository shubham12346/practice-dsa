// 20. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)

public class ques20 {
    public static void main(String[] args) {
        int mat[][]={{0,1},{1,0}};
        int target[][] ={{1,0},{0,1}};
        if(findRotation(mat, target))
        {
            System.out.println("True");
        }else{
            System.out.println("false");
        }

    }
    
    public static  boolean findRotation(int[][] mat, int[][] target) {
        if (checkAns(mat, target)) {
            return true;
        }
        for (int i = 0; i < 4; i++) {

            if (checkAns(mat, target)) {
                return true;
            }
            rotateMat(mat);

        }
        return false;

    }

    public static  boolean checkAns(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static  void rotateMat(int[][] mat) {
        // transpose
        int matNew[][] = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                matNew[j][i] = mat[i][j];

            }
        }

        // flip
        for (int i = 0; i < matNew.length; i++) {
            for (int j = 0; j < matNew[0].length / 2; j++) {
                int tem = matNew[i][j];
                matNew[i][j] = matNew[i][matNew[0].length - 1 - j];
                matNew[i][matNew[0].length - 1 - j] = tem;

            }
        }

        for (int i = 0; i < matNew.length; i++) {
            for (int j = 0; j < matNew.length; j++) {
                mat[i][j] = matNew[i][j];
            }
        }

    }
    
}
