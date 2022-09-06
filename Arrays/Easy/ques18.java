import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
class ques18{
    public static void main(String[] args) {
        int num[] ={9,9,9};
        List<Integer> ans = addArray(num, 9);

        
        System.out.println(ans.toString());
        
    }
    public static List<Integer> addArray(int num[],int k){

        // int l = num.length;
        // int carry = k;
        // List<Integer> li = new ArrayList<>();
        // while(--l>=0 || carry >=0 )
        // {
        //     if(l>=0){
        //         carry+= num[l];
        //     }
        //     li.add(carry%10);
        //     carry=carry/ 10;

        // }
        // Collections.reverse(li);
        // return li;

        int N = num.length;
        int cur = k;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += num[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }
}