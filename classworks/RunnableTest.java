package classworks;

/* 
class X implements Runnable {
    // Step 1
    public void run(){
    // Step 2
    	for (int i=1;i<=10;i++){
    		System.out.println("\tThreadX:"+i);
    	}
    	System.out.println("End of ThreadX");
    }
 }
 
public class Runnabletest {
    public static void main(String[] args) {
    	X runnable=new X();
    	Thread threadX=new Thread(runnable);
    	threadX.start();
    	// Step 3
    	// Step 4
    	System.out.println("End of main Thread");
    }
}
*/

class B{
    void show(){
    	System.out.println("CLASS A");
    }
}
    
class A extends B implements Runnable {
    //Step 1
    public void run() {
    //Step 2
    	for (int i=1;i<=10;i++) {
    		System.out.println("\tThreadX:"+i);
    	}
    
    	super.show();
    	System.out.println("End of ThreadX");
    }
}
    
public class RunnableTest {
    public static void main(String[] args){
    	A runnable=new A();
    	Thread threadX=new Thread(runnable); //Step 3

    	threadX.start();
//step 4
    	System.out.println("End of main Thread");
    }
}

