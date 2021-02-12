public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void printValues() {
        if(head == null) {
            System.out.println("This list empty yo");
        } else if(head != null) {
            Node runner = head;
            while(runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

    public void remove() {
        if(head.next == null){
            this.head = null;
        }
        Node runner = head;
        while(runner.next != null) {
            if(runner.next.next == null) runner.next = null;
            else if (runner.next!=null) runner = runner.next;
        }
    }
}