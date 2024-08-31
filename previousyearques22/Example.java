package previousyearques22;

public class Example 
{
    public int findMax(int num1, int num2) 
    {
        if (num1 > num2) 
        {
            return num1; // First return statement
        } 
        
        else 
        {
            return num2; // Second return statement
        }
        // This line of code will cause a compilation error because it's unreachable

        //System.out.println("This line will not be executed.");
    }

    public static void main(String[] args) 
    {
        Example example = new Example();
        int max = example.findMax(5, 3);
        System.out.println("Max number is: " + max);
    }
}
