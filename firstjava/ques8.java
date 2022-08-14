// 8. To find out whether the given String is Palindrome or not.

public class ques8 {
    public static void main(String[] args) {
        String a = "m a d a m";
        int flag =0;
        
            for(int i =0 ; i<a.length()/2 ;i++){
                if(a.charAt(i)!= a.charAt(a.length()-1-i)){
                    flag =1;
                    break;
                }
                
            }

            if(flag==0)
            {
                System.out.println("palindrome");
            }else{
                System.out.println("not a palindrome ");
            }
          
    }
    
}
