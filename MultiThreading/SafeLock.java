package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;

class SafeLock {
    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (lock1.tryLock()) {
                    try {
                        if (lock2.tryLock()) {
                            try {
                                System.out.println("Thread 1: Locked both resources");
                                break;
                            } finally {
                                lock2.unlock();
                            }
                        }
                    } finally {
                        lock1.unlock();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (lock2.tryLock()) {
                    try {
                        if (lock1.tryLock()) {
                            try {
                                System.out.println("Thread 2: Locked both resources");
                                break;
                            } finally {
                                lock1.unlock();
                            }
                        }
                    } finally {
                        lock2.unlock();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}

