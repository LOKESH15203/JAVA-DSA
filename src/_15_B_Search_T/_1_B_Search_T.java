package _15_B_Search_T;

import java.util.ArrayList;

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

    // ###################  DELETING a Node in BST
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

    // ########    Print in Range
    public static void printFromTo(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){   // When root lies between k1 and k2
            printFromTo(root.left, k1, k2);
            System.out.print(root.data+" ");
            printFromTo(root.right, k1, k2);
        }
        else if(k2 < root.data){                  // when both k1 and k2 in left Subtree
            printFromTo(root.left, k1, k2);
        }
        else if(k1> root.data){                   // When both k1 and k2 in right subtree
            printFromTo(root.right, k1, k2);
        }
    }


    //           Root to leaf PATHS
    public static void rTolPaths(Node root, ArrayList<Integer> al){
        if(root == null){
            return;
        }
        al.add(root.data);                             // add Each node that is visited
        if(root.left == null && root.right == null){   // When Reaching the leaf we get the PATH so we print the path
            for(int i=0; i<al.size(); i++){
                System.out.print(al.get(i)+ " -> ");
            }
            System.out.println("Null");
        }
        rTolPaths(root.left, al);
        rTolPaths(root.right, al);
        al.remove(al.size()-1);                   // Remove the leaf node whose path is now printed and also while backtracking removes the subParents
    }



    public static void main(String[] args) {

        //          Making BST
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = Bst(root, values[i]);
        }

        //          Printing BST
        inOrder(root);
        System.out.println();

        //          Search in BST
//        System.out.println(search(root, 3));


        //          DELETING a node
//        System.out.println(delNode(root, 3));
//        inOrder(root);
//        System.out.println();

        //          Print in RANGE
//        printFromTo(root, 5, 12);

        //          Print root to leaf path
        rTolPaths(root, new ArrayList<>());

    }
}