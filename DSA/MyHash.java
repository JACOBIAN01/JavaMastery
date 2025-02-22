import java.util.*;

public class MyHash {
    public static void main(String[] args) {
        HashMap<String,Integer>map = new HashMap<>();
        map.put("Potato",2);
        map.put("Brocoli",1);
        System.out.println(map);
        System.out.println(map.get("Potato"));
        System.out.println(map.remove("Brocoli"));
        System.out.println(map);
    }
}
