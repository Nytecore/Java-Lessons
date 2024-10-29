import java.util.Scanner;

public class Main {

    /* Throw anahtar kelimesi

    Normalde exceptionlar, hata verilecek durumu bekler ve hata alınınca
    exception fırlatır. Fakt throw, istediğimiz zaman kendi exception'ımızı
    fırlattırmamızı sağlar. Örneğin aşağıda bir işlem yaptıracağız, burada
    bir mekan olacak. Mekanda 18 yaş üstü giriş yaptığında sorun çıkmayacak
    fakat 18 yaş altı giriş yaptığında exception fırlatacak. Bunun kodlaması
    aşağıda örnek olarak yapalım.
     */

                // (3) Kontrolün yaptırılacağı metodu oluşturalım.
    public static void mekan_kontrol(int yas) {

                // (4) Aşağıdaki durumda (eğer girilen "yaş" değeri 18'den küçükse)
                    // (4) "ArithmeticException" fırlatılsın. Eğer "yaş" değeri 18
                        // (4) den büyükse, "Mekana hoşgeldiniz..." bastırılsın dedik.
        if (yas < 18) {
            throw new ArithmeticException();

        } else {
            System.out.println("Mekana hoşgeldiniz...");

                    // (5) Bu metodu da main metod içinde çağıracağız.

        }
    }

        public static void main (String[]args){

                // (1) Scanner oluşturalım. Kullanıcıcan yaş alacağız.
            Scanner scanner = new Scanner(System.in);

                // (2) Aşağıda kullanıcıya girdi aldırmak için gereken işlemleri yazalım.
            System.out.print("Lütfen yaşınızı giriniz : ");
            int yas = scanner.nextInt();

            // mekan_kontrol(yas);
                // (6) Main metodda mekan_kontrol metodunu çağırdık ve scannerden alınacak olan
                    // (7) "yas" değerini, metodun sorgulama değeri olarak atadık.

                // -----> Değer 18'den küçük girilince = "ArithmeticException" fırlatılacak.
                // -----> Değer 18'den büyük girilince = "Mekana hoşgeldiniz..." yazdırılacak.


            // System.out.println("Exception vermezse burası bastırılacak.");
                // -----> Eğer exception alırsak yukarıdaki satır bastırılmayacak. O kod görülmeyecektir.
                // -----> Exception almazsak, yukarıdaki satır bastırılabilecektir.

            // Not: Biz yukarıdaki metodu try - catch bloğuna da alabiliriz. Bu sayede exception yakalamış oluruz.

            try {
                mekan_kontrol(yas);

            }catch (ArithmeticException e) {
                System.out.println("18 yaşından küçükler mekana giremezler...");

                // (8) Yukarıdaki durumda biz try-catch ile programı güvene aldık. Exception durumu olursa
                    // (8) yakalanacak ve catch bloğu çalışacaktır.
            }

        }
}
