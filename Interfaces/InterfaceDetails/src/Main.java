public class Main {

    // (1) Normalde, interface konularında biz Interface'lere her hangi bir özellik eklenemediğinden bahsetmiştik.
        // (2) Aslında eklenebilir. Burada o detayı göreceğiz...

    public static void main(String[] args) {

        System.out.println("Int = a kullanımı " + IDeneme.a);

        /* (5) --> Bu şekilde bir kulanım ile biz interface içerisindeki
        özelliğe getter-setter olmadan ve "static" kulanmadan direkt eriştik.
        Burada java, interface'den bir obje oluşmayacağını ve getter setter
        kullanımının mümkün olmadığını bildiği için, bizim bu şekilde direkt
        olarak interface adını, obje oluşturmadan ve static kullanmadan erişmemize
        izin verir. Orada oluşturulan özellik public değil de private olarak
        oluşturulmuş olsaydı -demeyeceğiz- çünkü orada private şeklinde bir
        özellik oluşumu mümkün değildir. Çünkü private olarak oluşturulan bir
        özelliğe erişmek için mutlaka obje oluşturmak gereklidir. Yani ya bir
        metoda ya da bir constructor'a ihtiyaç duyar.   */


        System.out.println("String kullanımı : " + IDeneme.b);

        System.out.println("Final kullanımı : " + IDeneme.c);

        IDeneme.deneme();       // Burası interface içinde oluşturulan metottur.



    }
}
