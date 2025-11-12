
public class CountDigit{
    public static Integer digitCount(int n){
        return String.valueOf(n).length();
    }

    public static void main(String[] args) {
        System.out.println(digitCount(999001));
    }
}