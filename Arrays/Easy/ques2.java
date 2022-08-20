//package Arrays.Easy;
// 2. [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
public class ques2 {
    public static void main(String[] args) {
     
        int nums[] ={1,2,1};// out put nums ={1,2,1,1,2,1}

        int num2[]= new int[nums.length*2];
        int flag =0;
        int j=0;
        for(int i=0;i<num2.length ;i++){
         
                num2[i] = nums[j];
                j++;

                if(j== nums.length)
                {
                    flag++;
                    j=0;
                }

        }

        for (int i : num2) {
            System.out.print(i+" ");
            
        }
    }
    
}
