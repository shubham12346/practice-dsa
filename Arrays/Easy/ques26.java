import java.util.ArrayList;
import java.util.*;

// 26. [Plus One](https://leetcode.com/problems/plus-one/)
public class ques26 {
    public static void main(String[] args) {
        int di[]={1,2,4};
        int ans[] = plusOne(di);
        for (int i : ans) {
            System.out.print(i + " ");
            
        }
    }

    public static int[] plusOne(int []num){
        int carry =1;
        List<Integer> li = new ArrayList<>();

        int i = num.length;
        while(--i >=0 || carry>0)
        {
            if(i>=0){
                carry+= num[i];
            }
            li.add(carry%10);
            carry= carry/10;
        }

        int ans []= new int[li.size()];
        for(int j =0 ;j<ans.length;j++){
            ans[j]  = li.get(li.size()-1-j);
        }

        return ans;
    }
    
}
