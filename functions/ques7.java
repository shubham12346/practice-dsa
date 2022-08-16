// Define a method to find out if a number is prime or not

import java.util.Scanner;

class ques7{
    static int checkPrime(int a)
    {
          for(int i=2;i<a;i++){
            if(a%i==0){
                return 1;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int flag = 0;
        flag = checkPrime(a);

      

        if(flag==0){
            System.out.println("It is a prime number ");
        }else{
            System.out.println("It is not an prime number ");
        }

    }
}