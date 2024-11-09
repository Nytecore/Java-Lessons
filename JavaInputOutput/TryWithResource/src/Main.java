import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // Java 7 ile birlikte gelen TryWithResource yapısını öğreneye çalışacağız.
        /* Normalde biz kodlamamızı yaparken örneğin FileWriter konusunda yaptığımız gibi bir
        dosya oluşturup okuma - yazma işlemi yaptırıp sonrasında mutlaka yapmamız gereken
        işlem olan dosya kapatma (yani .close) metodunu kullanıp dosyamızda işlemi yapıp
        sonrasında da dosyayı kapatırdık. (NOT:DOSYAMIZIN KAPATILMASI İŞLEMİ ÇOK ÖNEMLİDİR.
        KAPATMA İŞLEMŞİ YAPMAZSAK DOSYA ÇALIŞMAYA DEVAM EDEREK ARKAPLANDA BİLGİSAYARIMIZIN
        KAYNAKLARINI KULLANMAYA DEVAM EDER) Bu işlemleri yaparken de dosya açılırken, dosya
        okunurken, dosya kapatılırken gibi işlemlerde sürekli bir exception çıkma durumundan
        dolayı karşımıza checked exception uyarısı verirdi ve biz de bu işlemleri mecburen
        try catch bloğu içerisinde yapardık ki bir hata durumunda onu öngörüp yakalamış olalım.
        İşte tüm bu işlemleri (dosya kapatma - exception yakalama) java 7 ile gelen TryWithResource
        metodu ile java bizim yerimize yapıyor ve uzun uzun try catch bloğu ve bazı işlemleri
        yapmadan kodlamayı bitirmiş olabiliyoruz. Bunu nasıl yaparız ? --->>        */

        // try()
            /* Parantez içine yazılan class tipinde olan referansımız (FileInput-OutputStream,
            FileWriter...) mutlaka ve mutlaka bu classımız "closable" tarzında bir inerface'i
            implemente etmesi gerekiyor. Eğer implementasyon işlemlerini yaptırtmazsak bu
            TryWithResources, dosyamızı otomatik olarak kapatmayacaktır. Aynı zamanda buradaki
            "closable" interface'ini implemente eden tüm classları biz implement edebiliriz. */

        try(FileWriter writer1 = new FileWriter("JavaInputOutput/TryWithResource/src/dosya.txt");
            FileWriter writer2 = new FileWriter("JavaInputOutput/TryWithResource/src/diller.txt")){

            // --> Buradaki FileWriter, "Closable" interface'ini implemente ettiği için sorun
                // olmadan TryWitchResource yapısı kendisi dosyanın işlemi bittiğinde otomatik
                    // olarak dosyayı kapatacaktır.

            writer1.write("Deneme");
                // Yukarıdaki şekilde yapılan kodlama ile biz başka bir şey kullanmadan direkt
                    // olarak dosya.txt dosyasını yazabiliyoruz.
                        // TryWithResource kullanmazsak hem dosya kapatma işlemini hem de
                            // Çok fazla exception'u handle etmemiz gerekecek.

            /* Eğer yukarıdaki FileWriter oluşumu gibi yine bir tane daha dosya oluşturmak
            istersek, FileWriter writer = new FileWriter (filename:"....")) alanının yanına
            ";" ekleriz ve alt satıra yenisini oluşturarak yeni bir dosya oluşturabiliriz.   */

            // Yukarıya kodlamayı ekleyerek yei bir dosya2.txt oluşturduk.
                // Şimdş de, kullanıcıdan aldığımız değerler ile yazma işlemini yapalım.

            Scanner scanner = new Scanner (System.in);
            String dil;
            System.out.println("Çıkış için 'q' basınız.");

            while (true) {

                System.out.print("Bir dil giriniz : ");
                dil = scanner.nextLine();

                if (dil.equals("q")) {
                    System.out.println("Programdan çıkılıyor....");
                    System.out.println("Dosyayı kontrol ediniz.");
                    break;
                }

                writer2.write(dil + "\n");
            }

        } catch (IOException ex) {
            System.out.println("Dosya oluşturulurken hata oluştu : 'IOException'");
        }

        /* TryWithResource yapılarını bu şekilde kullanarak pek çok try catch işleminden kurtulmuş
        ve ekstra programı kapatma kodu da yazmamış olarak kodlamamızı oldukça kısaltmış zamandan da
        yine kazanmış oluruz...
         */
    }
}
