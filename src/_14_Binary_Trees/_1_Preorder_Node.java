package _14_Binary_Trees;

import org.w3c.dom.CDATASection;

public class _1_Preorder_Node {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){

            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preTraversal(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preTraversal(root.left);
            preTraversal(root.right);
        }
        public static void InTraversal(Node root){
            if(root == null){
                return;
            }
            InTraversal(root.left);
            System.out.print(root.data + " ");
            InTraversal(root.right);
        }
        public static void postTraversal(Node root){
            if(root == null){
                return;
            }
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        tree.preTraversal(root);
        System.out.println();
        tree.InTraversal(root);
        System.out.println();
        tree.postTraversal(root);
    }
}
