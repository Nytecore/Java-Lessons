public class Dog extends Animal {   // Subclass

        // Create number of teeth variable.
    private int n_o_teeth;

        // Super constructor and the standart class constructor.
    public Dog (String name , int weight , int height , int number_of_legs , int n_o_teeth) {
        super (name , weight , height , number_of_legs);
        this.n_o_teeth = n_o_teeth;

    }
        // Getter & Setter
    public int getN_o_teeth() {
        return n_o_teeth;
    }

    public void setN_o_teeth(int n_o_teeth) {
        this.n_o_teeth = n_o_teeth;
    }

        // Create "movement" class.
    public void movement (int speed) {

        System.out.println("The dog moves at a " + speed + " speed of km/h.");
    }
        // Create "run" class.
    public void run (int speed) {

        System.out.println("The dog is running....");
        movement(speed);
    }

    // Note: Lock point --> "movement(speed);" but not used to overriding...

}
