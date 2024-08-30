public class Lesson {

   /*
   public static void toplama (String a, String b) {
        System.out.println(a + " " + b);
    }
    public static void toplama (int a, int b, int c) {
        System.out.println("Toplamları : " + (a+b+c));
    }
    public static void toplama (int a, int b) {
        System.out.println("Toplamları : " + (a+b));
    }

    public static void main(String[] args) {
        toplama(3,4,5);
        toplama(2,5);
        toplama("Bora","Yıldırım");
        */

        /*
        Burada overloading, bir fonksiyonu aşırı yüklemek anlamında kullanılıyor.
        Aslında yapılan şu, normalde bir fonksiyon oluşturup o fonksiyonda 2 adet
        int değişkenli değer tanımlaması yapıp main metotta onu çağırıp kullanırken
        2 değişken değeri (Örn. int a , int b) oluşturulduğu için maks 2 adet değer
        ataması yapabiliyoruz. Fakat overloading (aşırı yükleme) durumunda bu durum
        biraz değişebiliyor. Bu da şu şekilde; örneğin bir metod oluşturduk ve adı
        toplama oldu ve 2 değişken atandı. (public static void toplama(int a, int b))
        Ayrıca 3 değişkenli yine aynı isimden bir metod oluşturulmak mümkündür.
        Örnek: (public static void toplama (int a, int b, int c) hatta birden fazla
        "toplama" adında metot (fonksiyon) da oluşturulmak mümkündür. Yani bir de
        bunun yanında String değişkenli oluşturacak olursak yine aynı isimle bu
        mümkün. (public static void toplama (String a, String b) Bu üç metodu aynı
        isim ile main metodda çağırarak istediğimiz değerleri atayıp kullanabiliriz.
        İşte tam olarak bu duruma overloading denmektedir.
         */

    public static void skorhesapla (String isim, int puan){
        System.out.println(isim + " Adlı oyuncunun " + puan + " puanı var.");
    }
    public static void skorhesapla (int puan) {
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }
    public static void skorhesapla (String isim) {
        System.out.println(isim + " Adlı oyuncunun hiç puanı yok.");
    }

    public static void main(String[] args) {

        skorhesapla("Bora", 80);
        skorhesapla(70);
        skorhesapla("Ayşe");
        skorhesapla("Bahar",90);

        /*
        Yukarıda örnekte olduğu gibi, method overloading işlemi şu şekilde de yapılabilir;
        Mesela bir yarışma programı var, burada biz "skorhesapla" adında bir method oluş-
        turuyoruz ve bu methoda bir int bir de String değişken ataması yapıyoruz. "String
        isim" oyuncunun ismi ve "int puan" oyuncunun puanını verecek. Sadece sayı yani puan
        girilirse isimsiz bir oyuncunun puanını istemiş olacağız, sadece isim girilirse de
        ismi girilen oyuncunun hiç puanının olmadığını söylemiş olacağız. Hem ismi hem de
        puanı girersek de oyuncunun hem puanı hem de ismini yazdırmış olacağız. Dikkat edi-
        lir ise burada verilen method isimleri hep aynı (skorhesapla) sadece istediğimiz iş-
        lemler farklı. İşte bu durum "OVERLOADING METHOD" olarak geçer..
        */

    }

}