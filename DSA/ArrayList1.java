package DSA;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,9);
        list.set(1,3);
        list.remove(3);
        System.out.println(list.size());
        System.out.println(list);
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
