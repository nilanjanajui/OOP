package classworks;

class Class11 {

    double method1(double t) {

        double part1 = 6 * t * t;
        return part1;
    }
}

class Class22 extends Class11 {

    double method2(double x, double t) {

        double part2 = Math.sqrt(t) + x;
        double getpart1 = super.method1(t);

        double m = (getpart1 / part2);

        return m;
    }
}

class Class33 extends Class22 {

    double method3(double x, double t) {

        double m = super.method2(x, t);
        double result = Math.sqrt(m);

        return result;
    }
}

public class Multi {

    public static void main(String[] args) {
        Class33 obj3 = new Class33();
        System.out.println("Both Integer: " + obj3.method3(2.5, 3.5));
    }
}








