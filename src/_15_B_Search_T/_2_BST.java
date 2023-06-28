package _15_B_Search_T;

public class _2_BST {

    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int val){
            data = val;
            right = left = null;
        }
    }

    static int i;
    public static Node buildTree(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2 ;   // = 3 i.e. 0, 1, 2, 3 i.e. 4th element
        Node root = new Node(arr[mid]);

        root.left = buildTree(arr, start, mid-1);
        root.right = buildTree(arr, mid+1, end);
        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        Node root = buildTree(arr, 0, 6);
        preOrder(root);
    }
}
