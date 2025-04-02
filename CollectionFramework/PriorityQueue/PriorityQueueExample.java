package PriorityQueue;

import java.util.PriorityQueue;

class Task implements Comparable<Task>{
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other){
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task("Fix Bugs", 3));
        taskQueue.add(new Task("Developer Feature", 1));
        taskQueue.add(new Task("Write Tests", 2));

        while (!taskQueue.isEmpty()){
//            poll() This method retrieves the value of the first element of the queue by removing it from the queue
            System.out.println("Executing: "+taskQueue.poll());
        }
    }
}
