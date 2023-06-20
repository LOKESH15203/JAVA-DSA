package _15_B_Search_T;

public class _1_B_Search_T {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    // ####################  CREATION
    public static Node Bst(Node root, int val){

        if(root == null){
            root = new Node(val);
            return root;
        }
        else if(val < root.data){
            root.left = Bst(root.left, val);
        }else
            root.right = Bst(root.right, val);

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // ####################  SEARCH

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static Node delNode(Node root, int key) {

        if (key < root.data) {
            root.left = delNode(root.left, key);
        } else if (key > root.data) {
            root.right = delNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;

            }
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            Node IS = findInorderSuccessor(root.right); // right - Because InOrder Successor of a root node is its rightmost leafNode
            root.data = IS.data;
            root.right = delNode(root.right, IS.data); // deleting the InOder Successor node as it has replaced the root node now
        }
        return root;
    }

        public static Node findInorderSuccessor(Node root){
            while (root.left != null){
                root = root.left;
            }
            return root;
        }

    public static void main(String[] args) {

        //          Making BST
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = Bst(root, values[i]);
        }

        //          Printing BST
        inOrder(root);
        System.out.println();

        //          Search in BST
//        System.out.println(search(root, 3));

        System.out.println(delNode(root, 3));
        inOrder(root);
        System.out.println();

    }
}