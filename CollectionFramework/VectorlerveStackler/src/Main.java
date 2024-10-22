import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

            // Vectorler nasıl oluşturulur:
        Vector<String> vector = new Vector<String>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        System.out.println("\n*********************************");
        System.out.println("Vector ----->>>\n");
        for (String s : vector) {
            System.out.println(s);
        }
        System.out.println("*********************************\n");

            // Oluşturulan vectorler üzerinde gezinmek için ArrayListlerde olduğu gibi
                //ListIterator kullanılabilir....
        ListIterator<String> iterator = vector.listIterator();

        System.out.println("*********************************");
        System.out.println("Iterator ----->>>\n");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********************************\n");

            // Aynı zamanda Vectorler üzerinde gezinebilmek için biz bir işlem daha
                // kullanabiliriz, ListIterator gibi bir sınıfımız daha bulunur:
                    // Bu sınıf : "Enumeration" sınıfıdır. Bu sıfını kullanarak da
                        // Vectorler üzerinde gezinme yapabiliriz. Nasıl kullanılır ?:

        Enumeration<String> enumeration = vector.elements();
            // Vector'un elementleri burada enumeration adlı bir classa atamış oluruz.

        System.out.println("*********************************");
        System.out.println("Enumeration sınıfının kullanılışı ----->>>\n");

        while (enumeration.hasMoreElements()) { //---> Gezinebilecek / gidilebilecek başka element var mı?
            System.out.println(enumeration.nextElement());
        }
        System.out.println("*********************************\n");

        System.out.println("*********************************");
        System.out.println("Vektör içindeki ilk eleman : " + vector.firstElement());
        System.out.println("Vektör içindeki son eleman : " + vector.lastElement());
        System.out.println("*********************************\n");

            // Vector içindeki ilk ve son elemente ulaşmak mümkündür. Bunun için
                // .firstElement() ---> İlk elemana ulaştırır.
                    // .lastElement() ---> Son elemana ulaştırır.


            //                      -------- STACKLER ---------

        Stack<String> stack = new Stack<String>();

        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Kotlin");
        stack.push("C++");
        stack.push("C#");
        stack.push("Go");

                // .push() metodu, stacklerde eleman ekleme görevi görür. .add()' de kullanılabilir
                    // fakat stacklerde genellikle push kullanılır.

        System.out.println("*********************************");
        System.out.println("Stacklerin bastırılması :");

        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println("*********************************\n");

            // Stack üzerinde enumeration ile de gezinebiliriz.

        Enumeration<String> eStack = stack.elements();

        System.out.println("*********************************");
        System.out.println("Stack --> Enumeration kullanımı : \n");
        while (eStack.hasMoreElements()) {
            System.out.println(eStack.nextElement());
        }
        System.out.println("*********************************\n");

        System.out.println("*********************************");
            // Stack içerisindeki son girilen elemamı almak içi .peek() metodu kullanılır.
        System.out.println("Stack son elemanı : " + stack.peek()); // --> "Go" elementi son giren elementtir.
        System.out.println("*********************************\n");

        System.out.println("*********************************");
            // Stack içine giren son elemanın çıkarılması için .pop() metodu
                // kullanılır. Bu kullanım sonrası son giren eleman çıkarılır
                    // ve çıkarılan son elemanın değeri return ile döndürülür. (bastırılır.)

        System.out.println("Son giren eleman çıkarılıyor : " + stack.pop() + "\n");

        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println("*********************************\n");

            // Stack içerisinin boş ya da dolu olduğunu kontrol eden bir metod vardır.
                // Bu metod .empty() şeklinde yazılır. Boş ise true, dolu ise false döner.

        System.out.println("*********************************");
        System.out.println("Stack boş mu? : " + stack.empty() + " (boş değil)");
        System.out.println("*********************************\n");


            // Stackler içerisinde şöyle bir işlem daha yapaılım:
                // While döngüsü ile dolu olup olmadığını kontrol edelim
                    // Döngü devam ettiği sürece, stack sınıfı içerisindeki
                        // son girilen değerler tek tek çıkarılsın...

        System.out.println("*********************************");
        System.out.println("Stack elemanlarının while döngü \n" +
                "ile çıkarılması:\n");

        while (!stack.empty()) {
            System.out.println("Eleman çıkarılıyor: " + stack.pop());
        }
        System.out.println("*********************************\n");


        // Yukarıdaki döngü, stack içerisindeki değerleri tek tek silene kadar
            // döngü devam eder ve stack içerisindeki elemanları tek tek çıkararak
                // çıkarılan her elemanı return ile döndürür ve ekrana bastırır.
                    // stack içerisinde eleman kalmayınca, döngü false durumuna girer
                        // ve döngü durur. Çıkarılma işlemi tek tek son eklenen elemandan
                            // ilk eklenen elemana göre sırayla yapılır. ----->  L.I.F.O.

            // biz en sonda tekrar stack.pop() metodu ile stack'in bir elemanı yokken
                // son elemanı çıkarmak istediğimizi belirtir bir işlem girersek java
                    // hata verir. Çünkü stack içi artık boştur. Bu hata şudur:
                        // Exception in thread "main" java.util.EmptyStackException

    }
}