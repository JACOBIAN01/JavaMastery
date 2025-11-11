//Learn Set

import java.util.*;

public class LearnSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");

        System.out.println(set);

        Iterator<String> s = set.iterator();
        while (s.hasNext()) {
            String element = s.next();
            System.out.println(element);
        }
        for (String item : set) {
            System.out.println(item);
        }

        set.remove("Banana");
        System.out.println(set);

        set.clear();
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Apple"));

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        System.out.println(numbers);
    }
}
