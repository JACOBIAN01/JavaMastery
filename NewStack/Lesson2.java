package NewStack;

import java.util.Scanner;
import java.util.Stack;

public class Lesson2 {


    static  boolean check(int x[] , int y[],int n){
        Stack<Integer>mystack = new Stack<>();
        int j = 0;
        for(int i =0;i<n;i++){
            mystack.push(x[i]);
            while(!mystack.isEmpty()&&y[j]==mystack.peek()){
                mystack.pop();
                j++;
            }
        }
        return mystack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        int arr[] = {1,2,3,4};
        int brr[] = {1,2,3,4};
        int n = arr.length;
        System.out.println(check(arr,brr,n));

       
    }
}
