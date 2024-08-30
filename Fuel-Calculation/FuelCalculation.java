import java.util.Scanner;

public class FuelCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("\n \t \t YAKIT / MALİYET HESAPLAMA ARACI");

        System.out.print("\nÖncelikle aracınızın 100 kilometrede yaktığı yakıtın fabrika verisini giriniz : ");
        double x = scanner.nextDouble();

        System.out.print("Bulunduğunuz il / ilçe'de yakıtın litre fiyatını giriniz : ");
        double y = scanner.nextDouble();


        System.out.println("\nAracınız kilometrede " + x * y / 100 + "TL yakıt harcar.");


        System.out.print("\nMesafede harcanan yakıtı hesaplamak için;\n" +
                "Aracınızla katettiğiniz yolu kilometre cinsinden giriniz : ");
        double z = scanner.nextDouble();

        System.out.print("\nAracınız, " + z + "km mesafede " + z * (x * y / 100f) + "TL yakıt harcamıştır.");


    }
}
