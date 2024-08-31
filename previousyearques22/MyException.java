package previousyearques22;

import java.util.Scanner;

public class MyException {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        
        try {
            int a[]= new int[5];
            a[5]=10;
            Integer.parseInt("abc");
            Scanner scan=new Scanner(System.in);
            @SuppressWarnings("unused")
			int x=scan.nextInt();
        }
    
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
    }
}
