package Stack;

public class IsEmpty {
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

        public void display(){
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
        }

        public int pop(){
            if(top==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            int poppedElement = stackArray[top--];
            return poppedElement;
        }

        public boolean isEmpty(){
            if(top==-1){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);

        st.display();
        System.out.println();

        st.pop();
        st.pop();

        st.display();
        System.out.println();

        if(st.isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            System.out.println("The stack is not empty");
        }
    }
}
