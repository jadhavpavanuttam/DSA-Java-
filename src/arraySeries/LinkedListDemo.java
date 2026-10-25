package arraySeries;

import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.add(32);
        l1.add(41);
        l1.add(42);
        l1.printValues();    //printing the value
        l1.addFirst(15);   //add first
        l1.add(23);
        l1.add(21);
        l1.add(25);
        l1.addMiddle(15, 123);
        l1.add(28);
        l1.add(45);    //add last
        l1.remove(41);  //remove from given data
        l1.printValues();
        l1.addMiddle(23, 120);
        System.out.println("After Positional Argument  :");
        l1.printValues();
//        while (true) {
//            System.out.println("Enter number for your choice.");
//            Scanner scanner = new Scanner(System.in);
//            int i = scanner.nextInt();
//            switch (i) {
//                case 1: {
//                    System.out.println("Enter a Number :  ");
//                    l1.add(scanner.nextInt());
//                    break;
//                }
//                case 2: {
//                    System.out.println("Enter a Number :  ");
//                    l1.add(scanner.nextInt());
//                    break;
//                }
//                case 3: {
//                    System.out.println("Enter a Number :  ");
//                    l1.add(scanner.nextInt());
//                    break;
//                }
//                case 4: {
//                    System.out.println("Enter a Number :  ");
//                    l1.add(scanner.nextInt());
//                    break;
//                }
//                case 5: {
//                    System.out.println("You are exit now..!!");
//                    try {
//                        Thread.sleep(2000L, (int) System.currentTimeMillis());
//                    } catch (Exception e) {
//                        System.out.println("Thread Is Interrupted  !! ");
//                    }
//                    Thread.currentThread().interrupt();
//                }
//                System.exit(0);
//            }
    }

}



class LinkedList {
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        Node currntNode = head;  //null
        if (head == null)
            head = newNode;     //points to new node -> given data
        else {
            while (currntNode.next != null)
                currntNode = currntNode.next;
            currntNode.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addMiddle(int prev, int data) {
        Node current = head;

        while (current != null && current.data != prev) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;  //linking of a node
            current.next = newNode;

        }
    }

    public void removeLast(int data) {

    }

    public void remove(int data) {
        Node current = head;
        while (current.next != null && current.next.data != data)  //DataWise delete the given node
            current = current.next;   //no need here to delete memory
        if (current.next != null) {    //Garbage Collector can automatically delete it
            current.next = current.next.next;
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
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


/*
head -> [ data | next] -> [data |next ]....nul
 */

/*
Time Complexity :

JavaInterviewQuetions.LinkedList is : O(1).
insertion & deletion is easily being
JavaInterviewQuetions.Node & data
non-sequenced memory
 */


