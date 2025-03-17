package OOP;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class ReadWriteResource {
    private int value = 0;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write(int newValue) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " writing value: " + newValue);
            value = newValue;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void read() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " reading value: " + value);
        } finally {
            lock.readLock().unlock();
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) {
        ReadWriteResource resource = new ReadWriteResource();

        Thread writer = new Thread(() -> resource.write(10), "Writer");
        Thread reader1 = new Thread(resource::read, "Reader-1");
        Thread reader2 = new Thread(resource::read, "Reader-2");

        writer.start();
        reader1.start();
        reader2.start();
    }
}
