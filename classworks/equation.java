package classworks;

class firstclass {

    void methoda(double x, double t) {
        //double m = Math.sqrt((6*Math.pow(t, 2)/ Math.sqrt(t)+x));

        double partA = 6 * t * t;
        double partB = Math.sqrt(t) + x;
        double m = Math.sqrt(partA / partB);
        System.out.println("m: " + m);
    }
}

public class equation {

    public static void main(String[] args) {
        firstclass objA = new firstclass();
        objA.methoda(2.00, 5.00);
    }
}
