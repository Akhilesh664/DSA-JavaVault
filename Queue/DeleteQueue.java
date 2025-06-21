package Queue;

public class DeleteQueue {
    static class Queue{
        int maxsize;
        int queueArray[];
        int front;
        int rear;
        Queue(int size){
            maxsize= size;
            queueArray= new int[maxsize];
            front= -1;
            rear= -1;
        }

        // insert elements to the queue
        void enqueue(int val){
            if(rear==maxsize-1){
                System.out.println("The queue is full");
                return;
            }
            if(rear==-1){
                front= rear= 0;
                queueArray[rear]= val;
            }
            else{
                queueArray[++rear]= val;
            }
        }

        // delete element from the queue
        void dequeue(){
            if(rear==-1){
                System.out.println("The queue is empty");
                return;
            }
            front++;
        }

        // display elements of the queue
        void display(){
            if(rear==-1){
                System.out.println("Empty queue");
                return;
            }
            for(int i= front; i<=rear; i++){
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();    // 1 2 3 4 5

        q.dequeue();
        q.display();    // 2 3 4 5
    }
}