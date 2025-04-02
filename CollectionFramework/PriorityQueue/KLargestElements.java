package PriorityQueue;

import java.util.PriorityQueue;

public class KLargestElements {
    public static void findKLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : arr){
            minHeap.add(num);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        System.out.println("Top " + k + " largest elements: " + minHeap);
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 5, 8, 2, 15, 20, 12};
        int k = 3;
        findKLargest(arr, k);
    }
}
