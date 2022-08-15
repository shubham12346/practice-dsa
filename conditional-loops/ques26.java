import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques26 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            li.add(n);
        }
        int sumn=0;
        int sume=0;
        int sumo=0;
        for(int i=0;i<li.size();i++){
            if(li.get(i)<0)
            {
                sumn= sumn - ( li.get(i));

            }
            if(li.get(i)>0 && li.get(i)%2==0)
            {
                sume+= li.get(i);
            }else if(li.get(i)>0 && li.get(i)%2==1){
                sumo+=li.get(i);
            }


        }

        System.out.println("Sum neg "+sumn+" sum pos"+sume+ "  Sum odd  "+sumo);
        
    }
    
}
