package Stack;

import java.util.*;
public class PostfixToInfix {
    public static void main(String[] args) {
        String postfix= "6435+*/9-";
        System.out.println("Postfix expression: " + postfix);
        System.out.print("Infix expression: ");

        Stack<String> val= new Stack<>();

        for(int i=0; i<postfix.length(); i++){
            char ch= postfix.charAt(i);
            int ascii= (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }
            else{
                String v1= val.pop();
                String v2= val.pop();
                char op= ch;
                String temp= v1+op+v2;
                val.push(temp);
            }
        }
        System.out.println(val.peek());
    }
}