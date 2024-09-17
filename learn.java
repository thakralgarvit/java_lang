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

    public boolean checkcycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    public static void removecycle(learn ll) {
        Node prev = null;
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
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
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkcycle());
        head.next.next.next.next.next = head.next.next;
        System.out.println(ll.checkcycle());
        removecycle(ll);
        ll.print();
        System.out.println(ll.checkcycle());

        

    }
}
