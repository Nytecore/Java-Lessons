import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

        /* İlk olarak bu HashMap'in bir anahtar kelimesi olması gerekiyor,
        daha sonra o anahtar kelimeye karşılık gelen bir tane değeri olması
        gerekiyor ve biz de bu anahtar kelimenin ilk olarak veri tipini
        söylememiz gerekiyor. */

        // Kullanım şudur : HashMap<K,V>  ---> Burada K = key (integer) V = value (string) olacaktır.
            // Not: HashMap içerisine veri ekleme ".add()" şeklinde değil ".put()" şeklinde olur.


        hashMap.put(10,"Java");
        hashMap.put(20,"CSS");
        hashMap.put(30,"Php");
        hashMap.put(40,"Php");
            // Yukarıdaki satırda 2 adet "Php" içeren Value (String) değer vardır ve ikisi de yazdırılabilir.
        hashMap.put(30,"C++");
            // yukarıdaki satırda kulanılan "30" Keyi (Integer) değeri 2 kez yazılmıştır ve
                // hashMap sadece birini depolar ve yazdırır.

        System.out.println("\nHashMap = " + hashMap);


        /*
        Şöyle bir şey yapalım; buradaki belirli bir key'e karşılık gelen
        bir değeri bulmaya çalışalım bunun için .get() metodunu kullanılır.

        .get() şeklinde bir şey dediğimiz zaman "Object Key" şeklinde bizden
        bir değer bekler. Key ekleriz ve o key'e karşılık gelen değeri elde
        etmiş oluruz. Örn: 20 yazarsak bize CSS'i alır ve yazdırmak istersek
        onu bize yazdırarak verir. Örnek yapalım:
         */

        System.out.println("\n20 Key'ine karşılık gelen değer : " + hashMap.get(20));
                // "CSS" Sonucunu vermeli.

        // Eğer girilen key' karşılık gelen bir değer yoksa "null" şeklinde bir çıktı verir.

        System.out.println("100 Key'ine karşılık gelen değer : " + hashMap.get(100) + " (DEĞER YOK)");
                // "null" Sonucunu vermeli.

        // Peki biz bu key ve valuelerin her birini alt alta nasıl bastıracağız ?   ---->>>

        System.out.println("\n****** HashMap'i alt alta satır satır yazdıralım ******");
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {

            System.out.println("Key : " + entry.getKey() + "----->  Value : " + entry.getValue());
        }

        /* HashMap'in satır satır alt alta yazdırılması yine forEach döngüsü ile yapılır.
        Ancak bu HashMap'i ilk olarak biz entrySet'e dönüştürmemiz gerekiyor. Sonrasında
        "Map.Entry<Integer,String> entry : hashMap.entrySet()" şu şekilde yazarak ekrana
        sırasıyla alt alta satır olarak bastırabiliyoruz.   */

    }
}
