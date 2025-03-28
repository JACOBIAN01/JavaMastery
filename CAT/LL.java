package CAT;

import java.util.HashSet;

class  LinkedL {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static boolean DetectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();

        while (h != null) {
            if (s.contains(h)) {
                return true;
            }
            s.add(h);
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();

        list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);

        list.head.next.next.next.next = list.head;

        if (DetectLoop(head)) {
            System.out.println("Loop Exists");
        } else {
            System.out.println("Loop Not Exist");
        }
    }

}
