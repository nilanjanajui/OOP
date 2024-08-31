package classworks;

public class Error {
    public static void main(String[] args) {
        int a[]={7,9,45,63,10};
        int b=7;
        int i;

        try {

        /*  for(i=6; i<6; i++)
            {
                a[i]=9;
            } */
            for ( i =0; i < 7; i++) {
                int x=a[i]/(b-7);
                System.out.println(x);
            } 
            
        }

        catch (ArithmeticException e) {
            System.out.println("Division by Zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Error");
        }
    }
    
}
