import java.util.ArrayList;
import java.util.List;

// package Arrays.Easy;
// 8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

public class ques8 {
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3,2};
        int num[] = smallerNumbersThanCurrent(nums);
       for (int i : num) {
        System.out.print(i+"  ");
        
       }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (j != i) {
                    if (nums[j] > nums[i]) {
                        count++;
                    }
                }

            }

            ans.add(count);

        }
        int[] num2 = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {

            num2[k] = ans.get(k);
        }

        return num2;

    }
    
}
