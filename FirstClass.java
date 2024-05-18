
class SecondClass{
    void methodA(int a, int b) {
        int sum = a+b;
        System.out.println("Both Integer: " +sum);
    }

    void methodA(int a, double b) {
        double sum = a+b;
        System.out.println("Integer and Double: " +sum);
    }
    void methodA(double a, double b) {
        double sum = a+b;
        System.out.println("Double and Double: " +sum);
    }
}
public class FirstClass {
    public static void main(String[] args) {
        SecondClass objA = new SecondClass();
        objA.methodA(12, 20);
        objA.methodA(12, 20.0);
        objA.methodA(12.00, 20.00);

        System.out.println("First program");
        
    }
}
