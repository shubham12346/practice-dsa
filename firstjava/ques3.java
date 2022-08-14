import java.util.Scanner;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class ques3 {
    public static void main(String[] args) {
        System.out.println("Enter Principal Time and Interest ");
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int time = sc.nextInt();
        float rate = sc.nextFloat();

        System.out.println("The simple interes is  : "+ (principal*time*rate)/100);
        

        
    }
    
}
