import java.util.Scanner;

// 7. To calculate Fibonacci Series up to n numbers.

public class ques7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
            int a=0,b=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(a +" ");

            int temp = a+b;
            a = b;
            b= temp;
           
        }
        System.out.println(" ");

    }
    
}
