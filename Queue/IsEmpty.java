package Queue;

public class IsEmpty {
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
        void add(int val){
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
        void remove(){
            if(rear==-1){
                System.out.println("The queue is empty");
                return;
            }
            front++;
        }

        // check if queue is empty or not
        boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;
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
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();

        q.remove();
        q.add(4);
        q.display();    // 1 2 3 4 5

        if(q.isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            System.out.println("The queue is not empty");
        }
    }
}