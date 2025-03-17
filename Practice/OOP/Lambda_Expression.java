package OOP;

//Functional Interface
interface Printer {
	void print();
}

public class Lambda_Expression {
	public static void main(String[] args) {
//Using Lambda Expression
		Printer p = () -> System.out.println("Hello, Lambda!");
		p.print(); // Output: Hello, Lambda!
	}
}