// [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

public class ques6 {
    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,5,7};
        int ans[] = searchEle(arr,2);

        for (int i : ans) {
            System.out.print(i+" ");
            
        }
        System.out.println("..");
        System.out.println("End of code ");


        
    }

    public static int[] searchEle(int nums[],int target){
        int ans[] ={-1,-1};

        int start = Search(nums,target,true);
        int end = Search(nums,target,false);

        ans[0]= start;
        ans [1]= end;
        return ans;


    }

    public static int Search(int []nums,int target ,boolean check ){
        int start = 0;
        int ans=-1;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }else{
                ans = mid;
                if(check){
                    end =mid-1;
                }else{
                    start =mid+1;
                }
            }
        }
        return ans;
    }
    
}
