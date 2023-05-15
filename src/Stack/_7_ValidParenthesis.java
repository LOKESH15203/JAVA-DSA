package Stack;

import java.util.Stack;

public class _7_ValidParenthesis {

    public static boolean valid(String str){
        Stack<Character> st = new Stack<>();
        while (!st.isEmpty()){
            if (st.peek() == "("){
                while(!st.isEmpty()){
                    if(st.peek() != ")"){
                        return false;
                    }
                    st.pop();

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
