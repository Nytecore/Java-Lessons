public class Manager extends Employee{    // Subclass

    /* We added in Subclass class name to
    "extends" and add Employee (SuperClass name). */

    private int responsible;       // Ekstra feature

    // We must create constructor.
    public Manager (String name , int wage , String department , int sorumlu_kisi) {

        super (name , wage , department);

        this.responsible = sorumlu_kisi;


        /*  NORMAL CONSTRUCTOR USES :
        this.name = name;
        this.wage = wage;
        this.department = department;
        */

        /*
        Firstly we must create a constructor to prevent the class from giving errors.
        The constructor should same main constructer.

        Normally we must use normal veriables for constructors. But this constructor
        is not normal constructor. This is "Employee" Classes constructor. We call that
        from "Employee" class. That's why we don't use like "this.name = name". We just
        use as above (super (name , wage , department)). Here "super()" is Superclasses
        constructor veriables.
         */
    }

    public  void raiseWage (int raise_count) {

        System.out.println("\nRaise " + raise_count + " TL wage to workers.");

    }

    // OVERRIDING
    public void showInformation () {
        /*
        System.out.println("\nName : " + getName()); //getName = getter from showInformation in Employee class
        System.out.println("Department : " + getDepartment()); //getDepartment = getter
        System.out.println("Wage : " + getWage()); //getWage = getter
        */

        super.showInformation();
        System.out.println("Number of people responsible : " + responsible);
    }


}
