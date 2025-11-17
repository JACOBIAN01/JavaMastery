
import java.util.*;


public class Palindrome {
    public static boolean CheckPal(int n){
        char[] arr = String.valueOf(n).toCharArray();

        List<Character>l = new ArrayList<>();

        for(char i:arr){
            l.add(i);
        }

        Collections.reverse(l);
        

        return false;
    }
}
