package CAT;

public class LL3 {
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    static Node head;

    static void push(int newData){
        Node newNode = new Node(newData);
        newNode.next= head;
        head=newNode;
    }

    void DetectLoop(){
        Node slow = head ; Node Fast = head;
        while(slow!=null && Fast !=null && fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
            if(slow==Fast){
                System.out.println("Loop FOund");
                return;
            }
        }
        System.out.println("Loop Not Found");
    }

}
