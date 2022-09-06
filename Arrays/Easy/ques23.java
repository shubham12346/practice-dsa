import java.util.ArrayList;
import java.util.List;

// 23. [Lucky Number In a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
public class ques23 {
    public static void main(String[] args) {
        int mat[][]={{3,7,8},{9,11,13},{15,16,17}};
        //ans = 15 
        // 15 is the only lucky number since it is the minimum in its row and the
        // maximum in its column.
        List<Integer> ans = luckyNumbers(mat);
        System.out.println(ans.toString());


    }

    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        List<Integer> rowMin = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);

            }
            rowMin.add(min);

        }

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                max = Math.max(max, matrix[j][i]);

            }
            if (rowMin.contains(max)) {
                ans.add(max);
            }
        }

        return ans;

    }
    
}
