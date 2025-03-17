package OOP;

class BasicCalculator 
{
 
	int add(int a, int b) 
	{
		return a + b;
	}

	int subtract(int a, int b) 
	{
		return a - b;
	}
}

class ScientificCalculator extends BasicCalculator 
{
 
	double power(double base, double exponent) 
	{
		return Math.pow(base, exponent);
	}

	double sqrt(double number) 
	{
		return Math.sqrt(number);
	}
}

class FinancialCalculator extends ScientificCalculator 
{
 
	double compoundInterest(double principal, double rate, int time, int n) 
	{
		return principal * Math.pow(1 + (rate / n), (n * time));
	}

	double simpleInterest(double principal, double rate, int time)
	{
		return (principal * rate * time) / 100;
	}
}

public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
     
		FinancialCalculator calc = new FinancialCalculator();
		
		System.out.println("Addition: " + calc.add(10, 5));
		System.out.println("Subtraction: " + calc.subtract(10, 5));
     
		System.out.println("Power: " + calc.power(2, 3));
		System.out.println("Square Root: " + calc.sqrt(16));

		System.out.println("Simple Interest: " + calc.simpleInterest(1000, 5, 2));
		System.out.println("Compound Interest: " + calc.compoundInterest(1000, 5, 2, 4));
	}
}






