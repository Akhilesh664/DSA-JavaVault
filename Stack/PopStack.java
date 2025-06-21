package Stack;

public class PopStack {
    static class Stack{
        private int maxsize;
        private int stackArray[];
        private int top;

        Stack(int size){
            maxsize= size;
            stackArray= new int[maxsize];
            top= -1;
        }

        public void push(int val){
            if(top==maxsize-1){
                System.out.println("Stack overflow");
                return;
            }
            stackArray[++top]= val;
        }

        void display(){
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
        }

        int pop(){
            if(top==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            int poppedElement = stackArray[top--];
            System.out.println(poppedElement + " popped from the stack");
            return poppedElement;
        }
    }
    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println();

        st.pop();
        st.display();
    }
}