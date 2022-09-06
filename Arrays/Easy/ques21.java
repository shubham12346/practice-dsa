// 21. [Two Sum](https://leetcode.com/problems/two-sum/)

public class ques21 {
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        int target =6;
        int ans[] = twoSum(num,target);
        for (int i : ans) {
            System.out.print(i+" ");
            
        }
        
    }
    
    public static  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
    
}
