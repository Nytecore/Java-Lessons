import java.util.Arrays;
import java.util.Scanner;

public class myLesson {

            // Kullanıcıdan aldığımız değerler ile arrayimizin içini dolduracağımız bir metod yapalım :
    public static int[] arrayi_doldur (int arraySayisi) {

        Scanner scanner = new Scanner (System.in);

        int[] print = new int[arraySayisi];

        for (int i = 0; i < arraySayisi; i++) {
            System.out.print("Array değeri girin : ");
            print[i] = scanner.nextInt();

        }
        return print;

    }

        // İçini doldurduğumuz metodu bastırmak için bir metod daha yapalım :
    public static void arrayi_bastir (int[] array) {

        for ( int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i+1) + " : " + array [i]);
        }
    }


        // Bir array'i sıralamayı görelim :
    public static void arraySort (int [] array) {

        /*
        Bir array'i sıralamak için kendimiz yaratmaya çalışmak çok zor olurdu. Bunun için belirli algoritmalar
        kullanmamız gerekebilirdi. (Bubble Sort - Selection Sort gibi) Ancak burada "Arrays" sınıfını kullanarak
        bellirli bir metodu kullanacağız ve bu arrays'i direkt sıralamış olacağız.
         */

        Arrays.sort(array);     // Sory metodu kendi içinde bu arrayi sıralamış olacak.

    }
    public static void main(String[] args) {

        // ----- AŞAĞIDAKİ SATIRLARDA ARRAYLER EŞİT Mİ ONU KONTROL ETMEYİ GÖRECEĞİZ  -----

        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {1,2,3,4,5,6};


        System.out.println("\n\t ----- ARRAYLERİN EŞİTLİK DURUMUNU KONTROL EDELİM -----");

        System.out.println(" ");            // Boş bir satır kodu.


        if (a1 == a2) {
            System.out.println("Array referansları eşittir..");

        } else {
            System.out.println("Array referansları eşit değildir..");

        }

            /* Arraylarin eşit olmadığını burada anlarız. Aslında a1 ve a2 array listesi içerisindeki değerler
            eşit olabilirler fakat bizim burda kontrolünü yaptırttığımız eşitlik şudur: a1 arrayi ve a2 arrayi
            bellek içinde farklı yerleri işaret ettiklerinden eşit olmazlar. Fakat biz arraylerin içerisindeki
            değerlerin eşitliğinin kontrolünü de yaptırtabiliriz o da şu şekilde :                          */


        System.out.println(" ");            // Boş bir satır kodu


        if (Arrays.equals(a1,a2)) {
            System.out.println("Arraylerin değerleri (içerikleri) eşittir.");

        } else {
            System.out.println("Arraylerin değerleri (içerikleri) eşit değildir.");

        }


        System.out.println("\n\t ----- ARRAYLERİ DOLDURALIM -----\n");
        int[] a = arrayi_doldur(5);   // Burada "arrayi_doldur" metodunu çağırarak onu 'a' arrayine eşitledik.

        System.out.println("\n ////// ARRAYLER SIRALANDI");
        arraySort(a);                           // Arrayi sıralamamızı sağlayacak olan attaySort metodu.

        System.out.println("\n\t ----- ARRAYLER BASTIRILIYOR (PRINT) -----\n");
        arrayi_bastir(a);                       // Burada da eşitlediğimiz 'a' arrayini print ettirdik.





    }
}
