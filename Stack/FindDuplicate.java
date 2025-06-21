package Stack;

public class FindDuplicate {

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

        void findDuplicate(){
            if(top==-1){
                System.out.println("Stack underflow");
                return;
            }
            boolean visited[]= new boolean[top+1];
            for(int i=0; i<=top; i++){
                if(visited[i]==false){
                    for(int j=i+1; j<=top; j++){
                        if(stackArray[i]==stackArray[j]){
                            System.out.print(stackArray[i] + " ");
                            visited[j]= true;
                            break;
                        }
                    }
                }
            }
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

        Stack st= new Stack(8);
        st.push(4);
        st.push(7);
        st.push(2);
        st.push(8);
        st.push(7);
        st.push(1);
        st.push(4);

        st.display();

        st.findDuplicate();

    }

}
