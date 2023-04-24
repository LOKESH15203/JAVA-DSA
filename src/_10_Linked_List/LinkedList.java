package _10_Linked_List;

public class LinkedList {


    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // #####################################################################################
    public void addFirst(int data){

        Node node = new Node(data);
        size++;
        if(head == null){
            head = tail = node;
        }

        node.next = head;

        head = node;
    }
    // #####################################################################################
    public void addLast(int data){
        Node node = new Node(data);
        size++;
        if(head == null){
            head = tail = node;
        }

        tail.next = node;

        tail = node ;
    }

    // #####################################################################################
    public void printll() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    // #####################################################################################
    public void addMiddle(int idx, int data){

        if(idx ==0){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        if(head == null){
            head = tail = null;
        }

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
    }
    // #####################################################################################
    public int removeFirst(){
        int val = head.data;

        if(size ==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            head = tail = null;
            size=0;
            return val;
        }
        head = head.next;
        size--;
        return val;
    }
    // #####################################################################################
    public int removeLast(){
        int val = tail.data;
        if(size ==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1) {
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev= head;
        for(int i =0; i < size-2; i++){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // #####################################################################################
    public void iteSearch(int sdata){
        int idx = 0;
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty");
            return;
        }

        while(temp.next != null){
            System.out.println();
            temp = temp.next;
            idx++;
            if(temp.data == sdata){

                System.out.println("Required data is at index : " + idx);
                break;
            }else {
                System.out.println("LL has No such entry");
                break;
            }
        }
    }
// #####################################################################################

    public void recursiveSearch(int sdata, Node head){
        int idx = 0;
        idx++;
        Node temp = head;
        while(temp.next != null )
        if(temp.data == sdata){
            System.out.println(idx);
        }
        else{
            recursiveSearch(sdata, temp.next);
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(9);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(8);
        ll.addMiddle(2, 4);
        System.out.println(ll.removeFirst());
        ll.removeLast();

        System.out.println(ll.size);

        ll.printll();
//        ll.iteSearch(4);
//        ll.iteSearch(100);

        ll.recursiveSearch(9, head);
    }
}
