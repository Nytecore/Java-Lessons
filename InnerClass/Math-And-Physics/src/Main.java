import java.util.Scanner;

public class Main {

    // Basit Matematik ve Fizik Problemleri
    // Daire Alan - Matematik
    // Üçgen Çevresi - Matematik
    // 3 Boyutlu Vektörlerin İç Çarpımı - Fizik

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Matematik ve Fizik Problemleri Programına Hoşgeldiniz ---\n");

        String islemler =
                "1. İşlemleri Görüntüle\n" +
                "2. Daire Alanı Hesaplama\n" +
                "3. Üçgen Çevresi Hesaplama\n" +
                "4. İki Vektörün İç Çarpımını Hesaplama\n" +
                "Çıkış : 'q' tuşuna basınız..";


        System.out.println(islemler);

        while (true) {
            System.out.print("\nİşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;

            } else if (islem.equals("1")) {
                System.out.println("\n--- İŞLEMLER GÖRÜNTÜLENİYOR ---\n");
                System.out.println(islemler);

            } else if (islem.equals("2")) {
                System.out.println("\n--- Dairenin yarı çapı hesaplanacak ---\n");
                System.out.print("Bir daire yarı çapı giriniz : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);

            } else if (islem.equals("3")) {
                System.out.println("\n--- Üçgenin Çevresi Hesaplanacak ---\n");
                System.out.print("Üçgenin birinci kenarını giriniz : ");
                int birKenar = scanner.nextInt();
                System.out.print("Üçgenin ikinci kenarını giriniz : ");
                int ikiKenar = scanner.nextInt();
                System.out.print("Üçgenin üçüncü kenarını giriniz : ");
                int ucKenar = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(birKenar , ikiKenar , ucKenar);
                
            } else if (islem.equals("4")) {
                System.out.println("\n--- Vektör İç Çarpımı Hesaplanacak ---\n");
                Vec vec1 = new Vec("1. Vektör");
                Vec vec2 = new Vec("2. Vektör");
                Problem.Fizik.icCarpim(vec1 , vec2);

            } else {
                System.out.println("Geçersiz bir işlem yapıldı...");

            }
        }
    }
}
