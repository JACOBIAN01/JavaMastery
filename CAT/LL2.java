package CAT;

import java.util.HashSet;

public class LL2 {

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    static Node head;

    static public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static boolean DetectLoop(Node node){
            HashSet<Node>n = new HashSet<Node>();
            while(n!=null){
                if(n.contains(node)){
                    return true;
                }
                n.add(node);
                node = node.next;
            }
            return false;
    }   
}

