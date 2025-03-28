package CAT;

class Node {

    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class LL {

    Node head;

    public void append(int d) {
        Node new_data = new Node(d);
        if (head == null) {
            head = new_data;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
            current.next = new_data;
        }
    }

    public void Even_Odd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node evenHead = null;
        Node evenTail = null;
        Node OddHead = null;
        Node OddTail = null;

        Node current = head;
        while (current != null) {
            int data = current.data;
            if (data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            } else {
                if (OddHead == null) {
                    OddHead = OddTail = current;
                } else {
                    OddTail.next = current;
                    OddTail = current;
                }
            }

        }
    }
}
