
class class0{
    
    double x= 5.0;
    static double z = 10.0;

    double methodO(double y)
    {
        double result = y+y;
        
        return result;
        
    }

}

public class TypeVariable {
    public static void main(String[] args) {

        class0 objClass0 = new class0();
        double m = objClass0.methodO(10);
        double j = objClass0.x;
        double n = class0.z;

        System.out.println("m= "+m);
        System.out.println("j= "+j);
        System.out.println("n= "+n);

        System.out.println("m= "+m + " j="+j);

    }
}
