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

    // #####################################################################################
    public int helper(Node head, int key){  // 0(n) for call stack
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1; // Because the No. on the previous No. knows that the head that
                      //  just returned 0 is not the head, and I am the head.
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    // #####################################################################################
    public void reversell(){

        Node prev = null;
        Node curr = tail = head; // As reversing - inserting head's value in tail - then - tail's value in curr.
        Node next;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // as current is now NULL
    }
    // #####################################################################################
    public void deleteNthFromLast(int n){
        Node temp = head;
        int i =1;
        while(i < size-n){               // size-n = prev node // size-n+1 = Node to be deleted
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        System.out.println();
        printll();
        return;
    }
    // #####################################################################################
    public Node mid(Node head){  // This returns the NODE at mid-position NOT THE INDEX
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        // find mid node
//        int mid = size/2;
        // ORR
        Node midNode = mid(head); // This returns the NODE at mid-position NOT THE INDEX 🔴
        // REVERSE
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Check of left Equal to right
         while(right != null){
             if(left.data != right.data){
                 return false;
             }
             right= right.next;
             left = left.next;
         }
         return true;
    }
    // #####################################################################################
    // #####################################################################################
    // #####################################################################################
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
//        ll.addMiddle(2, 4);
        System.out.println(ll.size);

//        ll.printll();
        System.out.println();
//        ll.iteSearch(4);
//        ll.iteSearch(100);

//        System.out.println(ll.recSearch(9));
//        ll.reversell();
//        ll.printll();
//        ll.deleteNthFromLast(2);
//        System.out.println();
        System.out.println(ll.checkPalindrome());

    }
}
