class classA {
    double methodA(double t) {
        

        double partA = 6*t*t;
        return partA;
    }
}

class classB extends classA{
    double methodB(double x, double t) {
        double partB = Math.sqrt(t)+x;
        double getpartA = super.methodA(t);
        double m = Math.sqrt(getpartA/partB);
        return m;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        classB objCB = new classB();
        System.out.println("Both Integer: " +objCB.methodB(2.5, 3.5));
    }
}

//Java features: encapsulation, polymorphism, inheritence
