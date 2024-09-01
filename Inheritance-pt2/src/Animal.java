public class Animal {  // Superclass

    // Add feature.
    private String name;
    private int weight;
    private int height;
    private int number_of_legs;


    // Add constructor.
    public Animal (String name , int weight , int height , int number_of_legs) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.number_of_legs = number_of_legs;


    }   // Any method. (Showing to eating)
    public void eating () {

        System.out.println("The animal eating now....");
    }
        // Any method (Showing speed)
    public void movement (int speed) {

        System.out.println("The animal moves at a " + speed + " speed of km/h.");
    }

        // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumber_of_legs() {
        return number_of_legs;
    }

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }
}
