public class Lesson {

    public static int ikiilecarp ( int a){
        return a * 2;
    }
    public static int ikiiletopla (int a){
        return a + 2;
    }
    public static int dortilecarp (int a){
        return a * 4;
    }
    public static void main(String[] args) {
        // işlem şu şekilde : dortilecarp(ikiiletopla(ikiilecarp(8)));
        /*
        ikiilecarp(8); = 16
        ikiiletopla(16); = 18       // Sırasıyla yandaki işlemler yapılacak.
        dortilecarp(18) = 72        // Bunun kusa hali : dortilecarp(ikiiletopla(ikiilecarp(8)))
        Yine de işlem sonucunu görmek için yazdırma komutu kullanmalıyız.
        */
        System.out.println("İşlem Sonucu : " + dortilecarp(ikiiletopla(ikiilecarp(8))));
    }

    /*
    Return, oluşturulkan fonksiyonları main fonksiyonda çağırıp tekrar
    döndürme işlemi denebilir. "sout"a benzerdir fakat başka bir yere
    gidip orda döndürülebilir bir komut üstlenmektedir. Yani biz farklı
    bir metodda (fonksiyonda) işlem yaptırıp metodu çağırmak yerine meto-
    dun sonucunu çağırıp kullanabiliriz ya da orda başka bir değer ya da
    işlem ile döndürebiliriz. Hatta birden fazla metodlar oluşturarak
    metodlar içerisinde yaptırdığımız işlemleri her birini birbirine gön-
    derip en son döndürülen değeri main metoda alabilir bu sayede metodlar
    arası karışma yaşanmaz ve return çok önemli bir komuttur.
    --> Aynı zamanda return komutu, bir bakıma döngülerdeki "break" komutu
    ile benzerlik gösterir diyebiliriz. Çünkü return komutu kendinden sonra
    yer alan kod satırını programa okutmaz. Return olan yerde kodlama biter.
    Sonrası görünmez ve sonrasına eklenenler çalışmaz. Durdurur.
    --> Önemli bir konu daha vardır. "void" methodu dışarıya return komutunu
    göndermez. Void yerine dışarıya göndereceğimiz işlemi yapacağımız dönüş
    tipi yazılmak zourundadır. Hani şöyle yazarız normalde "public static
    void 'deneme'" bahsi geçen void buradaki void. Bunun yerine örneğin tamsayı
    işlemini başka bir yerde return ile döndürmek istiyorsak "int" kullanmak
    zorundayızdır. Yani "public static int 'deneme'"
    --> Yukarıda bununla alakalı bir örnek yapılmıştır. Bu örnekte 3 adet metod
    yaratılmıştır. Bunlardan birinde iki ile çarpma yaptırdık, diğerinde iki
    ile toplama yaptırdık, bir diğerinde de dört ile çarpma yaptırdık ve her
    bir sonucu return değeri ile blok içerisinde döndürdük.
    --> Main kod bloğunda da "dortilecarp(ikiiletopla(ikiilecarp(8)))" her bir
    işlemi birbirleri içerisinde döndürerek yazdırma işlemini yaptık. 8 olarak
    belirlenen sayımız önce iki ile çarpıldı (16) sonra iki ile toplandı (18)
    sonra da dört ile çarpıldı (72) ve bize sonuç aldı. Biz de onu, main metotta
    yazdırma komutu ile kullanarak program çalıştırıldığında sonucu göster dedik:
    System.out.println("İşlem Sonucu : " + dortilecarp(ikiiletopla(ikiilecarp(8))));
    ÇIKTI: İşlem Sonucu : 72 /////
     */
}