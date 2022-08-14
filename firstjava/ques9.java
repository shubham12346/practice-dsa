import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

//9. To find Armstrong Number between two given number.

public class ques9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> li = new ArrayList<>();

        for(int i = a ;i<=b ;i++){

            int temp =i;
            int temp2 =i;
            int sum =0;
            while(temp2>0)
            {
                int rem = temp2%10;
                sum= sum +  rem*rem*rem;
                temp2 = temp2/10;

            }
           
            if(temp == sum)
            {
                li.add(temp);
            }

    

        }
        System.out.println(li);
    }
    
   
    
}
