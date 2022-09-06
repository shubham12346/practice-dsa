// 24. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
class ques24{
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr);
        System.out.println(ans);

        
    }

    public static int maxSubArray(int [] nums)
    {
        int cursum =0;
        int max= Integer.MIN_VALUE;

        for(int i=0;i <nums.length;i++){
            if(cursum<=0){
                cursum=0;
            }

            cursum+= nums[i];
            max = Math.max(cursum,max);

        }
        return max;
    }
}