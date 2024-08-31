package previousyearques22;

abstract class ABC {
    // Abstract methods
    abstract double estimateSweetPrice();
    abstract double estimateSnacksPrice();
    
    // Non-abstract method with implementation
    final double VAT(double totalPrice) {
        return totalPrice * 0.1; // Assuming 10% VAT
    }
}

class DEF extends ABC {
    
    double estimateSweetPrice() {
        // Implementation for estimating sweet price
        return 10.0; // Dummy value
    }


    double estimateSnacksPrice() {
        // Implementation for estimating snacks price
        return 20.0; // Dummy value
    }
}

class GHI extends DEF {
    
    double estimateSweetPrice() {
        // Override with a different implementation
        return super.estimateSweetPrice() * 1.5; // 50% increase
    }


    double estimateSnacksPrice() {
        // Override with a different implementation
        return super.estimateSnacksPrice() * 1.2; // 20% increase
    }
}

public class Main {
    public static void main(String[] args) {
        GHI ghi = new GHI();
        
        double sweetPrice = ghi.estimateSweetPrice();
        double snacksPrice = ghi.estimateSnacksPrice();
        double totalPrice = sweetPrice + snacksPrice;
        double totalWithVAT = totalPrice + ghi.VAT(totalPrice);
        
        System.out.println("Estimated Sweet Price: $" + sweetPrice);
        System.out.println("Estimated Snacks Price: $" + snacksPrice);
        System.out.println("Total Price (without VAT): $" + totalPrice);
        System.out.println("Total Price (with VAT): $" + totalWithVAT);
    }
}
