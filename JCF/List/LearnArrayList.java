import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add(1,"Subhadeep");

        System.out.println(list.get(2));
        System.out.println(list);

        list.set(0,"Alicia");
        System.out.println(list);

        list.remove(2);
        list.remove("Subhadeep");
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains("Subhadeep"));

        for(String s:list){System.out.println(s);}

        // String[] arr = list.toArray(new String[0]);
        // for(String s:arr){System.out.println(s);}

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        for(int i:list2){System.out.println(i);}
        Iterator<Integer> i = list2.iterator();
        while(i.hasNext()){
            System.out.println(i);
        }




    }
}
