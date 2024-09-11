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

    public Node findMid(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // +2
            slow = slow.next;// +1
        }

        return slow; // slow is our mid point

    }

    public boolean findPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 to find mid
        Node mid = findMid(head);
        // step 2 to reverse the second half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev; // mid point
        // step 3 to check
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
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
        System.out.println(ll.findPalindrome());

    }
}
