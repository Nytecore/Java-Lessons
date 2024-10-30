import java.util.InputMismatchException;
import java.util.Scanner;


class CarpmaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar giriniz...");
    }
}

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        String islemler = "\t1. Toplama İşlemi\n" +
                "\t2. Çıkarma İşlemi\n" +
                "\t3. Çarpma  İşlemi\n" +
                "\t4. Bölme   İşlemi";

        System.out.println("\n***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        System.out.print("\nYapmak istediğiniz işlemi tuşlayınız : ");

        int islem = scanner.nextInt();

        if (islem >= 5) {
            System.out.println("Geçersiz İşlem");
        }
        else {
            int a;
            int b;
            try {
                switch (islem) {
                    case 1:
                        System.out.print("Birinci Sayı : ");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı : ");
                        b = scanner.nextInt();

                        System.out.println("\nSonuç : " + (a + b));
                        break;
                    case 2:
                        System.out.print("Birinci Sayı : ");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı : ");
                        b = scanner.nextInt();

                        System.out.println("\nSonuç : " + (a - b));
                        break;
                    case 3:
                        System.out.print("Birinci Sayı : ");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı : ");
                        b = scanner.nextInt();

                        if (a > 10000 && b > 10000) {
                            throw new CarpmaException();
                        }

                        System.out.println("\nSonuç : " + (a * b));
                        break;
                    case 4:
                        System.out.print("Birinci Sayı : ");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı : ");
                        b = scanner.nextInt();

                        System.out.println("\nSonuç : " + (a / b));
                        break;
                    default:
                        System.out.println("Geçersiz İşlem.");

                }
            } catch (ArithmeticException e) {
                System.out.println("Bir sayı sıfıra bölünemez.");
            } catch (InputMismatchException e) {
                System.out.println("Lütfen Inputları doğru formatta giriniz...");
            } catch (CarpmaException ex) {
                ex.printStackTrace();
            }
        }
    }
}