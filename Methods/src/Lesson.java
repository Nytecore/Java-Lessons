public class Lesson {
    public static void selamlama (){
        System.out.println("Selamlar, merhabalar...");
    }
    public static void isim (String soyisim){
        System.out.println("Bora " + soyisim);
    }
    public static void toplama(int birinci_sayi, int ikinci_sayi, int ucuncu_sayi){
        System.out.println("Sayıların toplamı : " + (birinci_sayi + ikinci_sayi + ucuncu_sayi));
    }
    public static void main(String[] args) {

        selamlama();
        isim("Example");
        toplama(16,38,85);

        /*
        Normalde yukarıda görünen metod yani "public static void main(String[] args)"
        yerine başka metodlar da girilebilmektedir. public yerine private, protected(opsiyonel)
        gib.. Bu şu şekildedir;

        Erişim Belirleyici : (public / static / protected...)
        Ekstra Özellikler : (static)
        Dönüş Tipi : (void)
        Fonksiyon Adı: (main, deneme vs.. gibi her hangi bir isim)

        --> Sonrasında method altındaki bloğa işlemler yapılır, tamamlandıktan sonra ana bloğa
        geçilir. Ana blokta burada yaptığımız işlemi tekrar yapmamıza gerek kalmaz onun yerine
        buradaki metodu direkt olarak oraya çağırırız. Buna "Fonksiyon Çağrısı" denir.
        --> Metod = fonksiyon demektir. Bir örnek yapalım; Yukarıda selamlama adında boş bir
        metod açıldı. İçerisine "Selamlar, merhabalar" yazıldı. Biz main methoddan burayı çağırmak
        için yukarıda olduğu gibi sadece şunu yazabiliriz: "selamlama();" bunu yazdığımızda,
        selamlama metodu içinde yazılmış olan "System.out.println("Selamlar, merhabalar...");"
        direkt olarak main metoda geçecektir. Uzun soluklu kodlamalarda bu çok sık kullanılır.
        Örneğin; faktöriyel alma kodu tek tek sürekli yazılacağına "faktoriyel" adında bir metod
        açılır ve o metod gerektikçe main metoda çağrılır..
        --> Metodlar parametreler yani değerler de alabilir. Bu değerler int, double, float, String
        ne gerektiriyorsa yazılmalıdır. (Java dilinde böyle) Main method içerisinde, isimlendirilen
        metod çağırılmak istendiğinde parametresine örneğin "String isim" yazılmış ise, çağırı
        esnasında parametre alanına yazılan her isim, o parametreye atanarak çağırım yapılacaktır.
        Örneğin yukarıda "isim" adında bir metod açıldı, prantez içinde görünen parametre alanına da
        "String soyisim" gibi bir değer ataması yapıldı. ALtına "Bora" yazacağı bir yazdırma komutu
        eklendi. main metoddan çağrılan bu işlem, maine "isim ("soyisim");" şeklinde kodlanarak
        soyisim yerine yazacağımız değer, parametre alanına ataması yapılacak ve bize çıktı alındığında
        o şekilde bir sonuç verecektir. Örnek yukarıda kod olarak yazılmıştır. Yine int değişkenli bir
        örnek de yapıldı. Prensip aynı.
         */
    }
}