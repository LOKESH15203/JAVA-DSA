package Stack;
import java.util.*;

public class _3_JCF_Stack {

    public void pushAtBottom(Stack<Integer> st ,int val){
        while(!st.isEmpty()){
            st.pop();
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(2);
        st.push(4);
        st.push(7);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

        while (!st.isEmpty()){
            System.out.print(st.peek() + " | ");
            st.pop();
        }


    }
}
