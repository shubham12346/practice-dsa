// 21. Java Program Vowel Or Consonant 

public class ques21 {
    public static void main(String[] args) {
        
        String st = " A lazy box jum over ashish pandey ";
        int countV=0;
        int countC=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='A' || st.charAt(i)=='e'|| st.charAt(i)=='E' || st.charAt(i)=='i'|| st.charAt(i)== 'I' || st.charAt(i)=='o'||st.charAt(i)=='O'|| st.charAt(i)== 'u' || st.charAt(i)=='U' ){
                countV++;

            }
            else if(st.charAt(i)!=' ')
            {
                countC++;
            }
        }
        System.out.println("Number of Consonants "+countC);
        System.out.println("Number of Vowels "+countV);
    }
    
}
