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

    public static void addMid(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        // step 1: is to creat a new node
        Node newNode = new Node(data);
        size++;

        // creat variables to trivers
        Node temp = head;
        int i = 0;

        while (i < idx - 1) { // while loop to find the idx
            temp = temp.next;
            i++;
        }

        // step 2: make new node next to the temp next
        newNode.next = temp.next;

        // step 3: make temp next to the new node
        temp.next = newNode;

    }

    public int removeFirst() {

        if (size == 0) { // corner case
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } 

        // when both head an tail is supposed to change
        else if (size == 1) { 
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int vl = head.data;
        head = head.next; // main code to remove
        size--;
        return vl;
    }

    public int removelast() {
        
        if (size == 0) { //corner cases
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) { // both are pointing towards the same Node
            int val = head.data;
            head = tail =null;
            size = 0;
            return val;
        }

        Node prev = head; // to trivers till the size - 2
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int vl = tail.data; // prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return vl;
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

        learn ll = new learn(); //declaration of list

        ll.addFirst(2); //add
        ll.addFirst(1); 
        ll.addLast(3); 
        ll.addLast(4); 

        ll.addMid(2, 0); // add mid
        ll.addMid(4, 0); 

        ll.print(); // print
        
        System.out.println(ll.size); // get size

        System.out.println(ll.removeFirst()); //remove
        ll.print();
        System.out.println(ll.removelast());
        ll.print();

    }
}
