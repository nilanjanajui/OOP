package classworks;

class sample1{
    void medhodA(){
        System.out.println("MethodA-s1");
    }
}

class sample2 extends sample1 {
    void medhodA(){
        System.out.println("MethodA-s2");
   } 

    void medhodB() {
        System.out.println("MethodB");
    }
}

// sample2 methodA commented korle override hobe na

public class Miscelleneous {
    public static void main(String args []) {
        sample1 objS = new sample2();
        objS.medhodA();
        
    }
}



//Parameterized constructor

/* class sample1{
    sample(String A){
        System.out.println("A");
    }
} 
public class Miscelleneous {
    public static void main(String[] args) {
        sample1 objS = new sample1();
        objS.medhodA();

    }
}*/
