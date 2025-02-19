import java.util.*;
class MyStack{
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        for(int i=0;i<n;i++){
            a= sc.nextInt();
           if(st.isEmpty()||a<st.peek()){
                st.push(a);
           }
        }
        System.out.println(st.peek());
    }
}