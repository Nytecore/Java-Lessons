import java.util.Scanner;

public class Main {

            // Arrayı print etme metodu.
    public static void arrayi_bastir (int[] array) {

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Element " + (i+1) + " : " + array[i]);
        }
    }

            // Ortalama bulma metodu
    public static double ortalamBul (int[] array) {

        int topla = 0;

        for (int i = 0; i < array.length; i++) {

            topla += array[i];
        }
        return ((double)topla / array.length);
    }

    public static void main(String[] args) {

        /*
        Normalde bir veri tipine sadece 1 değer atanırdı. Örn; int a = 5;   -->  Burada olduğu gibi.
        Array'ler bizim bir veri tipinde istediğimiz kadar değeri depolamamızı sağlamaktadır.
        Bu şu şekilde gösterilir : int[] a ; Şu şekilde yazarsak --> int[] a = new int [10];
        int veri tipindeki a, bellekte 10 değer depolamalık yer gösteriyor demektir. Bu depolara da
        değer ataması yapmak için indexler gereklidir ve sıfırdan başlarlar. ( 0 - 1 - 2 - 3 - 4 ....)

        a'nın 5. indeksine yani 6. elemanına değer ataması yapacaksak; --> a [5] = 32; şeklinde gösterilir.
        Yani a'nın 5. indeksi (6. elemanına) 32 değerini atamış olduk. Bu şu şekilde alt alda da yazılır;

        a[2] = 11;
        a[4] = 23;

        Fakat bunu bu şekilde kullanmak gereksiz olacaktır. Şu şekilde de kullanılabilir :

        int[] a = { 30 , 40 , 50 , 60 , 70 }; --> 0. indeks = 30, 1. indeks = 40, 2. indeks = 50...

        aynı zamanda bu indeks atamalarını döngü içinde de yaptırtabilir ya da kullanıcıdan da alabiliriz.

         */

        /*
        int[] a = new int [5];
        for (int i = 0; i < 5; i++) {
            a[i] = i * 4 + 2;

            System.out.println(a[i]);

            Yukarıdaki gibi arrayler döngü içerisinde ataması yaptırılabilir.

            0. indeks = 2 ,
            1. indeks = 6 ,             // Bu şekilde atama
            2. indeks = 10,                 yaptırabiliriz. //
            3. indeks = 14,
            4. indeks = 18,
             */

            // Ya da atamaları kullanıcıya yaptırtabiliriz ==


        /*
        Scanner scanner = new Scanner (System.in);

        int [] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();

        }
        System.out.println("-------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

            -------->   Yukarıdaki şekilde kullanarak kullanıcıdan da array atamalarını yaptırtabiliriz.

         */

        /*
            -------->   Array uzunluğumuzu bulmak için yapmamız gereken:

        int[] b = {10,20,30,40,50,60};      // ----> Burada uzunluğu '6' olan bir array oluşturduk.

        System.out.println("'b' Arrayimizin uzunluğu : " + b.length);   // ----> "b.lenght" ile uzunluğu hesaplattık.

         */

        /*
            -------->   Array'i bir metoda gönderme işlemi:

        int[] b = {10,20,30,40,50,60};
        arrayi_bastir(b);

        // Yukarıdaki kod, "arrayi_bastir" metodunda yazılı olan kodu çağırır ve main metodda
        oluşturduğumuz "b" veri tipini ona atadığımızda "arrayi_bastir(b);" istenileni yapar.

         */

        /*

            -------->   Bir örnekte array içindekileri sayıların ortalamalarını aldıralım :

        int[] b = {10,20,30,40,50,60};

        System.out.println(" ");
        arrayi_bastir(b);
        System.out.println("\nOrtalama : " + ortalamBul(b));

        // Yukarıdaki satırlarda öncelikle b adında bir array oluşturuldu ve buna 6 değer atandı.
            // Sonrasında arrayi_bastir metodu ile tek tek arrayların kaçının kaçıncı olduğunu print ettik.
                // Sonrasında da "ortalamaBul" metodu ile de bu alınan sayıların ortalamasını double cinsinden döndürdük.

         */
        

    }
}
