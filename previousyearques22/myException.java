package previousyearques22;


import java.util.Scanner;

@SuppressWarnings("serial")
class LowBatteryException extends Exception{
    LowBatteryException(int chargeAmount){
        super("Battery low!Should be above 20.\nCharge value: "+chargeAmount);
    }
    
}
public class myException {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++) {
            System.out.print("Enter current charge percent: ");
            int chargeAmount = sc.nextInt();

            try {
                if (chargeAmount <= 20)
                {
                    throw new LowBatteryException(chargeAmount);
                }
                else {
                    System.out.println("Enough charge in battery.");
                }

            } catch (LowBatteryException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
