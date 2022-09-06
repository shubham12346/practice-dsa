// 27. [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

public class ques27 {
    public static void main(String[] args) {
        int nums []= {0,0,1,1,1,2,2,3,3,4,4};
        int ans = removeduplicate(nums);
        System.out.println(ans);
        
    }

    public static int removeduplicate(int []num){
        if(num.length==0)return 0;

        int j=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=num[j])
            {
                j++;
                num[j]= num[i];
            }

        }
        return j+1;
    }
    
}
