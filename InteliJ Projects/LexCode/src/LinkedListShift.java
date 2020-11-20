class Node2 {

    private String data;
    private Node2 next;

    public Node2(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node2 node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node2 getNext() {
        return this.next;
    }
}


class LinkedList2 {

    private Node2 head;
    private Node2 tail;

    public Node2 getHead() {
        return this.head;
    }

    public Node2 getTail() {
        return this.tail;
    }

    public void addAtEnd(String data) {
        Node2 node = new Node2(data);

        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);

            this.tail = node;
        }
    }

    public void addAtBeginning(String data) {
        Node2 node = new Node2(data);

        if (this.head == null) {
            this.head = this.tail = node;
        }

        else {
            node.setNext(this.head);
            this.head = node;
        }
    }

    public void display() {
        Node2 temp = this.head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node2 find(String data) {
        Node2 temp = this.head;

        while (temp != null) {
            if (temp.getData().equals(data))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public void insert(String data, String dataBefore) {
        Node2 node = new Node2(data);

        if (this.head == null)
            this.head = this.tail = node;
        else {
            Node2 nodeBefore = this.find(dataBefore);
            if (nodeBefore != null) {
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
                if (nodeBefore == this.tail)
                    this.tail = node;
            }
            else
                System.out.println("Node not found");
        }
    }

    public void delete(String data) {

        if (this.head == null)
            System.out.println("List is empty");
        else {
            Node2 node = this.find(data);

            if (node == null)
                System.out.println("Node not found");

            if (node == this.head) {
                this.head = this.head.getNext();
                node.setNext(null);

                if (node == this.tail)
                    tail = null;
            }
            else {
                Node2 nodeBefore = null;
                Node2 temp = this.head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }

                nodeBefore.setNext(node.getNext());

                if (node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }
        }
    }
}


class Tester18 {

    public static void main(String args[]) {
        LinkedList2 linkedList1 = new LinkedList2();
        linkedList1.addAtEnd("ABC");
        linkedList1.addAtEnd("DFG");
        linkedList1.addAtEnd("XYZ");
        linkedList1.addAtEnd("EFG");

        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.addAtEnd("ABC");
        linkedList2.addAtEnd("DFG");
        linkedList2.addAtEnd("XYZ");
        linkedList2.addAtEnd("EFG");

        System.out.println("Initial List");
        linkedList1.display();

        System.out.println("\nList after left shifting by 2 positions");
        shiftListLeft(linkedList1, 2);
        linkedList1.display();

        System.out.println("\nInitial List");
        linkedList2.display();

        System.out.println("\nList after right shifting by 2 positions");
        shiftListRight(linkedList2, 2);
        linkedList2.display();
    }

    public static void shiftListLeft(LinkedList2 linkedList, int n) {
        //Implement your code here
        for(int i=0; i<n; i++){
            Node2 head = linkedList.getHead();
            linkedList.addAtEnd(head.getData());
            linkedList.delete(linkedList.getHead().getData());
        }
    }

    public static void shiftListRight(LinkedList2 linkedList, int n) {
        //Implement your code here
        for(int i=0; i<n; i++){
            Node2 tail = linkedList.getTail();
            linkedList.delete(tail.getData());
            linkedList.addAtBeginning(tail.getData());
        }
    }
}

