class FirstClass {
    void methodA(double x, double t) {
        //double m = Math.sqrt((6*Math.pow(t, 2)/ Math.sqrt(t)+x));
        

        double partA = 6*t*t;
        double partB = Math.sqrt(t)+x;
        double m = Math.sqrt(partA/partB);
        System.out.println("m: " +m);
    }
}

public class Equation {
    public static void main(String[] args) {
        FirstClass objA = new FirstClass();
        objA.methodA(2.00, 5.00);
    }
}
