package Stack;
import java.util.*;

public class _10_MaxAreaHistogram {

    public static double area(int arr[]){
        Stack<Integer> st = new Stack<>();
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next smaller Right
        for(int i=arr.length; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){ // only a diff. of >= from <= in NEXT-GREATER
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = arr.length;
            }else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        // Next Smaller left
        st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){ // only a diff. of >= from <= in NEXT-GREATER
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i] = -1;
            }else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        return -1;

        // Current area
//        int l = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>l){
//                l = arr[i];
//            }
//        }
//        double area = l*1;
//        System.out.println("The area is " + area + "sqr. units");
//        return area;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(area(arr));
    }
}
