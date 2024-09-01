public class Employee {     // SuperClass - BaseClass


    // The properties to be inherited are created:
    String name;
    int wage;
    String department;


    // Constructor created:
    public Employee (String name , int wage , String department) {
        this.name = name;
        this.wage = wage;
        this.department = department;
    }

    // Any method.
    public void work () {

        System.out.println("Employee's working...");

    }

    // Show information method.
    public void showInformation () {

        System.out.println("\nName : " + this.name);
        System.out.println("Department : " + this.department);
        System.out.println("Wage : " + this.wage);

    }

    // Changing the department method.
    public void changeDepartment (String new_department) {

        System.out.println("Changing department...");
        this.department = new_department;

        System.out.println("Changed department : " + this.department);

    }

    // GETTER AND SETTER FOR OVERRIDING

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}