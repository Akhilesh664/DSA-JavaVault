package Stack;

public class PushStack
{
    static class Stack{
        private int maxsize;
        private int stackArray[];
        private int top;

        // constructor to initialize stack with a max size
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
            stackArray[++top] = val;
            System.out.println(val + " pushed into stack");
        }


        void display(){
            for(int i=0; i<maxsize; i++){
                System.out.print(stackArray[i]+ " ");
            }
        }

    }
    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        st.display();
    }
}