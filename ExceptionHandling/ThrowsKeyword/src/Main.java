import java.io.IOException;
import java.util.Scanner;

public class Main {



            /* Normalde aşağıdaki durum oluşturuğunda, unchecked expection olan
            ArithmeticException hatası alacağız. Fakat biz CheckecExpection olan
            IOException hatası almak istiyorsak bunun için bir işlem yapmamız gerek.
            Checked Exception'lar, javada farkedilir ve handling için ekstra işlem
            yapmamız gerekir. Unchecked gibi değildir. Bu işlemi yaptırıp onu
            checked exception'a dönüştürme durumumuza "throws" işlemi denir. Bu
            aşağıdaki gibi yapılır. Oluşturulan metodun yanına ekstra yapılacak
            olan işlem yazılır.

            normalde : public static void mekan_kontrol(int yas) {
            değiştirilmiş hal : public static void mekan_kontrol(int yas) throws IOException {

            yukarıdaki değişikliği yaparak, unchecked exception olan (ArithmeticException) hatasını
            checked exception olan (IOException) a dönüştürmüş oluruz.


             */
        public static void mekan_kontrol(int yas) throws IOException{

        if (yas < 18) {
            throw new IOException();

        } else {
            System.out.println("Mekana hoşgeldiniz...");

        }
    }

    public static void main (String[]args) throws IOException{

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        mekan_kontrol(yas);
        /* try {
            mekan_kontrol(yas);
                // Burada mekan_kontrol(yas) try - catch bloğunda olmazsa java exceptionu görüyor
                    // ve bizden onu yakalamamızı istiyor. IOException bir checked exception olduğu
                        // için java onu yakalamadan programmın çalışmasına izin vermiyor.

        } catch (IOException e) {
            System.out.println("IOException oluştu.");
        }*/


    }
}

/* Kısada "throws" anahtar kelimesi checked exceptionlarda kullanılıyor.
Diğer durumlarda kullanmamız ya da kullanmamamız çok önemli değil. Fakat
exception'u eğer biz değil de programı sonradan kullanacak olan kişi
örneğin biz programı JAR dosyasına ya da API Dosyasıa dönüştürdük ve bu
dosyayı başka biri kullanacaksa, biz eğer exception'u onun bulup yakalama
sını istiyorsak o halde exceptionun olduğu metoda direkt olarak onu eklemeliyiz.

Yukarıda o şekilde kullanımı da var. main metodun içinde exception fırlatıldığı
için main metodun oluşumunda throws anahtar kelimesi kullanıldı.

--> throws IOException "public static void main (String[]args) throws IOException"
 */
