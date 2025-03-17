package OOP;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TryLockExample {
    private final Lock lock = new ReentrantLock();

    public void performTask() {
        if (lock.tryLock()) { // Try acquiring the lock without waiting indefinitely
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock.");
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            } finally {
                lock.unlock(); // Release the lock
                System.out.println(Thread.currentThread().getName() + " released the lock.");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could not acquire the lock.");
        }
    }
}

public class TryLockExampleTest {
    public static void main(String[] args) {
        TryLockExample example = new TryLockExample();

        Runnable task = example::performTask;

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
