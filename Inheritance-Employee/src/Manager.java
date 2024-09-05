public class Manager extends Employee {         // Subclass

                // Create a feature.
    private String ppl_responsible;


                // Create a constructor from Superclass and add subclasses feature.
    public Manager(String name, String surname, int id, String ppl_responsible) {
        super(name, surname, id);
        this.ppl_responsible = ppl_responsible;
    }

                // Getter & Setter
    public String getPpl_responsible() {
        return ppl_responsible;
    }

    public void setPpl_responsible(String ppl_responsible) {
        this.ppl_responsible = ppl_responsible;
    }

    @Override       // Override from Superclass and add another features from subclass.
    public void showInformation() {

        System.out.println("\nShowing Information --->\n");
        super.showInformation();
        System.out.println("Number of people the manager is responsible : " + ppl_responsible);
    }

                    // Create a method here.
                    // This method will raise wage to the employee's.
    public void raiseWage (int amount) {
        System.out.println(" ");
        System.out.println(getName() + " raise to wage $" + amount + " per hour to employees.");
    }
}