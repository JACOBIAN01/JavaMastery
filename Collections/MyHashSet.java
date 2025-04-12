import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args){
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        set2.add(5);
        set2.add(6);

        set.addAll(set2);
        System.out.println(set);

        set.remove(1);
        set.remove(2);
        System.out.println(set);

        System.out.println(set.contains(4));
    }
}
