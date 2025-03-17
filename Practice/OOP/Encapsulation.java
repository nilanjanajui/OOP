package OOP;

//Encapsulation example in Java
class Employee 
{
	// Private fields (data hiding)
	private String name;
	private int age;
	private double salary;

	// Public getter method for name
	public String getName() 
	{
		return name;
	}

	// Public setter method for name
	public void setName(String name) 
	{
		this.name = name;
	}

	// Public getter method for age
	public int getAge() 
	{
		return age;
	}

 // Public setter method for age
	public void setAge(int age) 
	{
		if(age > 0) 
		{  // Validation
			this.age = age;
     	}
	}

 	// Public getter method for salary
 	public double getSalary() 
 	{
 		return salary;
 	}

 	// Public setter method for salary
 	public void setSalary(double salary) 
 	{
 		if(salary > 0) 
 		{  // Validation
 			this.salary = salary;
 		}
 	}
}


//Main class
public class Encapsulation 
{
	
	public static void main(String[] args) 
	{
		// Create an instance of Employee
		Employee emp = new Employee();
     
		// Set values using setter methods
		emp.setName("John Doe");
		emp.setAge(30);
		emp.setSalary(50000);

		// Get values using getter methods
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Age: " + emp.getAge());
		System.out.println("Employee Salary: $" + emp.getSalary());
	}
}




