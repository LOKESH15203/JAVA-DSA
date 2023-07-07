package _17_Hashing;

import java.util.HashSet;

public class _9_Union_AND_Intersection {

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        // Union
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

        System.out.println("Union of the 2 given arrays is : " + hs);
    }
}
