import java.net.SocketTimeoutException;
import java.util.Scanner;

// 7. Power In Java

class ques7{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n  = sc.nextInt();
    System.out.println("Enter the power ");
    int p = sc.nextInt();
    int ans =1;
    if(p==0)
    {
     System.out.println(" 1 ");
    }
    while(p>0){
        ans = ans*n;
        p--;
    }
    System.out.println(" Ans is  : "+ans);
    }
}