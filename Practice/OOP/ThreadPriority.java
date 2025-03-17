package OOP;

class At extends Thread {
	public void run() {
		System.out.println("threadA started");
		for (int i = 1; i <= 4; i++) {
			System.out.println("\tFrom Thread A : i=" + i);
		}
		System.out.println("Exit from A");
	}
}

class Bt extends Thread {
	public void run() {
		System.out.println("threadB started");
		for (int j = 1; j <= 4; j++) {
			System.out.println("\tFrom Thread B : j=" + j);
		}
		System.out.println("Exit from B");
	}
}

class Ct extends Thread {
	public void run() {
		System.out.println("threadC started");
		for (int k = 1; k <= 4; k++) {
			System.out.println("\tFrom Thread C : k= " + k);
		}
		System.out.println("Exit from C");
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		At threadA = new At();
		Bt threadB = new Bt();
		Ct threadC = new Ct();
		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority() + 1);
		threadA.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Start Thread A");
		threadA.start();
		System.out.println("Start Thread B");
		threadB.start();
		System.out.println("Start Thread C");
		threadC.start();
		System.out.println("End of main Thread ");
	}
}


