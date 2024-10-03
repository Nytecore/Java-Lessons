import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        /*
        ArrayList<String> arraylist1 = new ArrayList<String>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();

        Bir classı bu şekilde türden bağımsız kullanırız. Integer
        gönderirsek int, String gönderirsek String şeklinde çalışır.
         */

        Character[] char_dizi = {'J' , 'A' , 'V' , 'A'};
        Integer[] integer_dizi = {1,2,3,4};
        String[] string_dizi = {"Python" , "C++" , "JavaScript" , "C#" , "Kotlin"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Bora"),new Ogrenci("Kaan"),new Ogrenci("Aydın")};


        System.out.println("\n-------------   B İ R İ N C İ   D U R U M   -------------\n");
        System.out.println("************************");
        PrintChar.print(char_dizi);
        System.out.println("************************");
        PrintInteger.print(integer_dizi);
        System.out.println("************************");
        PrintString.print(string_dizi);
        System.out.println("************************");
        PrintOgrenci.print(ogrenci_dizi);
        System.out.println("************************");

        /*
        NOT : Biz burada her bir veri tipinde yer alan dizi için ayriyeten bir
        class yazdık. Her classın içerisinde ayrı bir print (yazdırma) işlemi
        gerçekleştirildi ve onları tek tek main class içerisine çağırdık. İşte
        Generic Classlar oluşumundaki en büyük fark buradadır. Bizim eğer 1000
        tane farklı veri tipinde dizilerimiz de olsa biz sadece bir adet class
        oluşturarak oradaki tüm oluşan dizileri direkt olarak main class içer-
        isine çekebileceğiz. İşte generic classın en büyük avantajı budur.

        PEKİ BUNU NASIL YAPACAĞIZ ???
         */

        PrintClass<Character> print_char = new PrintClass<Character>();
        PrintClass<Integer> print_integer = new PrintClass<Integer>();
        PrintClass<String> print_string = new PrintClass<String>();
        PrintClass<Ogrenci> print_ogrenci = new PrintClass<Ogrenci>();

        // Yukarı tanımlamada da belirtildiği gibi örneğin biz orda PrintClass içerisine
            // Character tipinde gönderdik. O artık character veri tipi gibi davranacak ve
                // print_char referansı ile de çağrım yaparak kullanılacaktır.

        System.out.println("\n-------------   İ K İ N C İ   D U R U M   -------------\n");
        System.out.println("************************");
        print_char.print(char_dizi);
        System.out.println("************************");
        print_integer.print(integer_dizi);
        System.out.println("************************");
        print_string.print(string_dizi);
        System.out.println("************************");
        print_ogrenci.print(ogrenci_dizi);
        System.out.println("************************");

        /*
        İşte Generic Class kullanarak yazdığımız metod, tek class içerisinde ve biz onu
        ne olarak kullanmak istersek o şekilde kullanarak main classa çağırabiliyoruz.
        Eğer bizim 50 tane de farklı veri tipinde objelerimiz olsa, 50 tane class oluş-
        turmak yerine sadece 1 class oluşturacağız ve 50 veri tipindeki objeyi buradaki
        duruma göre yazarak tek classtan direkt olarak main classa çağıracak ve kolayca
        işlemlerimizi tamamlayacağız. İŞTE GENERİC CLASS OLAYI BUDUR.
         */

    }
}
