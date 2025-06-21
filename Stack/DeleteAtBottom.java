package Stack;

import java.util.Stack;

public class DeleteAtBottom {

    static class Stack{
        private int stackArray[];
        private int top;
        private int capacity;

        Stack(int size){
            capacity = size;
            stackArray = new int[capacity];
            top = -1;
        }

        public void push(int val){
            if(top == capacity-1){
                System.out.println("Stack overflow");
                return;
            }
            stackArray[++top] = val;
            System.out.println(val + " pushed into stack");
        }

        public int pop(){
            if(top==-1){
                System.out.println("The stack is empty");
                return -1;
            }
            int poppedElement = stackArray[top--];
            System.out.println(poppedElement + " popped from the stack");
            return poppedElement;
        }

        public int deleteAtBottom(){
            if(top==-1){
                System.out.println("The stack is empty");
                return -1;
            }
            int deletedElement= stackArray[0];
            for(int i=0; i<top; i++){
                stackArray[i]= stackArray[i+1];
            }
            top--;
            System.out.println(deletedElement + " deleted from bottom of the stack");
            return deletedElement;
        }

        public void display(){
            if(top==-1){
                System.out.println("Empty stack");
                return;
            }
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {

        Stack st = new Stack(6);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();

        st.deleteAtBottom();
        st.display();

        st.pop();
        st.display();

    }
}
