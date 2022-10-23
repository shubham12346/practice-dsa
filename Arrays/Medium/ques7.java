// 7. [Jump Game](https://leetcode.com/problems/jump-game/)

public class ques7 {
    public static void main(String[] args) {
        int num[] ={1,2,3,4};
        if(canJump(num))
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
    }
    
    public static  boolean canJump(int[] nums) {
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > curr) {
                return false;
            }

            curr = Math.max(curr, i + nums[i]);
        }
        return true;

    }
    
}
