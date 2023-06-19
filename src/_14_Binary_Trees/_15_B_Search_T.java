package _14_Binary_Trees;

import java.util.ArrayList;

public class _15_B_Search_T {

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

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = Bst(root, values[i]);
        }

        inOrder(root);
        System.out.println();
    }
}