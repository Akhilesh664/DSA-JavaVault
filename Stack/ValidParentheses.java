package Stack;

import java.util.Stack;

public class ValidParentheses {

    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                char top = st.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == ']' && top == '[') ||
                        (ch == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        else {
            return true;
        }
    }


    public static void main(String[] args) {
        String s = "([()](({[(]})))";
        System.out.println(s);
        if(isBalanced(s)){
            System.out.println("Valid Parentheses");
        }
        else{
            System.out.println("Invalid Parentheses");
        }

    }
}
