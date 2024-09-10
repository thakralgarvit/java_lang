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

        newNode.next = head;

        head = newNode;
    }

    public static void addLast(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public static void reverse() {
        Node prev = null;
        Node crr = tail = head;
        Node next;

        while (crr != null) {
            next = crr.next;
            crr.next = prev;
            prev = crr;
            crr = next;
        }
        head = prev;
    }

    public static void removeNthFromLast(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) { // to get the size of linked list
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // corner case if our num is equal to size
            return;
        }

        int i = 1;
        int itoFind = sz - n; // to go till one position back
        Node prev = head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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

        learn ll = new learn();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
        ll.removeNthFromLast(3);
        ll.print();

    }
}
