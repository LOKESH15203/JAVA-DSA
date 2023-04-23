package _10_Linked_List;

import java.util.LinkedList;

public class _1_Basics {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node Tail;

    public void addFirst(int data){

        Node node = new Node(data);

        if(head == Tail){
            head = Tail = node;
        }

        node.next = head;

        head = node;
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

    }
}
