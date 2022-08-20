import java.util.ArrayList;
import java.util.List;

//package Arrays.Easy;
// 6. [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
public class ques6 {
    public static void main(String[] args) {
       int candies[]={2,3,5,1,3};
       int extC =3;
       List<Boolean> ans = new ArrayList<>();
       ans = kidsWithCandies(candies, extC);
       System.out.println(ans);
    }

    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {

            int sum = candies[i] + extraCandies;
            int flag = 0;
            for (int j = 0; j < candies.length; j++) {
                if (sum < candies[j]) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                ans.add(true);
            } else {
                ans.add(false);
            }

        }

        return ans;

    }
    
}
