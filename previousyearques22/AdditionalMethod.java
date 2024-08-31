package previousyearques22;

//Define the first interface

interface InterfaceA {

	void methodA();
}

//Define the second interface
interface InterfaceB {
	
	void methodB();
}

//Class that implements both interfaces
class MultipleInheritanceClass implements InterfaceA, InterfaceB {

	// Implementation of methodA from InterfaceA
	@Override
	public void methodA() {
		System.out.println("Method A from InterfaceA implemented in MultipleInheritanceClass.");
	}

	// Implementation of methodB from InterfaceB
	@Override
	public void methodB() 
	{
		System.out.println("Method B from InterfaceB implemented in MultipleInheritanceClass.");
	}

}

public class AdditionalMethod {

	public static void main(String[] args) {
		// Create an instance of MultipleInheritanceClass
		MultipleInheritanceClass obj = new MultipleInheritanceClass();

		// Call methods from both interfaces
		obj.methodA(); // Calls method from InterfaceA
		obj.methodB(); // Calls method from InterfaceB

	}
}
