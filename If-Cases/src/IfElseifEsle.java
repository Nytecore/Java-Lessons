import java.util.Scanner;

public class IfElseifEsle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // == ---> Eşit mi?                        <   ---> Küçük mü?
        // != ---> Edit değil mi?                  <=  ---> Küçük veya eşit mi?
        // >  ---> Büyük mü?                       >=  ---> Büyük veya eşit mi?


        // && --> and operatörü. 1 Tane bile False varsa genel: FALSE
        // || --> or operatörü. 1 tane bile True varsa genel: TRUE
        // ! --> not operatörü. False durumunu True, True durumunu False yapar. Tam tersini alır.

        /*
        System.out.println(3 == 3);       // True  ---> 3, 3'e eşit.
        System.out.println(5 != 5);      // False ---> 5, 3'e eşit.
        System.out.println(8 >= 5);     // True  ---> 8, 5'den büyük.

        System.out.println(3 == 3 && 15 >= 30);                         // False
        System.out.println(15 != 15 || "Merhaba" == "Merhaba");        // True
        System.out.println((!(99 > 100 || 32 == 32) && 3*5 == 20));   // False
        */

        /*
        if ( KOŞUL ) {


        }

        else if ( KOŞUL ) {


        }

        else if ( KOŞUL ) {


        }

        else {


        }
        */
        /*

        System.out.print("\nLütfen yaşınızı giriniz : ");

        int yas = scanner.nextInt();

        if (yas >= 18) {
            System.out.println("\nHOŞGELDİNİZ...");
        }


        else {
            System.out.println("\nBU MEKÂNA GİREMEZSİNİZ !!");

        }
        */

        System.out.println("Lütfen Notunuzu Giriniz: ");
        int not = scanner.nextInt();

        if (not >= 90) {
            System.out.println("AA");
        }
        else if (not >= 85) {
            System.out.println("BA");
        }
        else if (not >= 80) {
            System.out.println("BB");
        }
        else if (not >= 70) {
            System.out.println("CB");
        }
        else if (not >= 60) {
            System.out.println("CC");
        }
        else if (not >= 50) {
            System.out.println("DC");
        }
        else if (not >= 45) {
            System.out.println("DD");
        }
        else if (not >= 40) {
            System.out.println("FD");
        }
        else {
            System.out.println("FF");
        }

    }
}
