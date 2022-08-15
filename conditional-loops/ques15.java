import java.util.Scanner;

// 15. Find Ncr & Npr
public class ques15 {

     double fact(double n ){
            int i=1;
            double fact =1;
            while(i<=n){
                fact = fact*i;
                i++;
            }

            return fact;
    } 

    double ncr(double  n ,double  r)
    {

        return   fact(n)/(fact(n-r)) ;

    }

   double npr (double n ,double r ){
        return fact(n)/(fact(n-r)*fact(r))  ;
    }
    public static void main(String[] args) {
        ques15 k = new ques15();
        Scanner st = new Scanner(System.in);
        System.out.println("Enter n value ");
        double n = st.nextDouble();

        System.out.println("Enter the value of r ");
        double r = st.nextDouble();
        System.out.println(n+" "+r);
        System.out.println("NCR is "+ k.ncr(n, r));
        System.out.println("NPR is "+ k.npr(n, r));
        st.close();
    }
    
}
