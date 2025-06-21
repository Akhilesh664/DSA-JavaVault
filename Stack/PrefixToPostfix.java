package Stack;

import java.util.*;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String prefix= "-9/*+5346";
        System.out.println("Prefix expression: " + prefix);
        System.out.print("Postfix expression: ");

        Stack<String> val= new Stack<>();

        for(int i=prefix.length()-1; i>=0; i--){
            char ch= prefix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 || ascii<=57){
                val.push(ch+ "");
            }
            else{
                String v1= val.pop();
                String v2= val.pop();
                char op= ch;
                String temp= v1+v2+op;
                val.push(temp);
            }
            System.out.print(val.peek());
        }

    }
}