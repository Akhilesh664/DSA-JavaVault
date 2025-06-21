package Stack;

public class PeekStack {
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
            if(top== maxsize-1){
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

        public int peek(){
            if(top==-1){
                System.out.println("The stack is empty!");
                return -1;
            }
            return(stackArray[top]);
        }

    }
    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();
        System.out.println();

        System.out.println("Peek element: " + st.peek());
    }
}