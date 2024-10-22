import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // TreeMap kullanarak bir String içindeki harflerin frekanslarını bulalım :
            // Yani bir harfin kaç kez geçtiğini bulmaya çalışacağız:

        Scanner scanner = new Scanner (System.in);

        System.out.print("Cümleyi giriniz : ");
        String cumle = scanner.nextLine();

        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();

        // Biz burada eğer o karakter daha önce görülmemişse o karakteri ekleyeceğiz.
            // Ancak o karakter daha önce görülmüşse o karakterin sadece Key'ini değiştireceğiz.
                // Key derken yani o Key'e (karaktere) gelen karşılığı değiştireceğiz.

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);

            } else {
                frekans.put(c, 1);
            }
        }

        for (Map.Entry<Character,Integer> entry: frekans.entrySet()) {
            System.out.println("Karakter : " + entry.getKey() + " " + entry.getValue() + " kadar geçiyor.");
        }

        // Yukarıdaki yazdırma işlemi de bize bu projenin konusu olan, hangi
            // karakterin kaç kez geçtiğini gösterecektir.

        /* Cümle, kullanıcıdan alınacaktır. Kullanıcı bir cümle yazacaktır. Yazılan
        cümle (Örn. "Bora Yıldırım") içindeki harfler, boşluklar, noktalama işatetleri
        gibi tüm karakterlerden kaç tane geçtiğini bize söyleyecektir. ( Örn;
        "Bora Yıldırım" içerisinde her harften 1 tane, sadece 2 adet "r" ve 3 adet "ı"
        karakteri bulunur bunları bize tek tek verecektir....                   */

    }
}