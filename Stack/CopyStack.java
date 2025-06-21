package Stack;

import java.util.Stack;

public class CopyStack {

    static void copy(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            int x = st.peek();
            temp.push(x);
            st.pop();
        }
        System.out.println(temp);
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(10);
        st.push(3);
        st.push(56);
        st.push(9);

        System.out.println(st);
        copy(st);
    }
}
