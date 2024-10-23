import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        // ArrayList<String> arrayList = new ArrayList<String>();

        List<String> list = new ArrayList<String>();

        // Eleman Ekleme --
        list.add("Java");               //--> 0. Index
        list.add("Python");             //--> 1. Index
        list.add("C++");                //--> 2. Index

        // Elemana Erişme (Index üzerinden)
        System.out.println("******************");
        System.out.println("Index ile erişme : ");

        System.out.println(list.get(0));        //--> 0. Indexi getir (J ava)
        System.out.println(list.get(2));        //--> 2. Indexi getir (C++)
        // System.out.println(list.get(4));     //--> IndexOutOfBoundsException HATASI verir. 4. Index yok.

        // Listeyi for döngüü ile bastırmak:
        System.out.println("******************");
        System.out.println("for döngüsü ile bastırmak :  ");

        for ( int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        // Listeyi forEach döngüsü ile bastırmak:
        System.out.println("******************");
        System.out.println("forEach döngüsü ile bastırmak : ");

        for (String s : list) {
            System.out.println(s);
        }


        // Eleman silme:
        System.out.println("******************");
        System.out.println("Listeden eleman silmek : ");

        list.remove(1);    //---> 1. indexdeki değeri siler
        list.remove("Java");  //---> "Java" değeri verilen indeksi siler.
        for (String s : list) {
            System.out.println(s);
        }


    }
}
