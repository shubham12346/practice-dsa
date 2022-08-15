import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 22. Perfect Number In Java

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        int n = sc.nextInt();
        int temp = n;
        for(int i =1;i<n;i++){

            if(n%i==0){
               li.add(i);
            }
            

        }
        int sum=0;
        for(int  i : li)
        {

                sum+=i;
        }

        if(sum== n){
            System.out.println("It is a perfect numebr ");
        }else{
            System.out.println("It is not a perfect number ");
        }
       

    }
    
}
