

// 10. [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)

public class ques10 {
    public static void main(String[] args) {
        String s= "thequickbrownfoxjumpsoralazydog";
    
        if(checkIfPangram(s))
        {
            System.out.println(" True");
        }else{
            System.out.println("False ");
        }
    }

    public static boolean  checkIfPangram(String sentence) {
        String s ="";
        for(int i=0;i<26 ;i++){
            s= s + (char) (97+i) ;

        }
        int count =0;
        
        for(int i=0 ;i<s.length();i++){
            int flag =0;
           for(int j=0;j<sentence.length();j++){

            if(s.charAt(i) == sentence.charAt(j))
            {
                flag=1;
                count++;
           
                break;

            }          

           }
           if(flag!=1)
           {
            return false;
           }
        }

        return count==26;

    }

    public static boolean staticmetho2(String sentence)
    {
          boolean flag = false ;
        
        for(char  i='a';i<='z';i++)
        {
            if(sentence.indexOf(i)>=0)
            {
                flag = true;
            }else{
                return false;
            }
        }
        return flag;

    }
    }
    
}
