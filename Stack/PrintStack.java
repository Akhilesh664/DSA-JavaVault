package Stack;

import java.util.*;

public class PrintStack {
    static void printStack(Stack<Integer> st){
        Stack<Integer> temp= new Stack<>();
        while(st.size()>0){
            int x= st.peek();
            temp.push(x);
            st.pop();
        }
        Stack<Integer> copy= new Stack<>();
        while(temp.size()>0){
            int x= temp.peek();
            System.out.print(x + " ");
            temp.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();

        st.push(7);
        st.push(2);
        st.push(4);
        st.push(9);
        st.push(6);

        printStack(st);
    }
}