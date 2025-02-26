
import java.util.*;



public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String text = sc.next();
        System.out.println(number);
        System.out.println(text);
        sc.close();
    }
}
