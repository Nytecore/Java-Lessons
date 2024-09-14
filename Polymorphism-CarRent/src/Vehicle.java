public class Vehicle {      // Superclass

            // Create features.
    private String model;
    private String year;


            // Constructor
    public Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }


            // Getter & Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


            // Calculate standart car rental price method / Overrided other subclasses.
    public double calculateRentalPrice (int days) {

        return days * 50;       // Standartd car rent price.

    }
}
