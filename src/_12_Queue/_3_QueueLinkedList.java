package _12_Queue;

public class _3_QueueLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int val){
            data = val;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

     public static class LLQueue{

         public static isEmpty(){

         }

         public void add(int val){
             if(head == tail){
                 head.data = val && tail.data = val;
             }
             Node newnode = new Node(val);
             Node temp = head;
             while(temp.next != null){
                 temp = temp.next;
             }
             temp.next = newnode;
             tail = newnode;
         }

         public void remove(){
             if(head == tail)
         }
     }

    public static void main(String[] args) {

    }
}
