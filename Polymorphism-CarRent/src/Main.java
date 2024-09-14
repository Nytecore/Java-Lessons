public class Main {

    public static void main(String[] args) {

                    // Create objects...

        Vehicle myCar = new Car("Toyota Corolla" , "2020");
        Vehicle myMotor = new Motorcycle("Honda PCX 125" , "2023");
        Vehicle myTruck = new Truck("Chevrolette Silverado" , "2018" , 3000);

            // Calculate price of vehicle rental prices.

        System.out.println("\nCar rental price for 3 days : $" + myCar.calculateRentalPrice(3));
        System.out.println("Motorcycle rental price for 3 days : $" + myMotor.calculateRentalPrice(3));
        System.out.println("Truck rental price for 3 days : $" + myTruck.calculateRentalPrice(3));

            // Check truck's load capacity with instanceof keyword.

        if ( myTruck instanceof Truck) {
            Truck truck = (Truck) myTruck;
            System.out.println("\n---->  Truck load capacity : " + truck.getLoadCapacity() +" kg.");

        }
    }
}
