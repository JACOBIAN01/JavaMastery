
import java.util.*;
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String>cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Ferrari");
        System.out.println(cars);
        cars.addFirst("Suzuki");
        cars.addLast("Nissan"); 
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());    
    }
}
