package _16_Heaps;

import java.util.ArrayList;

public class _2_HEAP {

     static class Heap{
         ArrayList<Integer> al = new ArrayList<>();

         public void add(int data){
             // add at last
             al.add(data);

             //Fix Position
             int x = al.size()-1; // Child index
             int par = (x-1)/2;   // Parent Index

             while (al.get(x)<al.get(par)){//         O(logn)
                 //swap
                 int temp = al.get(x);
                 al.set(x, al.get(par));
                 al.set(par, temp);
             }
         }

         public int peek(){
             return al.get(0);
         }
     }

    public static void main(String[] args) {

    }
}
