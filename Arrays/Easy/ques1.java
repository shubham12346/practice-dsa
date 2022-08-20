// 1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)
// package Arrays.Easy;
class ques1{
    public static void main(String[] args) {
        int nums[] ={0,2,1,5,3,4};
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
      for (int i : ans) {
        System.out.println(i);
        
      }

        
    }
    
}
