package _17_Hashing;

import java.util.HashSet;

public class _6_HashSet {


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
    }
}
