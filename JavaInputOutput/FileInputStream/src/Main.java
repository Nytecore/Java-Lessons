import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // FileInputStream ile bir dosyadan veri okumaya çalışacağız..
            // ve bunun değişik yollarını göreceğiz.

                    /* Bizim dosya.txt adında bir text dosyamız var ve içerisinde "Java Programlama Dili"
                    yazıyor. Biz bu yazıyı belli metotlarla okuyacağız. İlk olarak FileInputStream ile bir
                    referans oluşturmamız gerekiyor.    */

        FileInputStream fis = null;
            // (1) FileInputStream oluşturulup null değere atandı.

        try {
            fis = new FileInputStream("JavaInputOutput/FileInputStream/src/dosya.txt");


                    /* (2) FileInputStream burada tekrar oluşturulup "fis" adlı bir referansa bağlandı.
                    içerisine de okunması gereken dosyanın adı "dosya.txt" olarak girildi. Yanlış olarak
                    girilen dosya adının okunamaması halinde de hata vermesini önlemek adına aşağıda bir
                    try-catch exception bloğu eklendi.  */

                    /* (5) Normal olarak dopsyayı okumak istediğimizde yapmamız gereken şudur: Normalde
                    bu kodlamayı çalıştırdığımızda dosya.txt okunacak ve bizim oluşturduğumuz fis yani
                    FileInputStream'imiz, text dosyasının en başına gidecek ve bekleyecek. Burada ileride
                    yer alan kararkterlerden bir tanesini okumak istersek "fis.read()" metodunu kullanmak
                    gerekiyor. Bu metod bize bir byte cinsinden değer döner ve bizim bunu mutlaka char
                    tipine dönüştürmemiz gerekiyor. Bunu da System.out.println((char)fis.read)) şeklinde
                    dönüştürme yaparak onu (char) ile charactere dönüştürmemiz gerekiyor. Bu durumda da
                    bizim IOException hatamız ortaya çıkar ve biz try - catch bloğuna bir de bunun için
                    ayrıca IEOxception yakalaması eklememiz gerekiyor. Aşağıdaki işlemler bunlar olacak: */

            /*
            System.out.println("Okunan Birinci Karakter : " + (char)fis.read());
                    // fis.read() metodu tek bir byte'ı okur.
            System.out.println("Okunan İkinci Karakter : " + (char)fis.read());
                    // başka bir karakter okunmak istenirse kod tekrar yazılır.
            System.out.println("Okunan Üçüncü Karakter : " + (char)fis.read());
                    // başka bir karakter okumak istenirse kod tekrar yazılır.
                        // Her okuma işleminde okunan char'da imlecimiz bir sağa gider.
                            // Yeni okunacak olan char, imlecin sağındaki olur.
             */


                    /* (6) Dosyanın belirli bir yerinden itibaren veri okumak için yapılacak başka bir
                    işlem daha vardır. Bu işlemi .skip() metodu ile yapabiliriz. Okutacağımız dosya yani
                    dosya.txt içerisinde "Java Programlama Dili" yazıyor ve biz "Java " karakterlerini
                    atlayıp direkt olarak "Programlama Dili" ilerisindeki 'P' karakterinden okumaya
                    başlamak istersek, karakterlerin hepsini tek tek sayarız (boşluk dahil) 5. karaktere
                    imleci götürüp 6. karakterin okunmasını istiyoruz örneğin o zaman şu kodu yazarız:
                    fis.skip(5); imleç 'P' karakterinin önüne gider ve onu görür sonra (char)fis.read()
                    kodumuz, bize P-r-o... karakterlerinden başlayarak okuma yapar. */

            /* fis.skip(5);
            System.out.println("Okunan 1. karakter (Skip kullanıldı) : " + (char)fis.read());
            System.out.println("Okunan 2. karakter (Skip kullanıldı) : " + (char)fis.read());
            System.out.println("Okunan 3. karakter (Skip kullanıldı) : " + (char)fis.read());
            System.out.println("Okunan 4. karakter (Skip kullanıldı) : " + (char)fis.read());

             */

                    /* (7) Peki bütün karakterleri okumak istersek bunun için ne yapmalıyız? :
                    fis.read() tek bir byte okur. Okuyacak byte kalmadıysa -1 değer döndürür.
                    while ile her döngüde bir fis.read() yapılabilir ve -1 değeri gelince de bu
                    döngü durdurulabilir. Bunu  while döngüsü ile aşağıdaki şekilde yazabiliriz:
                     */

            /* int deger;
            String s = "";
            while ((deger = fis.read()) != -1) {
                s += (char)deger;
            }

            System.out.println("Dosya İçeriği : " + s); */

                    /* (8) Dosyanın 5. karakterinden itibaren 10 karakter okutmak istiyorsak
                    ne yapacağız; aşağıda bu işlemin örneğini yapalım:      */

            int deger;
            String s = "";
            int say = 0;
            fis.skip(5);

            while ((deger = fis.read()) != -1) {
                s += (char) deger;
                say++;

                if (say == 11) {
                    break;
                }
            }
            System.out.println("Dosyanın 5. Karakterinden İtibaren 11 Karakter : " + s);

                    /* Öncelikle "deger" referansıdna bir integer oluştururuz sonra da bir "s"
                    referansında boş bir (" ") string oluştururuz. while döngüsü içerisinde
                    fis.read()  metodu ile dönen ASCI değerini "deger" adlı integer'a atarız.
                    Döngü içerisinde -1'e eşit olmadığı sürece döngü devam etmesini isteriz.
                    "!= -1" okunacak karakter kalmadığında, fis.real() metodu -1 dönecek ve
                    döngü duracak. Yani bu sayede, fis.read() metodundan dönen ASCII rakamları,
                    -1 olana kadar bütün rakamlar tek tek "deger" referansı ile integer olarak
                    alınacak ve alınan tüm değerler tek tek (char) yani character'e dönüşerek
                    boş String olarak açılan "s" referansına döngü durana dek tek tek atanacak.
                    Bu sayede fis.real() == -1 olana kadar yani döngü durana, okunacak harf
                    kalmayana kadar tek tek ASCII karakterleri int sonrasında da chara dönüşerek
                    döngü içinde tek tek alınarak stringe toplana toplana yazılacak ve döngü
                    bittiğinde string s yazdırılarak dosyanıntamamı okunmuş olacak.         */

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı: 'FileInputStream'");
                // exception'a karşılık try - catch exception bloğu eklendi.
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu: 'IOException'");
        } finally {
                    /* (4) Burada da finally bloğu içerisine dosya gereksiz yere kaynak kullanmaması için
                    işlem tamamlandıktan sonra kapatılması gerektiğinden bir dosyayı kapatma fonksiyonu
                    yazıldı. Fakat, şöyle bir durum var; eğer dosya okunamaz ise, en başta biz FileInputStream'i
                    null değere attığımız için, ok unamayan dosya burada ayrıca NullPointerException hatası
                    verecekti. Bunu önlemek için de yine try-catch içerisine "eğer fis, null'e eşit değil ise
                    fis.close (dosyayı kapat)" komutu yazdık ve bu sayede NullPointerException hatasını da
                    önlemiş olduk.  */

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir sorun oluştu: 'IOException'");
            }
        }
    }
}