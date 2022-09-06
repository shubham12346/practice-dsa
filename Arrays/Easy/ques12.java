// 12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
public class ques12 {
    public static void main(String[] args) {
        int gain[] = {-5,-4,3,2,1,4};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static  int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum = sum + gain[i];
            max = Math.max(max, sum);
        }

        return max;

    }
    
}
