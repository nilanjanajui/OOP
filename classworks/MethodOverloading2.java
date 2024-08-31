package classworks;

class ClassI 
{
	 double methodI(double t)
	{
		double a = (3 * t)/ (6 * Math.pow(t, 2));
		
		double b = Math.pow(a, 2);
		return b;
	}
	
	// method overloading 
	double methodI(double t, double x)
	{
		double c = (24 * t) / Math.sqrt(10 * t);
		

		double d = Math.sqrt(x * t) + 100;
		
		double div = c/d;
		
		double sqrt = Math.sqrt(div);
		
		return sqrt;
		
	}
	
	double methodII(double t, double x)
	{
		double W = methodI(t);
		double Y = methodI(t, x);
		
		double sum = Y + W;
		return sum;
	}
	
}

public class MethodOverloading2 
{
	public static void main(String[] args) 
	{
		ClassI obj = new ClassI();
		
		double result = obj.methodII(0.20, 0.30);
		
		System.out.println(result);
	}

}





