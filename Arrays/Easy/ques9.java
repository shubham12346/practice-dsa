// 9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)

class ques9{
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index []={0,1,2,2,1};
        int ans[] = createTargetArray(nums,index);
        for (int i : ans) {
            System.out.print(i +" ");
        }


        
    }

    public static  int[] createTargetArray(int[] nums, int[] index) {

        int ans[] = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < ans.length; i++) {

            if (ans[index[i]] == -1) {
                ans[index[i]] = nums[i];
            } else {
                for (int j = ans.length - 1; j > index[i]; j--) {
                    ans[j] = ans[j - 1];
                }
                ans[index[i]] = nums[i];
            }

        }
        return ans;

    }
}