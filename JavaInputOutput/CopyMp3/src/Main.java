import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
                /* (1) Öncelikle içerikteki 1 ve 0 lardan oluşan byteCode'ları okumak ve yazmak için,
                okunan verileri depolamak için bir ArrayList oluşturuldu. Dosya okunacak ve ArrayList
                içerisine depolanıp "icerik" referansında bekleyecek. İstenildiğinde oradaki veriler
                kopyalanacak ya da dönüştürülecek vs.. Okunan değerler 1 ve 0'lardan oluşan bytecode
                olduğundan oluşturulan ArrayList --> Integer formatında oluşturuldu. Integer tipinde
                veri tutacak içerisinde.    */


    public static void dosyaOku() {
                /* (2) Sonrasında kopyalama yapacağımız işlemi öncelikle okutmamız gerektiği için
                "dosyaOku" referansında bir metod oluşturuldu.  */

        try {                                   // try ~ catch ile exceptionlar yakalanıyor...
            FileInputStream in = new FileInputStream("JavaInputOutput/CopyMp3/src/IzmirMarsi.mp3");
                /* (3) Burası önemli. Yukarıda "FileOutputStream" metodu ile "in" referansında okutma
                işlemi yaratıldı ve okuma işleminin yapılacağı dosya hedefi ve adı ile birlikte
                belirtildi. Okunacak olan dosya "in" referansına 1-0 bytecode'ları ile okunacak,
                ArrayList'e gönderilip orada tutulacak ve oradan kopyalanacaktır.   */


            int oku;
            while ((oku = in.read()) != -1) {
                icerik.add(oku);

            }
                /* (4) Yukarıda da "oku" referansında bir integer değer yaratıldı. Okunan bytecode'lar
                "oku = in.read()" kodu ile öncelikle buradaki "oku" referansına yerleşecek, yani yukarıda
                "in" referansında FileInputStream ile yaratılıp IzmırMarsi.mp3 dosyasının bytecode'u
                integer değeri ile ilk önce "in.read()" metoduyla okunup "= oku" işlemiyle de "oku"
                referansına eşitlenecek. Artık "oku" olan değerimiz, dosya içerisinde okunacak bir değer
                kalmayana dek tek tek okunacak (okunacak bir şey kalmadığında -1 dönecek ve döngü duracak)
                döngü devam ettiği sürece de her okunan bytecode değeri en üstte oluşturulan "icerik"
                referanslı ArrayList'e tek tek "icerik.add(oku)" işlemi ile ArrayList doldurulacak. */



        } catch (FileNotFoundException ex) {    // try ~ catch ile exceptionlar yakalanıyor...
            System.out.println("Dosya bulunamadı: 'FileNotFoundException' ");
        } catch (IOException ex) {              // try ~ catch ile exceptionlar yakalanıyor...
            System.out.println("Dosya okunurkenm bir hata oluştu: 'IOException'");
        }
    }

    public static void kopyala (String dosya_ismi) {
                /* (5) Sonrasında kopyalama işleminin yapılacağı metod yukarıda "kopyala" referansı ile
                oluşturuldu. Metod kullanılırken kopyalanan dosyanın kopyalandıktan sonra adının ne
                olarak kopyalanacağı kullanıcı tarafından metod çağırılırken yazılacak. */


        try {                                   // try ~ catch ile exceptionlar yakalanıyor...
            FileOutputStream out = new FileOutputStream("JavaInputOutput/CopyMp3/CopiedMp3/" + dosya_ismi);
                /* (6) Yukarısı önemli. Yukarıda az önce okuma işlemi ve okunacak dosyanın hedefi için
                yaptığımız işlem yazma yani kopyalama durumunda "FileOutputStream" olarak ve kopyalanacak
                hedef yazılarak belirlendi. Burada kopyalamak istediğimiz hedefi de yine String oluşturur
                gibi "..." içerisinde ve hedef hedef ayırarak en son gelinen hedefe kopyalanmak isteniyorsa
                da mutlaka sonuna bir tane daha "/" eklenerek dizin belirtilir ve kullanıcıdan alınacak
                dosya ismi, kopyalanacak olan hedefe o isimle kopyalanack bunun için şöyle bir işlem
                yapacağız :  "JavaInputOutput/CopyMp3/CopiedMp3/" + dosya_ismi)         */


            for (int deger : icerik) {
                out.write(deger);
            }
                /* (7) Yukarıdaki işlem, kopyalama işleminin yapıldığı işlemdir. Burada forEach döngüsü
                ile az önce okunurken ArrayList'e eklediğimiz integer değerler tek tek burada oluşturulan
                "deger" referanslı integer veri tipinden icerik ArrayListinden dönen veriyi döngüye alarak
                "out" referansı ile kopyalama işlemi ve hedefinin yapılacağı alanı .write() metodu ile
                farklı bir yere tüm değerler alınıp yazılana kadar döngü içinde yapılacak olan işlem budur.
                Yani "icerik" ArrayListine eklenen bütün bytecode değerleri döngüye girip tek tek çıkacak
                çıktan değerler tek tek "deger" referansına eşitlenecek, eşitlenen bytecode değerleri tek
                tek out.write() metodu ile tekrar istenen yere yazılarak kopyalama işlemi yapılacaktır.
                 */


        } catch (FileNotFoundException ex) {    // try ~ catch ile exceptionlar yakalanıyor...
            System.out.println("Dosya bulunamadı: 'FileNotFoundException'");
        } catch (IOException ex) {              // try ~ catch ile exceptionlar yakalanıyor...
            System.out.println("Dosya yazılırken hata oluştu: 'IOException'");
        }


    }
    public static void main(String[] args) {

                /* Bu derste src dosyası içerisinde yer alan "IzmirMarsi.mp3" dosyasını, aynı
                file içerisinde bulunan CopiedMp3 dosyası içerisine kopyalama işlemini FileInputStream
                ve FileOutputStream ile yapmayı öğreneceğiz. Bunun için kopyala ve dosyaOku adında iki
                farklı metod oluşturacağız ve bu işlemleri metod ile yaptıracağız.*/

                // BURADA YAPILAN İŞLEMİ JAVA ÇALIŞTIRIYOR BİLDİĞİMİZ GİBİ.....


        long baslangic = System.currentTimeMillis();

            // Dosya okuma işleminin yapılacağı metod çalıştırılmak için çağrılır.
        dosyaOku();

            // Dosya kopyalama işleminin yapılacağı metod çalıştırılmak üzere çağrılır,
                // Kopyalanan dosyaya yeni verilecek isim eklenir ve kopyalama işlemi hazır olur.
                    // Program çalıştırıldında kopyalama işlemi başlar ve biter..
        kopyala("IzmirMarsi.mp3");

        long bitis = System.currentTimeMillis();

        /* Yukarıdaki System.currentTimeMillis(); işlemleri ile de bizim bu kopyalama
        işleminin ne kadar sürdüğünü gösteren bir kodlama yazdık. Sistem, çalıştığı
        zamanı ve çalışmanın durduğu zamanı alıp, bunları birbirlerinden çıkaracak ve
        ne kadar sürede işlemin yapıldığını bize gösterecek.        */

        System.out.println("Dosyanın kopyalanması için geçen süre : " + (bitis-baslangic) / 1000 + " saniye.");




    }
}
