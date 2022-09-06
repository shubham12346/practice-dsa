public class ques15 {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans = diagonalSum(mat);
        System.out.println(ans);
        
    }

    public static  int diagonalSum(int[][] mat) {
        int pri = 0, sec = 0;
        for (int i = 0; i < mat[0].length; i++) {
            pri = pri + mat[i][i];
            sec = sec + mat[i][mat.length - 1 - i];
        }

        if (mat[0].length % 2 == 0) {
            return (pri + sec);
        } else {
            return (pri + sec) - mat[mat.length / 2][mat.length / 2];
        }

    }
    
}
