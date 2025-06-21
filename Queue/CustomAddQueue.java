package Queue;

public class CustomAddQueue {

    static class Queue{
        int maxsize;
        int queueArray[];
        int front;
        int rear;

        Queue(int size){
            maxsize = size;
            queueArray = new int[size];
            front = -1;
            rear = -1;
        }

        void add(int val){
            if(rear == maxsize-1){
                System.out.println("The queue is full");
                return;
            }
            if(rear == -1){
                queueArray[++rear] = val;
                front = 0; // to fix front index for further ability to manipulate array from start
                queueArray[front] = val;
                System.out.println(val + " added in queue");
            }
            else {
                queueArray[++rear] = val; // rear continuously increased to maxsize-1 it get fixed at last and handle manipulate elements from last.
                System.out.println(val + " added in queue");
            }
        }

        void display(){
            if(rear==-1){
                System.out.print("Empty queue");
                return;
            }
            for(int i= front; i<=rear; i++){
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();

    }
}
