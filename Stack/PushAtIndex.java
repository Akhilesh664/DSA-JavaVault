package Stack;

public class PushAtIndex {
    static class Stack{
        int maxsize;
        int stackArray[];
        int top;

        Stack(int size){
            maxsize= size;
            stackArray= new int[size];
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

        void pushAtIndex(int index, int val){
            if(index<0 || index>top+1){
                System.out.println("Invalid index for insertion");
                return;
            }
            if(top==maxsize-1){
                System.out.println("Stack overflow");
                return;
            }

            // Shift elements to the right to make space for the new element
            for(int i=top; i>=index; i--){
                stackArray[i+1]= stackArray[i];
            }
            stackArray[index]= val;
            top++;
            System.out.println(val + " inserted at index " + index);
        }

        void display(){
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
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();       // 1 2 3 4

        st.pushAtIndex(2, 98);
        st.display();       // 1 2 98 3 4

        st.pushAtIndex(3, 16);      // Stack overflow

        st.pushAtIndex(12, 105);        // Invalid index for insertion
    }
}