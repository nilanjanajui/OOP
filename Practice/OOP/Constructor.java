package OOP;

//A class to represent a Car
class Car 
{
	String model;
	String color;
	int year;

	// Default constructor
	Car() 
	{
		model = "Unknown";
		color = "Unpainted";
		year = 0;
	}

	// Parameterized constructor
	Car(String model, String color, int year) 
	{
		this.model = model;
		this.color = color;
		this.year = year;
	}

	// Method to display car details
	void displayDetails() 
	{
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
	}
}

public class Constructor 
{
	public static void main(String[] args) 
	{
		// Create an object using the default constructor
		Car car1 = new Car();
		System.out.println("Car 1 details:");
		car1.displayDetails();
     
		// Create an object using the parameterized constructor
		Car car2 = new Car("Tesla Model S", "Red", 2023);
		System.out.println("\nCar 2 details:");
		car2.displayDetails();
	}
}




