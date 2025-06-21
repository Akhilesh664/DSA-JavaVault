package Stack;

public class MaximumNumber {
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

        void maximumValue(){
            if(top==-1){
                System.out.println("Empty stack");
                return;
            }
            int maxValue=0;
            int maxIndex= 0;
            for(int i=0; i<=top; i++){
                if(stackArray[i]>maxValue){
                    maxValue= stackArray[i];
                    maxIndex= i;
                }
            }
            System.out.println(maxValue + " is maximum found at index " + maxIndex);
        }
    }

    public static void main(String[] args) {
        Stack st= new Stack(5);
        st.push(35);
        st.push(23);
        st.push(43);
        st.push(75);
        st.push(53);

        st.display();

        st.maximumValue();
    }
}