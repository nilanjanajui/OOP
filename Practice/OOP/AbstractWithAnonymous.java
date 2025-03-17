package OOP;

abstract class Greeting
{
	abstract void sayHello();			// Abstract Method
}

public class AbstractWithAnonymous 
{
	public static void main(String[] args) 
	{
		Greeting greeting = new Greeting() {			// Creating an anonymous inner class
			void sayHello()			//Override
			{
				System.out.println("Hello, this is an anonymous inner class!");
			}
		};

		greeting.sayHello();        // Calls the abstract method implemented by the anonymous inner class
	}
}
