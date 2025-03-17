package OOP;

class Shared {
	synchronized void produce() throws InterruptedException {
		System.out.println("Producing...");
		wait(); // Wait for notification
		System.out.println("Resumed production.");
	}

	synchronized void consume() throws InterruptedException {
		Thread.sleep(1000); // Simulate some work
		System.out.println("Consuming...");
		notify(); // Notify the waiting thread
	}
}

public class InterThreadExample {
	public static void main(String[] args) {
		Shared shared = new Shared();

		Thread producer = new Thread(() -> {
			try {
				shared.produce();
			} catch (InterruptedException e) {
				System.out.println("Producing Interrupted");
			}
		});

		Thread consumer = new Thread(() -> {
			try {
				shared.consume();
			} catch (InterruptedException e) {
				System.out.println("Comsuming Interrupted");
			}
		});

		producer.start();
		consumer.start();
	}
}



