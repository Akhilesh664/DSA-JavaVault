package CollectionFramework.Stack;

import java.util.Stack;

public class ReverseString {

    public static String ReversedString(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

//        StringBuilder is a mutable sequence of characters, meaning it is not a String so have to converted to String by toString().
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Akhilesh";
        System.out.println("Reversed string: "+ ReversedString(str));
    }
}
