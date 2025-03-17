package OOP;

interface Flyable {
	void fly();
}

interface Swimmable {
	void swim();
}

class Duck implements Flyable, Swimmable {
	public void fly() {
		System.out.println("Duck flies in the sky.");
	}

	public void swim() {
		System.out.println("Duck swims in the pond.");
	}
}

public class MultipleInheritance_Interfaces {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.fly();
		duck.swim();
	}
}
