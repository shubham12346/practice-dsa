import java.util.Scanner;

// public 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions) {
    
// }

class ques4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtration : "+ (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division  : "+ (a/b));
        
    }
}