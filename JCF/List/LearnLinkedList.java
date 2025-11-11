
import java.util.*;

public class LearnLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Subha");
        list.add("Deep");
        list.add("Rahul");
        list.add("Rohit");
        list.addFirst("Jacob");
        list.addLast("Bian");

        list.remove("Deep");
        list.remove("Rohit");
        list.removeFirst();
        list.removeLast();

        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.size());
        System.out.println(list.contains("Deep"));
        Iterator<String> s = list.iterator();

        while (s.hasNext()) {
            String element = s.next();
            System.out.println(element);
        }

    }
}
