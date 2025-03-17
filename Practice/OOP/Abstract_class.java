package OOP;

abstract class Payment {
	abstract void makePayment();    // Abstract method

	void commonMessage() {			// Concrete method
		System.out.println("Payment processing...");
	}
}

class CreditCard extends Payment {
	void makePayment() {			// Overriding superclass method makePayment
		System.out.println("Payment made using Credit Card.");
	}
}

class PayPal extends Payment {
	void makePayment() {			// Overriding superclass method makePayment
		System.out.println("Payment made using PayPal.");
	}
}

public class Abstract_class {
	public static void main(String[] args) {
		Payment payment1 = new CreditCard();		// Create Object
		payment1.commonMessage();					// Call the method
		payment1.makePayment();

		Payment payment2 = new PayPal();		// Create Object
		payment2.commonMessage();			// Call the method
		payment2.makePayment();
	}
}




