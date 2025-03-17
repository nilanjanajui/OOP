package classworks;

class ClassT 
{
	double methodT(double t)
	{
		double a = 4 * t;
		double b = Math.sqrt(10 * t);
		
		double div = a/b;
		
		return div;
	}
}

class ClassR extends ClassT  // inherit 
{
	double methodR(double t, double x)
	{
		double c = Math.sqrt(x * t) + 100;
		
		double partA = super.methodT(t); // call method from super class
		
		double m = partA/c;
		
		return m;
	}
}

public class Inheritance1 {

	public static void main(String[] args) 
	{
		ClassR obj = new ClassR();
		
		double result = obj.methodR(2, 3);
		
		System.out.println(result);
	}

}






