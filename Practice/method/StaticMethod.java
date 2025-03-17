package method;

class Mobile
{
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println(brand + ": " + price + ": " + name);
	}
	
	public static void show1(Mobile obj) // accepting object
	{
		System.out.println(obj.brand + ": " + obj.price + ": " + name);
	}
}

public class StaticMethod {

	public static void main(String[] args) 
	{
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "Smartphone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile.name = "Smartphone";
		
		obj1.show();
		obj2.show();
		
		Mobile.show1(obj1); // pass the object itself

	}

}

// can't use non-static variable in a static method directly.
// but can use indirectly by passing object referrance.






