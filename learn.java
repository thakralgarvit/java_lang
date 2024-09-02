import java.util.*;

import javax.print.DocFlavor.STRING;

public class learn {

    public static class Node {
        int data; // can be of anytype
        Node next; // refer to chain

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // static so that it can be used anywhere
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {

        // step 1: is to creat a new node
        Node newNode = new Node(data);
        size++;

        // check if the link is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: to make newNode next its head
        newNode.next = head; // link

        // step 3: to update our head to newNode
        head = newNode;
    }

    public static void addLast(int data) {

        // step 1: is to creat a new node
        Node newNode = new Node(data);
        size++;

        // check if the link is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: to make tail's next the newNode
        tail.next = newNode; // link

        // step 3: to update our tail to newNode
        tail = newNode;
    }

    public static int search(int target) {

        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == target) {
                System.out.println("target has been found");
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }

        return -1;
    }

    public static int helper(Node head, int key) {

        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public static int reSearch(int key) {
        return helper(head, key);
    }

    public static void print() {
        if (head == null) { // corner case
            System.out.println("ll is empty");
            return;
        }
        // variable to triverse
        Node temp = head;

        // loop to run till the null node
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        learn ll = new learn(); // declaration of list

        ll.addFirst(2); // add
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.addMid(2, 0); // add mid
        ll.addMid(4, 0);

        ll.print(); // print

        System.out.println(ll.size); // get size

        System.out.println(ll.removeFirst()); // remove
        ll.print();
        System.out.println(ll.removelast());
        ll.print();

        System.out.println(ll.search(1)); // search (linear)

        System.out.println(ll.reSearch(3)); // recurtion search

    }
}
