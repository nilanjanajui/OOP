package OOP;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockSafe {
	private final Lock lock1 = new ReentrantLock();
	private final Lock lock2 = new ReentrantLock();

	public void performTask() {
		if (lock1.tryLock()) {
			try {
				if (lock2.tryLock()) {
					try {
						System.out.println(Thread.currentThread().getName() + " acquired both locks.");
						// Perform critical operations
					} finally {
						lock2.unlock();
					}
				}
			} finally {
				lock1.unlock();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " could not acquire both locks.");
		}
	}
}

public class DeadlockSafeTest {
	public static void main(String[] args) {
		DeadlockSafe resource = new DeadlockSafe();

		Runnable task = resource::performTask;

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();
	}
}
