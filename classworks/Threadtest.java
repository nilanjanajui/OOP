package classworks;

class A1 extends Thread {
    public void run()  
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread A: " +i);
        }
        System.out.println("Exit from A");
    }
}

class B1 extends Thread {
    public void run()
    {
    	for(int j=1;j<=5;j++)
    	{
    		System.out.println("From Thread B: "+j);
    	}
    	System.out.println("Exit from B");
    }
}
    
class C1 extends Thread {
    public void run()
    {
    	for(int k=1;k<=5;k++)
    	{
    		System.out.println("From Thread C: "+k);
    	}
    	System.out.println("Exit from C");
    }
}

public class Threadtest {
	public static void main(String[] args) 
	{
		new A1().start();
		new B1().start();
		new C1().start();
	}
}

