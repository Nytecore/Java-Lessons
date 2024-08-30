import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Welcome message

        System.out.println("\n--- WELCOME TO WORKOUT PROGRAM ---");

        String programs = "--->   Push-ups" +
                          "\n--->   Plank" +
                          "\n--->   Bench Press" +
                          "\n--->   Leg Press";

        System.out.println("\n**********************");
        System.out.println(programs);
        System.out.println("**********************");

        System.out.println("\nBuild your workout");
        System.out.print("\nPush-ups : ");
        int pushups = scanner.nextInt();

        System.out.print("Planks : ");
        int planks = scanner.nextInt();

        System.out.print("Bench Press : ");
        int bench = scanner.nextInt();

        System.out.print("Leg Press : ");
        int leg = scanner.nextInt();
        scanner.nextLine();

        Workout workout = new Workout(pushups, planks, bench, leg);

        System.out.println("\nYour workout is beginning......");

        while (workout.WorkoutIsOver() == false) {

            System.out.print("\nExercise Type (Pushup, Plank, Bench Press, Leg Press) : ");
            String type = scanner.nextLine();

            System.out.print("How many repetitions will you do? : ");
            int repetitions = scanner.nextInt();
            scanner.nextLine();

            workout.MakeaMove(type, repetitions);

        }

        System.out.println("\n\t******* Congratulations! You have successfully completed your training... *******");

    }

}
