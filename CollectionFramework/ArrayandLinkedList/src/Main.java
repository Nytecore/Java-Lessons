import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        zamanHesapla("LinkedList" , linkedList);
        zamanHesapla("ArrayList" , arrayList);





    }
    public static void zamanHesapla (String veri_tipi , List<Integer> list) {

        // List'in sonuna değer eklmeme:

        long baslangic;
        long bitis;
            // Başlangıç ve bitiş zamanlarımızı tutan iki değer atamaları yapalım.


        baslangic = System.currentTimeMillis(); // ---> Burada for döngüsü başlamadan önceki zamanı
                                                // almış oluruz, o süreyi değer ataması olarak yapacak.

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        bitis = System.currentTimeMillis();     // ---> Burada yine for döngüsünün bittiği zamanı alıp
                                                // onu "bitis" değerine atamasını yapacak.

        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms.");
        // Burada sırasıyla en sonra sürekli olarak indeks eklenerek çalıştırılma yapılıyor.


        baslangic = System.currentTimeMillis(); // ---> Burada for döngüsü başlamadan önceki zamanı
                                                // almış oluruz, o süreyi değer ataması olarak yapacak.

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }

        bitis = System.currentTimeMillis();     // ---> Burada yine for döngüsünün bittiği zamanı alıp
                                                // onu "bitis" değerine atamasını yapacak.

        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms.");
        // Burada da sürekli olarak 0. yani ilk indekse değer verilerek çalıştırılma yapılıyor.

    }
}

        /* Özet olarak, yukarıda yaptırdığımız işlemler şudur: Biz iki işlemi hem
        ArrayList hem de LinkedListte yaptırıyoruz. ArrayList ve LinkedList'e burada
        1 milyon değer var gibi saydırıyoruz ve her döngüde en sona bir değer
        eklettiriyoruz. Değeri her döngüde en sona eklettiğimiz için ArrayList her
        seferinde en sona bir yer açıp, değeri oraya ekliyor. Bu durumda, LinkedList
        ise en sona eklenen değerin referansının gösterdiği yeri ayırarak her seferde
        yeni bir referans bağlantısı yapıyor . Bu yüzden burada LinkedList biraz daha
        yavaş çalışıyor gibi görünüyor.

        FAKAT asıl işlem, bu değeri en başa ya da içerde kalan indekslerden her hangi
        birine eklemekte görünüyor. Böyle bir durumda, LinkedList için işlem kolaydır.
        Sadece araya ya da en başa eklenen değerin referans bağlantısını kopararak ye-
        rine yeni referans ekleyecek ve önceki referansın bağlantısını bu kez o indekse
        gönderece ve kısa sürede işlemi tamamlayacaktır. Ama ArrayList; her seferinde
        arada olan ya da en baştaki indekse değer eklemek için en sona bir yer ayıracak,
        sonrasında eklenen değerden sonraki değerlerin her birini sırayla bir bir aşağı
        kaydıra kaydıra ilerleyecektir. Bu işlem çok uzun sürer ve süre olarak ArrayList
        çok daha yavaş çalışarak işlemi tamamlayacaktır.
         */