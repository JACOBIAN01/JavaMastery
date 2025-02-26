import java.util.ArrayList;

public class AL1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
