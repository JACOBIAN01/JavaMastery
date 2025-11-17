public class LearnString {
    public static void main(String[] args) {
        
        String s = "Hello";
        String s1 = new String("Hi");
        System.out.println(s);
        System.out.println(s1);

        char[] arr = {'H','e','l','l','o'};
        String s2 = new String(arr);
        System.out.println(s2);

        String s3 = "Codingal";
        System.out.println(s3.length());

        for(char i:s3.toCharArray()){
            System.out.println(i);
        }

        String s4 = s3.substring(0,3);
        System.out.println(s4);

        System.out.println(s3.contains("Coding"));

        
    }
}
