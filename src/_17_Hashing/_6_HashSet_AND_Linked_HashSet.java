package _17_Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _6_HashSet_AND_Linked_HashSet {


    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(5);
        hs.add(2);
        hs.add(6);
        System.out.println(hs);

        System.out.println(hs.contains(1));

        hs.remove(5);
        System.out.println(hs);


        LinkedHashSet<String> lhs = new LinkedHashSet<>(); // Prints in the order of the inputs made
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);
        // All operations of HashSet can be performed on likedHashSet
    }
}
