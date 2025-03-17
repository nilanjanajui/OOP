package OOP;

class BB {
	void show() {
		System.out.println("CLASS A");
	}
}

class AA extends BB implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("\tThreadX:" + i);
		}
		super.show();
		System.out.println("End of ThreadX");
	}
}

public class RunnableTest {
	public static void main(String[] args) {
		AA runnable = new AA();
		Thread threadX = new Thread(runnable); // Step 3
		threadX.start();				//step 4
		
		System.out.println("End of main Thread");
	}
}