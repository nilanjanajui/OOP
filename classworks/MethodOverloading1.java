package classworks;

class Class1 
{
	double methodA(double t)
	{
		double a =6 * Math.pow(t, 2);
		return a;
	}
	
	// same method name, different parameters
	double methodA(double t, double x)
	{
		double b = Math.sqrt(t) + x;
		return b;
	}
	
	double methodC(double t, double x)
	{
		double a = methodA(t);
		double b = methodA(t, x);
		
		double m = Math.sqrt(a/b);
		return m;
	}
}

public class MethodOverloading1
{
	public static void main(String[] args) 
	{
		Class1 obj = new Class1();
		
		double result = obj.methodC(4, 3);
		
		System.out.println(result);
	}

}





