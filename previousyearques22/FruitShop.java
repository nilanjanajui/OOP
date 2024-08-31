package previousyearques22;

class Fruit {
    String name;
    double weight;
    double pricePerKG;

    public Fruit(String name, double weight, double pricePerKG) {
        this.name = name;
        this.weight = weight;
        this.pricePerKG = pricePerKG;
    }

    public void reducePricePerKG(double amount) {
        this.pricePerKG -= amount;
    }

    public void increasePricePerKG(double amount) {
        this.pricePerKG += amount;
    }

    public void printDetails() {
        double totalPrice = this.weight * this.pricePerKG;
        System.out.println("Fruit Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight + "kg");
        System.out.println("Price per kg: " + this.pricePerKG);
        System.out.println("Total price: " + totalPrice);
    }
}

public class FruitShop {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", 3.5, 110);
        Fruit fruit2 = new Fruit("Mango", 5, 90);
        fruit1.reducePricePerKG(10);
        fruit2.increasePricePerKG(20);
        fruit1.printDetails();
        fruit2.printDetails();
    }
}
