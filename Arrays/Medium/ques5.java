// 5. [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

class ques5{
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int ans[]= findSum(nums);
        for (int i : ans) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

    public static int [] findSum(int[]nums){
        if(nums== null||  nums.length==0)return new int[0];

        int left []= new int[nums.length];
        int right[]= new int [nums.length];
        int ans []= new int [nums.length];
       
        for(int i=0;i<nums.length;i++)
        {
           if (i==0)left[i]=1 ;
           else{
                left[i] = nums[i-1]*left[i-1];
           }
            
        }
        right[0]=1;
        for(int j=nums.length-1;j>=0;j--){
            if(j==nums.length-1)right[j]=1;
            else 
                right[j] = nums[j+1] *right[j+1];
        }
           

      
        for(int i=0;i<nums.length;i++)
        {
            ans[i]= left[i]*right[i];
        }
        return ans;
    }
}