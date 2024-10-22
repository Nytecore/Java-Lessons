import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String[] kanallar = {"Radyo Viva","Radyo Fenomen","Kral POP","Radyo Hacettepe","Alem FM"};

        Radyo radyo = new Radyo(kanallar);

        Iterator<String> iterator = radyo.iterator();
                // Artık bu iterator sayesinde radyo üzerinde de gezinebilriz.

        System.out.println("\n      Iterator.next() ile üzerinde gezinme : ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* for (String s : radyo) {     ---> Bu şekilde bastırma yapamayız çünkğü forEach döngüsü, kendi içinde
            System.out.println(s);      bu yapıyı iterator'a dönüştürür.Yani "radyo" adlı objeden bir iterator
        }                               oluşturmaya çalışır. Ancak bu objemizin her hangi bir iterator objesi
                                        olmadığı için forEach döngüsü ile bastıramayız. Bunun için Iterable
                                        interface'ini implemente etmemiz gerekir.*/


        System.out.println("\n      forEach döngüsü ile bastırmak :");
         for (String s : radyo) {       //  ---> Iterable implementasyonu sonrası hata ortadan kalktı.
            System.out.println(s);
        }

         // Yine Radyo iterator'u döndüğümüz için burada kendi iteratorumuzu kullanmış oluruz.
    }
}
