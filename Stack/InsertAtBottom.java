package Stack;

public class InsertAtBottom {
    static class Stack{
        int maxsize;
        int stackArray[];
        int top;
        Stack(int size){
            maxsize= size;
            stackArray= new int[maxsize];
            top= -1;
        }
        void push(int val){
            if(top==maxsize-1){
                System.out.println("Stack overflow");
                return;
            }
            stackArray[++top]= val;
            System.out.println(val + " pushed into stack");
        }

        void insertAtBottom(int val){
            if(top==maxsize-1){
                System.out.print("Stack overflow");
                return;
            }

            // Shift all elements to the right to make space for the new element
            for(int i=top; i>=0; i--){
                stackArray[i+1]= stackArray[i];
            }
            stackArray[0]= val;
            top++;
            System.out.println(val + " pushed at bottom of the stack");
        }

        void display(){
            if(top==-1){
                System.out.println("Stack is empty");
                return;
            }
            for(int i=0; i<=top; i++){
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(7);
        st.push(4);
        st.push(9);
        st.push(5);

        st.display();       // 7 4 9 5

        st.insertAtBottom(1);

        st.display();       // 1 7 4 9 5

        st.insertAtBottom(6);       //Stack overflow

    }
}
