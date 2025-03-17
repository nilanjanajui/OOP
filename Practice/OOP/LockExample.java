package OOP;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource1 {
    private int counter = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Acquire the lock
        try {
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to " + counter);
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

public class LockExample {
    public static void main(String[] args) {
        SharedResource1 resource = new SharedResource1();

        // Two threads accessing the same resource
        Thread t1 = new Thread(resource::increment, "Thread-1");
        Thread t2 = new Thread(resource::increment, "Thread-2");

        t1.start();
        t2.start();
    }
}
