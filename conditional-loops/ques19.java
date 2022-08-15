import java.util.Scanner;

// 19. HCF Of Two Numbers Program

public class ques19 {
    static int hcf(int x,int y){
        if(y==0){
            return x;
        }

        return hcf(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf =0;
        for(int i=1;i<= a&& i<=b ;i++){
            if(a%i==0 && b%i==0 ){
                    hcf = i;
            }
        }
        System.out.println(hcf);
        System.out.println("naive approach "+ hcf(10, 25));

    }
    
}
