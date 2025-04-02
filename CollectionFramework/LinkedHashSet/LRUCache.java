package LinkedHashSet;

import java.util.*;

public class LRUCache {
    private Set<Integer> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashSet<>();
    }

    public void refer(int page) {
        if (cache.contains(page)) {
            cache.remove(page);
        } else if (cache.size() == capacity) {
            Iterator<Integer> it = cache.iterator();
            it.next();  // Remove oldest element (first in order)
            it.remove();
        }
        cache.add(page);
    }

    public void display() {
        System.out.println("Cache Content: " + cache);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(2);
        cache.refer(4);
        cache.display();  // Expected: [3, 2, 4]
    }
}
