import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Write a function to check if a given triplet is a Pythagorean triplet or not.

class ques12{
    
    public static void main(String[] args) {
        int arr[] =  {3, 1, 4, 6, 5};
    
          
     
      System.out.println(isTriplet(arr));

      
    }

    static boolean isTriplet(int arr[])
    {
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1; i >= 2; i--) {

            int l = 0;
            int r = i - 1;
            while (l < r) {

                if (arr[i] == arr[l] + arr[r]) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[l]);
                    ans.add(arr[r]);
                    li.add(new ArrayList<>(ans));
                    System.out.println(li);
                   return true;
                }
                if (arr[i] > arr[l] + arr[r]) {
                    l++;
                } else {
                    r--;
                }
            }

        }

        return false;
    }
}