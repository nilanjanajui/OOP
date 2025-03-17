package OOP;

public class MainThreadPriority {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread " + t);
		t.setName("CSE");
		System.out.println("After name change: " + t);
		t.setPriority(t.getPriority() - 2);
		System.out.println("After priority change:" + t.getPriority());
	}
}