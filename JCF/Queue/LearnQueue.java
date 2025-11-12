//
import java.util.*;

public class LearnQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.poll());

        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        Deque<String> dq = new ArrayDeque<>();

        // Insert at both ends
        dq.addFirst("Front-1");
        dq.addLast("Back-1");
        dq.offerFirst("Front-2");
        dq.offerLast("Back-2");

        System.out.println("ArrayDeque elements: " + dq);

        // Peek at both ends
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        // Remove from both ends
        System.out.println("Removed First: " + dq.pollFirst());
        System.out.println("Removed Last: " + dq.pollLast());

        System.out.println("After removals: " + dq);

        // Use ArrayDeque as Stack
        dq.push("Stack-1");
        dq.push("Stack-2");
        System.out.println("After pushes: " + dq);
        System.out.println("Popped element: " + dq.pop());
        System.out.println("After pop: " + dq);

        // Iterate
        System.out.println("Iterating forward:");
        for (String s : dq) {
            System.out.println(s);
        }

        System.out.println("Iterating backward:");
        Iterator<String> it = dq.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
