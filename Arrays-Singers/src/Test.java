import java.util.Scanner;

public class Test {

    private static Singers singers = new Singers();

    private static Scanner scanner = new Scanner(System.in);

    public static void show () {
        singers.print_singers();
    }

    public static void add_singer () {

        System.out.print("The name of the singer you want to add : ");

        String name = scanner.nextLine();

        singers.add_singer(name);

    }

    public static void update () {

        System.out.print("Enter the index you want to update : ");

        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the new name you want to update : ");
        String new_name = scanner.nextLine();

        singers.update_singer(new_name  , index -1);

    }

    public static void remove () {

        System.out.print("Enter the singer number you want to remove :");

        int number = scanner.nextInt();

        singers.remove_singer(number -1);

    }

    public static void search () {

        System.out.print("Enter the name of the singer whose position you want to know :");

        String new_name = scanner.nextLine();
        singers.search_singer(new_name);

    }

    public static void print_options () {

        System.out.println("\n\t 0 - Show Options" +
                           "\n\t 1- Show Singers" +
                           "\n\t 2- Add Singer" +
                           "\n\t 3- Update Singer" +
                           "\n\t 4- Remove Singer" +
                           "\n\t 5- Search Singer" +
                           "\n\t 6- Exit from application");

    }


    public static void main(String[] args) {

        System.out.println("\t\nWELCOME TO SINGERS APPLICATION");

        print_options();

        boolean quit = false;
        int button;


        while (!quit) {
            System.out.print("\nPress the button for the action you want to perform : ");
            button = scanner.nextInt();
            scanner.nextLine();

            switch (button) {

                case 0:
                    print_options();
                    break;

                case 1:
                    show();
                    break;

                case 2:
                    add_singer();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    remove();
                    break;

                case 5:
                    search();
                    break;

                case 6:
                    quit = true;
                    System.out.println("Exit from application...");
                    break;

            }

            if (button < 0 || button > 6) {
                System.out.println("Wrong transaction...");

            }
        }
    }
}