public class Employee {     // Superclass

    private String name;
    private String surname;
    private int id;

            // Constructor
    public Employee(String name, String surmane, int id) {
        this.name = name;
        this.surname = surmane;
        this.id = id;
    }

            // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurmane() {
        return surname;
    }

    public void setSurmane(String surmane) {
        this.surname = surmane;
    }

            // Show information method.
    public void showInformation () {
        System.out.println("Name : " + this.name);
        System.out.println("Surname : " + this.surname);
        System.out.println("ID : " + id);
    }
}