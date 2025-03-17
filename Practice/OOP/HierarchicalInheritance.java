package OOP;

class CAR {
	String brand;
	int speed;

	CAR(String brand, int speed) 
	{
		this.brand = brand;
		this.speed = speed;
	}

	void showDetails() 
	{
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed + " km/h");
	}
}

class SUV extends CAR 
{
	int groundClearance;

	SUV(String brand, int speed, int groundClearance) 
	{
		super(brand, speed);  // Calling the parent class constructor
		this.groundClearance = groundClearance;
	}

 	void showSUVDetails() 
 	{
 		showDetails();
 		System.out.println("Ground Clearance: " + groundClearance + " mm");
 	}
}

class SportsCar extends CAR 
{
	int horsepower;

	SportsCar(String brand, int speed, int horsepower) 
	{
		super(brand, speed);  // Calling the parent class constructor
		this.horsepower = horsepower;
	}

	void showSportsCarDetails() 
	{
		showDetails();
		System.out.println("Horsepower: " + horsepower + " HP");
	}
}

class ElectricCar extends CAR 
{
	int batteryCapacity;

	ElectricCar(String brand, int speed, int batteryCapacity) 
	{
		super(brand, speed);  // Calling the parent class constructor
		this.batteryCapacity = batteryCapacity;
	}

 	void showElectricCarDetails() 
 	{
 		showDetails();
 		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 	}
}

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		SUV suv = new SUV("Toyota", 180, 220);
		System.out.println("SUV Details:");
		suv.showSUVDetails();
     
		System.out.println();

		SportsCar sportsCar = new SportsCar("Ferrari", 350, 670);
		System.out.println("Sports Car Details:");
		sportsCar.showSportsCarDetails();

		System.out.println();

		ElectricCar electricCar = new ElectricCar("Tesla", 250, 75);
		System.out.println("Electric Car Details:");
		electricCar.showElectricCarDetails();
		
	}
}
	





