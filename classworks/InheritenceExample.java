package classworks;

class class1 {
    double methodA(double t) {
        

        double partA = 6*t*t;
        return partA;
    }
}
class class2 extends class1{
    double methodB(double x, double t) {
        double partB = Math.sqrt(t)+x;
        double getpartA = super.methodA(t);
        double m = Math.sqrt(getpartA/partB);
        return m;
    }
}

public class InheritenceExample {
    public static void main(String[] args) {
        class2 objCB = new class2();
        System.out.println("Both Integer: " + objCB.methodB(2.5, 3.5));
    }
}
