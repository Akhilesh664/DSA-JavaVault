package Stack;

public class UpdateAtIndex {
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
            System.out.println(val + " pushed into stack");
        }

        public void updateElement(int index, int val){
            if(index<0 || index>top){
                System.out.println("Invalid index for element updation");
                return;
            }
            stackArray[index]= val;
            System.out.println("Value at index " + index + " replaced by " + val);
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
        Stack st= new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();       // 1 2 3 4

        st.updateElement(2, 94);

        st.display();       // 1 2 94 4

    }
}