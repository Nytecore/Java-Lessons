import java.util.Scanner;

public class Project {

        /*
        Method Overloading kullanarak bir tane hesap tasarlamaya çalışın.
        Toplama ve Çarpma metodlarını 2 ile 5 arasında parametre olacak şekilde tasarlayın.
        */

    public static int cikarma(int a , int b) {
        return (a - b);
    }

    public static double bolme(double a , double b) {
        return (a / b);
    }

    public static int toplama(int a , int b) {
        return (a + b);
    }

    public static int toplama(int a , int b , int c) {
        return (a + b + c);
    }

    public static int toplama(int a , int b , int c , int d) {
        return (a + b + c + d);
    }

    public static int toplama(int a , int b , int c , int d , int e) {
        return (a + b + c + d + e);
    }

    public static int carpma(int a , int b) {
        return (a * b);
    }

    public static int carpma(int a , int b , int c) {
        return (a * b * c);
    }

    public static int carpma(int a , int b , int c , int d) {
        return (a * b * c * d);
    }

    public static int carpma(int a , int b , int c , int d , int e) {
        return (a * b * c * d * e);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "\t\t  1. Toplama İşlemi\n" +
                "\t\t  2. Çıkarma İşlemi\n" +
                "\t\t  3. Çarpma  İşlemi\n" +
                "\t\t  4. Bölme   İşlemi\n" +
                "   Çıkış İçin 'q' tuşuna basınız.";

        System.out.println("\n**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");

        while (true) {
            System.out.print("\nYapmak istediğiniz işlemi tuşlayınız : ");
            String secim = scanner.nextLine();

            if (secim.equals("q")){
                System.out.println("Hesap makinasından çıkış yapılıyor...");
                break;

            } else if (secim.equals("1")) {
                System.out.print("Yapmak istediğiniz işlem sayısını seçiniz (2 ile 5 arasında) : ");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sonuç : " + toplama(a , b));

                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sayıların toplamı : " + toplama(a , b , c));

                } else if (kacsayi == 4) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    System.out.print("d: ");
                    int d = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sayıların toplamı : " + toplama(a , b , c , d));

                } else if (kacsayi == 5) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    System.out.print("d: ");
                    int d = scanner.nextInt();
                    System.out.print("e: ");
                    int e = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Sayıların toplamı : " + toplama(a , b , c , d , e));

                } else {
                    System.out.println("Hata, böyle bir metod yok!");
                }
            } else if (secim.equals("2")){

                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b= scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sonuç : " + cikarma(a , b));

            } else if (secim.equals("3")) {
                System.out.println("Yapmak istediğiniz işlem sayısını seçiniz (2 ile 5 arasında)");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nSonuç : " + carpma(a , b));

                } else if (kacsayi == 3) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("b: ");
                    int c = scanner.nextInt();
                    System.out.print("c: ");
                    scanner.nextLine();

                    System.out.println("\nSonuç : " + carpma(a , b , c));

                } else if (kacsayi == 4) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    System.out.print("d: ");
                    int d = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nSonuç : " + carpma(a , b , c , d));

                } else if (kacsayi == 5) {

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    System.out.print("d: ");
                    int d = scanner.nextInt();
                    System.out.print("e: ");
                    int e = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nSonuç : " + carpma(a , b , c , d , e));

                } else {
                    System.out.println("Hata, böyle bir metod yok!");
                }
            } else if (secim.equals("4")) {

                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sonuç : " + bolme(a , b));

            } else {
                System.out.println("Hatalı işlem!");
            }
        }
    }
}
