// 22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
public class ques22 {
    public static void main(String[] args) {
        int n =5;
        int []arr= sumZero(n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    
    public static  int[] sumZero(int n) {

        int ans[] = new int[n];
        int mid = n / 2;
        int m = mid;

        for (int i = 0; i < m; i++) {
            ans[i] = mid;
            ans[n - i - 1] = (-1) * mid;
            --mid;
        }
        return ans;
    }
    
}
