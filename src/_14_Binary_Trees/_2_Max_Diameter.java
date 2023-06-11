package _14_Binary_Trees;

public class _2_Max_Diameter {

    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int val) {
            data = val;
            right = null;
            left = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
        public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int leftHigh = height(root.left);
        int rightHigh = height(root.right);

        int rootDia =  leftHigh+rightHigh+1;

        return Math.max(rootDia, Math.max(leftDia, rightDia));
    }

    public static void main(String[] args) {
        /*
                      1
                    /   \
                  2      3
                /  \   /  \
              4    5  6    7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
