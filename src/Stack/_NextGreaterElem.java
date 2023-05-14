package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class _NextGreaterElem {

    public static void nextGre(int arr[]){

        Stack<Integer> st = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[st.peek()];
            }
            st.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.println(nextGreater[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {4, 7, 8, 2, 1};
        nextGre(arr);
    }
}
