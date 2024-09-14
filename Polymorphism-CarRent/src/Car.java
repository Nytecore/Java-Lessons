public class Car extends Vehicle {      // Subclass


            // Constructor
    public Car(String model, String year) {
        super(model, year);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 70;   // Car rental price.
    }
}
