package OOP;

class SharedResource {
	synchronized void printNumbers() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " prints " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

class MyThread extends Thread {
	SharedResource resource;

	MyThread(SharedResource resource) {
		this.resource = resource;
	}

	public void run() {
		resource.printNumbers();
	}
}

public class SynchronizationExample {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		MyThread t1 = new MyThread(resource);
		MyThread t2 = new MyThread(resource);
		t1.start();
		t2.start();
	}
}



