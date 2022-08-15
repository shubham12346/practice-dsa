// 16. Reverse A String In Java

public class ques16 {
    public static void main(String[] args) {
        String str = " hello i am shubham ";
            char ch;
            String str2="";
        for(int i= str.length()-1;i>=0;i--){
            ch = str.charAt(i);
            str2 = str2+ch;

           
        }
        System.out.println(str2);
    }
    
}
