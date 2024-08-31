package previousyearques22;

class Area{
    double calculateArea(double radius) {
        return 0;
    }
}
class Circle extends Area {
    double calculateArea(double radius) {
        return 3.14*radius*radius;
    }
}

public class ques1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = 5;
        System.out.println(circle.calculateArea(radius));
    }
    
}
