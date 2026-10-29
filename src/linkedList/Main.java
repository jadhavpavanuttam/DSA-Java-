package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(121);
        list.addLast(132);
        list.addLast(432);
        list.addLast(632);
        list.addMiddle(122, 1000);
        list.addLast(122);
        list.addLast(124);
        list.addLast(23);
        list.addFirst(12);
        list.display();
        list.addFirst(126);
        list.addFirst(123);
//        list.remove(122);
        list.addFirst(128);
        list.display();
        Node node = new Node(122);
        Node node1 = new Node(122);
        System.out.println("REVERSE 1 : " + list.reverse(node).hashCode());
        System.out.println("REVERSE 2 : " + list.reverse(node1).hashCode());

        if (list.hasCycle(node) || list.hasCycle(node1)) {
            System.out.println("YES OFFCOURSE CONTAINS CYCLE..!!");
        } else {
            System.out.println("NO ANY CYCLES...!!");
        }
        list.display();
    }
}

class LinkedList {
    Node head;

    public boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("\n\n");
    }

    public void addFirst(int data) {
        Node current = new Node(data);
        current.next = head;
        head = current;
    }

    public void addMiddle(int prev, int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            if (current.data == prev) {
                current.next = newNode;
                newNode.next = current;
            }
            current = current.next;
        }
        current.next = newNode;
    }

    public void remove(int data) {
        Node current = new Node(data);
        if (current.next == null) {
            return;
        }
        while (current.next != null) {
            if (current.data == data) {
                current.next = current;

                System.gc();
                break;
            }
            current.next = current.next.next;
        }
    }

    public Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }
}


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


/**
 * Def : A Linked List is a linear data structure where elements are stored in separate nodes.
 * <p>
 * Each node contains:
 * 1. Data.
 * 2. A reference to the next node.
 * Unlike an array, elements in a linked list are not required to be stored in contiguous memory locations.
 * Real-world example: Music playlist
 * Imagine a music playlist:
 * Song A -> Song B-> Song C -> Song D
 */