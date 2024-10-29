public class Main {
    public static void main(String[] args) {
        /*


        try {
            // Exception oluşturabilecek kodlar.
        }


        catch (Exception_Türü e) {
            // Exception durumunda yapılacak işlemler.
        }
         */


        // System.out.println("Kod çalışıyor...");

        //int a = 30 / 0;   // Bu ifade hatayı göstermez. Fakat hatalıdır. Unchecked exceptiondur.
                            // Bu kod RunTime'da bize hata fırlatır.
                            // ArithmeticException hatası alırız.
                            // Javada bir sayı sıfıra bölünemez hata fırlatır.

        // System.out.println("Kod çalışıyor...");

            // Çalışma durumu: Hatanın önceki satırı, çalışır. Hata satırı ve sonraki satırlarda
                // çalışmada sıkıntı olur ve sonraki satırları çalıştırmaz.


        // int[] a = {1,2,3,4,5};
        // System.out.println(a[6]);    // --> Burada java bize hatayı göstermez fakat hata vardır.
                                        // --> ArrayListte 4 index vardır ve biz 6. indexi yazdırmak istedik.
                                        // --> 6 index olmadığı için java (unchecked) runtime'da hata fırlatır.
                                        // --> Hata (ArrayIndexOutOfBoundsException)

        // İşte biz yukarıdaki gibi unchecked exceptionları yakalamak için Try ve Catch bloklarını kullanırız.

        // Try bloğu içerisine exception oluşturabilecek kodlar yazılır.

        try {

            int b = 30 / 0;              // ArithmeticException

            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);    // ArrayIndexOutOfBoundsException


        /* Yukarıdaki gibi 2 farklı exception oluşturabilecek durumlarda yine
        catch blokları kullanılmalıdır. Normalde tek bir catch bloğu tüm
        exceptionları handle eder fakat biz yine de her bir olası exception
        için ayrı ayrı birer catch bloğu yazmamız gerekmektedir. */


        } catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array'ın boyunu aştınız.");

        } catch (Exception e) {
            System.out.println("Bir hata oluştu.");
            e.printStackTrace();

        }

        /* Ayrı ayrı belirlenen hataları özel bir şeykilde bastırmak istersek
        ortak olan catch bloğunu en alta yazmamız gerekiyor yani özelden
        genele doğru ilerlemeliyiz. Yukarıdaki durumdan örnek alacak olursak;
        try bloğunda üstte "int[] a = {1,2,3,4,5}" exceptionu ve onun altında da
        int a = 30 / 0; exceptionu yer alıyor. Buna göre yukarıya ilk önce
        "ArrayIndexOutOfBoundsException" onun altına da "ArithmeticException"
        hatalarını catch içerisine yazmalıyız ve onun da altına yani en alta
        ortak olan exception'u yani direkt olarak "Exception" yazmalıyız.   */

        //--------------------------------------------------------------------------------------------------------------
        /* catch (Exception e) {
            System.out.println("Array içerisinde 6 index yok.");
            e.printStackTrace();
                 catch içerisine .printStackTrace() metodu girildiğinde, exceptionun
                 türünü de bastırır. Exception handling edilmiş olur.
        } */
        //--------------------------------------------------------------------------------------------------------------

        System.out.println("Bu alandaki kod çalışıyor..");

        /* Normalde exception aldığımız satıra kadar olan kodlar çalışır ve Exception.
        aldığımız satır ve sonraki satırlar çalışmazlardı. Fakat bu şekilde.
        try - catch blokları kullanarak yaptığımız işlemde eğer try içerisinde.
        exception var ise catch çalışacağı için oradaki exception handle edilmiş.
        olacaktır ve sonraki satırlar da çalışacaktır.*/


        /* Eğer yukarıda main class içerisinde yazılan kodlarda herhangi bir exception
        ya da hata olmaması durumunda da normal bir şehilde java try ve catch metodlarını
        hiç görmeden direkt olarak onları atlıyor ve kodumuzu alt alta normal bir şekilde
        çalıştırmaya devam ediyor.      */

    }
}
