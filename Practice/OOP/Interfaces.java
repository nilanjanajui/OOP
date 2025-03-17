package OOP;

interface Device {
	void turnOn(); // Abstract method

	void turnOff(); // Abstract method

	// Default method to provide a status message
	default void deviceStatus() {
		System.out.println("Device is operational.");
	}
}

//Implementing the Device interface for a Laptop
class Laptop implements Device {
	private String brand;

	public Laptop(String brand) {
		this.brand = brand;
	}

	public void turnOn() {
		System.out.println(brand + " Laptop is now ON.");
	}

	public void turnOff() {
		System.out.println(brand + " Laptop is now OFF.");
	}
}

//Implementing the Device interface for a Smart Light
class SmartLight implements Device {
	private String color;

	public SmartLight(String color) {
		this.color = color;
	}

	public void turnOn() {
		System.out.println("Smart Light with color " + color + " is now ON.");
	}

	public void turnOff() {
		System.out.println("Smart Light with color " + color + " is now OFF.");
	}

	public void deviceStatus() {
		System.out.println("The Smart Light is functioning properly.");
	}
}

//Main class to test the implementation
public class Interfaces {
	public static void main(String[] args) {
		// Laptop example
		Device laptop = new Laptop("Dell");
		laptop.turnOn();
		laptop.deviceStatus();
		laptop.turnOff();

		// Smart Light example
		Device smartLight = new SmartLight("Warm White");
		smartLight.turnOn();
		smartLight.deviceStatus();
		smartLight.turnOff();
	}
}






