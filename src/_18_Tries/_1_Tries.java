package _18_Tries;

public class _1_Tries {

    static class Node {
        Node children[] = new Node[26];    // 26 alphabets
        boolean eow = false;               // End of Row = eow

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();         // This is always empty

    public static void main(String[] args) {

    }
}
