package OOP;

class NewThread implements Runnable {
	String name;
	Thread t;

	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		t.start();
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + ": " + i);
		}
		System.out.println("End of " + name);
	}
}

public class MultiThread {
	public static void main(String[] args) {
		new NewThread("A1");
		new NewThread("A2");
		new NewThread("A3");
		System.out.println("End of main Thread");
	}
}