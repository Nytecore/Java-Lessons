public class Motorcycle extends Vehicle {       // Subclass


            // Constructor
    public Motorcycle(String model, String year) {
        super(model, year);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 40;   // Calculate motorcycle rental price per day
    }
}
