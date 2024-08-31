package previousyearques22;

class A1 {
    public int var=10;
    public static int par;

    static{
        par = 5; // par has to be static in order to be used in static block
        System.out.println("Static block in A");
    }
    void meth(){
        var = 15;
        System.out.println("Method in class A");
    }
}

    class B1 extends A1{
    void meth(){ //final can't be used in order to override
        var += 20;
        System.out.println("Method in class B");
    }
}
    
final class C1 extends B1{
    int star;
    void meth(){
        System.out.println("Method in class C");
    }
}

public class Correction{
    public static void main(String[ ] args) {
        B1 obj1 = new B1();
        B1 obj2 = new B1();
        C1 obj3 = new C1();
        obj1.meth();
        obj3.star = 100; // Class C has to be instantiated
        System.out.println("par = " + A1.par+", var = "+ obj2.var+", star = " + obj3.star);
    }
}
