// package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

// 7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)
public class ques7 {
    public static void main(String[] args) {
           int  [] nums = {1,2,3,1,1,3};
     
           int ans = numIdenticalPairs(nums);
           System.out.println(ans);
        
    }
    

    public static  int numIdenticalPairs(int[] nums) {
      

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }

            }

        }
        return count;
    }
}
