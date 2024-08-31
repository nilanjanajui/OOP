package previousyearques22;

class part1 
{
    public double calculateM(double t, double x) 
    {
        return Math.sqrt(Math.sqrt((24 * t / 2) / (Math.sqrt(x * t) + 100)));
    }
}

class A extends part1 
{
    public double getA() 
    {
        return 4;
    }
}

class B extends part1 
{
    public double getB() 
    {
        return 16;
    }
}

public class Equation 
{
    public static void main(String[] args) 
    {
        A objA = new A();
        B objB = new B();
        double a = objA.getA();
        double b = objB.getB();
        part1 equation = new part1();
        double m = equation.calculateM(a, b);
        System.out.println("Estimated value of m: " + m);
    }
}
