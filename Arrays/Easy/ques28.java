// 28. [Minimum Cost to Move Chips to The Same Position](https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/)
public class ques28 {
    public static void main(String[] args) {
    
        
    }
    
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;

        for (int i : position) {
            if (i % 2 == 0)
                ++odd;
            else
                even++;
        }
        return Math.min(odd, even);

    }
    
}
