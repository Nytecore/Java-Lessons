import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.print("Bir sayı giriniz: ");
        Scanner scanner = new Scanner (System.in);

        int islem = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("1. İşlem");
                break;
            case 2:
                System.out.println("2. İşlem");
                break;
            case 3:
                System.out.println("3. İşlem");
                break;
            case 4:
                System.out.println("4. İşlem");
                break;
            default:
                System.out.println("Geçersiz İşlem!");
                break;
        }

                /*
                Switch - Case durumunda case'lerde break komutu yok ise koşul sağlansa da
                sağlanmasa da oradaki case çalıştırılır. Bu yüzden case'lerde gereken
                durumlar dışında break kullanılması gerekir.
                 */

    }
}
