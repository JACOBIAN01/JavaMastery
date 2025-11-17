
import java.util.*;

public class Reverse {

    public static Integer Rev(int n) {
        String s = String.valueOf(n);
        List<Character> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            l.add(c);
        }

        // Step 2: Reverse the list
        Collections.reverse(l);

        // Step 3: Convert the reversed list back to a string
        StringBuilder sb = new StringBuilder();
        for (char c : l) {
            sb.append(c);
        }

        // Step 4: Convert string back to integer
        int m = Integer.parseInt(sb.toString());
        return m;
    }

    public static void main(String[] args) {
        int num = 12345;
        int reversed = Rev(num);
        System.out.println("Original: " + num);
        System.out.println("Reversed: " + reversed);
    }
}
