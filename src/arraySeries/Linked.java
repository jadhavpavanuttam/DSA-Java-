package arraySeries;

;

public class Linked {
    Node head;

    void showAll(int data) {
        Node newNode = new Node(data);
        while (newNode.data != data && head.next != null) {
            head.next = head;
            newNode = newNode.next;
            System.out.println(newNode.next.data);
        }
        if (newNode.data == data) {
            System.out.println("Stopped...");
            newNode.next = null;

        }
    }

    public static void main(String[] args) {

        Node node = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        node.next = node1;
//        node.next.next=node2;
//        node.next.next.next=node3;
        node1.next = node2;
        node2.next = node3;
        node3.next = node;
        System.out.println("Node 1 : " + node.next.data);
        System.out.println("Node 2 : " + node1.next.data);
        System.out.println("Node 3 : " + node2.next.data);
        System.out.println("Node 1 : " + node3.next.data);
        System.out.println("Node 2 : " + node.next.data);
        System.out.println("Node 3 : " + node1.next.data);
        System.out.println("Node 1 : " + node2.next.data);
        System.out.println("Node 2 : " + node3.next.data);
        System.out.println("Node 3 : " + node.next.data);
        System.out.println("Node 1 : " + node1.next.data);
        System.out.println("Node 2 : " + node2.next.data);
        System.out.println("Node 3 : " + node3.next.data);
        System.out.println("Node 1 : " + node.next.data);
        new Linked().showAll(40);

//        System.out.println("Node 1 : "+node.data);

//        System.out.println("Data of  2 node : "+node.next.data);
//        System.out.println("Data of  3 node : "+node.next.next.data);
//        System.out.println("Data of  4 node : " +node.next.next.next.data);
//        System.out.println("Data of  5 node : "+node.next.next.next.next.data);
//
//        node.next.next.next.data=12;
//        System.out.println("Last Node Data : "+node.next.next.next.data);
//        System.out.println();
//        node.next.data=0;   //second node.data =0
//        System.out.println(node.next.data);
    }
//    void addFirst(int data)
//    {
//        Node current=new Node(20);
//        if(head.next==null)
//        {
//            head.next=current;
//            return;
//        }
//        while (head.next!=null)
//            head.next=current;
//        System.out.println(current.data);
//    }
}

class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}