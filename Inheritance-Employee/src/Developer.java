public class Developer extends Employee {       // Subclass

                // Create a feature.
    private String languages;

                // Constructor
    public Developer(String name, String surmane, int id, String languages) {
        super(name, surmane, id);
        this.languages = languages;
    }

                // Take an Operating System to user for "Format"
    public void format (String operating_system) {
        System.out.println(getName() + " " + "setup to " +operating_system +" ....");
    }

                // Getter & Setter
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override       // Override from superclass and add subclass feature
    public void showInformation() {

        System.out.println("\nShowing Information --->\n");
        super.showInformation();
        System.out.println("Languages known : " + languages);
    }
}