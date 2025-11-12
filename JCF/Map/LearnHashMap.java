//

import java.util.*;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");

        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Banana"));


        map.remove(2);
        System.out.println(map);

        for(Map.Entry<Integer,String> item: map.entrySet()){
            System.out.println(item.getKey()+" : "+item.getValue());

        }

        System.out.println(map.size());
    }
}
