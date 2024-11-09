import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


        /* Normalde biz idman programını kursun en başlarında OOP derslerinde yapmıştık. Şimdi
        Buradaki Idman programını kopyaladık ve bu programa log dosyası yapacağız yani buradaki
        işlemlerimizi bir dosyaya kasdetmek istiyporum. Bunun nasıl yapılacağı hakkında ders
        göreceğiz. Bunu yapmak için her hareketten sonra bu hareketi dosyaya yazmamız gerekir.

        int i = 1; şeklinde bir değişken oluşturacağız ve her işlemden sonra bu i +1 artacak.
        Aşağıda while döngüsü içerisinde program çalışırken hangi işlemi ve hareketi yaptıysak
        onu log dosyasına koyacağız.

        Onun için de yine burada TryWitResource yapısını kullanacağız. Yapılacak olan işlemler
        aşağıda yapılacak ve yapılan alanlar işaretlenerek sonradan neler yapıldığınız göreceğiz.   */

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

        //--------------------------------------------------------------------------------------------------------------
        int i = 1;  // --> LOG Dosyası için oluşturuldu.
        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        try (FileWriter writer = new FileWriter("JavaInputOutput/IdmanProgramiLog/src/log.txt")) {
            writer.write("Idman Programı\n");
            writer.write("Burpee Sayısı : " + workout.getNumberofBenchpress() + "\n");
            writer.write("Plank Sayısı : " + workout.getNumberofPlank() + "\n");
            writer.write("Leg Press Sayısı : " + workout.getNumberofLegpress() + "\n");
            writer.write("Pushup Sayısı : " + workout.getNumberofPushup() + "\n");
        //--------------------------------------------------------------------------------------------------------------




        while (workout.WorkoutIsOver() == false) {

            System.out.print("\nExercise Type (Pushup, Plank, Bench Press, Leg Press) : ");
            String type = scanner.nextLine();

            System.out.print("How many repetitions will you do? : ");
            int repetitions = scanner.nextInt();
            scanner.nextLine();

            workout.MakeaMove(type, repetitions);


        //--------------------------------------------------------------------------------------------------------------
            writer.write( i + ". işlem ----> Hareket: " + type + " ----> Sayı: " + repetitions + "\n");
            i++;
        //--------------------------------------------------------------------------------------------------------------



        //--------------------------------------------------------------------------------------------------------------
        }
        } catch (IOException ex) {
            System.out.println("Dosya okunurken bir hata oluştu: 'IOException' ");
        }
        //--------------------------------------------------------------------------------------------------------------



        System.out.println("\n\t******* Congratulations! You have successfully completed your training... *******");

    }
}