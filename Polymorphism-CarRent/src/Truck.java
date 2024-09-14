public class Truck extends Vehicle {        // Subclass


            // Add new feature.
    private double loadCapacity;    // Truck loading capacity here.


            // Constructor
    public Truck(String model, String year, double loadCapacity) {
        super(model, year);
        this.loadCapacity = loadCapacity;
    }
            // Getter & Setters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 100;  // Calculate truck rental price per day.
    }
}
