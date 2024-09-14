/*


         *************  /////  ------- ANLATIM ------  \\\\\\  **************


Yukarıda olduğu gibi birden çok class sekmesi yaratılmak yerine bir main class içerisinde
birden fazla class oluşturulabilmektedir. Bunu yapmak için main classta olduğu gibi yazmak
yerine (public class *classAdı* yerine) public yazmadan sadece class ve adını koyarak tek
bir class içerisinde birden fazla class oluşturulabilir. Örn. "class Kedi { }"

İlk önce bir superclass yaratıldı (Hayvan) içerisine bir özellik eklendi "private string isim;"
sonrasında superclass için bir constructor - getter ve setter oluşturuldu. Daha sonra superclass
içerisine bir metod oluşturuldu. (public String konus) Bu metod çağrıldığında "Hayvan konuşuyor"
çıktısı bize verilecektir. (return "Hayvan konuşuyor...") Bu metodu ilerde override edeceğiz..

Sonrasında da subclasslar oluşturuldu. (class Kopek , class Kedi , class At) bu classlara da yine
constructor eklendi ve subclasslar içerisine yukarıda bahsedilen "public String konus" metodu
subclasslar içerisinde (kedi, kopek, at) override edildi. Her subclass için farklı bir durum
çıktısı alınacaktır. Örneğin kedi subclassı için bir çıktı alınması istenirse override şu şekilde
yapıldı: Yani burada override edilen method çağrıldığında kediye verilen isim ve "miyavlıyor"
çıktısı gelecek.

            public String konus() {                         // Override
        return this.getIsim() +" miyavlıyor...";

Main method içerisinde : İşte tam olarak burada Polymorphism devreye girecek. Bu ne demek? :
Normalde bu kodlama satırları için bir main objesi yaratılmak istendiğinde şu yapılmalıydı:
(Hayvan hayvan1 = new Hayvan) Superclass içinden biz "hayvan1" adında obje yaratmış oluyoruz.

Fakat Polymorphism'de şunu yapabiliriz: (Hayvan hayvan1 = new Kedi) Burada şöyle bir şey yapmış
oluyoruz: "hayvan1" adında Hayvan superclassından bir obje oluşturduk fakat bu objeden de "Kedi"
classında gibi davranmasını istedik. Yani, Hayvan hayvan1 = new Kedi ("Tekir"); bu kodlamada
öncelikle Hayvan superclassına gidilecek ve orada "hayvan1" adında bir obje alınacak sonra
Hayvan superclassı içerisindeki özellik (String isim) constructor sayesinde getter ve setter
yapılmıştı bu sayede de başka classlar içerisinden buradaki özelliklere erişebiliyorduk.
Burada da Kediden sonra yazılan "Tekir" değeri, "this.getIsım()" kodu sayesinde getter'lanarak
Superclass içerisindeki "String isim" özelliğine eşitlenecek ve çıktı alırken bu yazılan isim
yani orada yer alan (new Kedi ("Tekir") Tekir ismi this.getIsım() sayesinde superclassa yapışacak
ve istendiğinde oraya yazılan isim çıktı olarak karşımıza çıkması sağlanacaktır.

Sonrasında biz Hayvan objesinin kedi gibi davranmasını istediğimiz için kedi classı içerisine
gidilecek ve oradaa Override edilen satır çalıştırılacak. "this.getIsim() +" miyavlıyor...";"
bu kod sayesinde kediye girilen isim this.getIsim() satırının yerini alacak ve sonrasonda da,
"miyavlıyor..." yazısı yazdırılacaktır. Bunu aynı şekilde diğer subclasslara da yaptık yani
köpek ve at şeklinde subclasslar oluşturuldu ve yine getter ve overriding sayesinde o classa
gidilmesi durumunda oradaki kodların çalışmasını sağlattık ve ona göre çıktılar verdik. Fakat
tabi ki bu çıktıları verebilmek için yine main class içerisine verdiğimiz değerlerin çıktısını
alıp görebileceğimiz yapıcı komutları da vermemiz gerekmektedir. Yani obje oluşturup değerler
verildikten sonra "System.out.println(hayvan1.konus());" bu kod sayesinde hayvan1 objesinin
özelliklerine göre "konus" adlı metodu çağırmış oluruz. Eğer "hayvan1" olarak belirtilen "Kedi"
classında "konus" adlı metod yoksa bu sefer de superclass'a giderek oradaki konus adlı metodu
çıktı ekranına çağırır. Yani subclassta override edilmemiş ise bir metod, o zaman superclassa
giderek oradaki ismi verilen metodu çalıştırır.

Polymorphism daha kısaca bir objenin birden farklı obje olarak kullanılabilmesidir. Ancak bunun
için Inheritance gibi bir yapının olması gerekiyor. Inheritance yerine burada Composition yapısı
kullanımı polymorphism yapısına uymaz.

İşta tam olarak Polymorphism budur. Mainde oluşturulan objenin subclasslar gibi davranması
durumuna yani buradaki Hayvan referansı bir kedi - köpek - at gibi davrandı. Bu durum şu şekilde
daha da kısaltılarak da yapılabilmektedir. Örneğin main class içerisine yukarıda olduğu gibi bir
"konustur" adında main metoda benzeyen bir metod oluşturulur. Burada metodun adı "konustur" olarak
belirlenmiştir. Parantez içine Hayvan superclassından, hayvan referansı ile ibaresi eklenmiştir.
 Yani: public static void konustur (Hayvan hayvan) { ... } metod içerisine de yapmasını istediğimiz
komutlar yazılır (System.out.println(hayvan.konus());) Buradaki komutta, "hayvan.konus()" çıktısının
alınmasını istediğimizi belirtiyoruz. Sonrasında da main metodda bu sefer de çıktı almak istediğimiz
kod şu şekilde yazılır.:

        konustur.(new Kedi ("Tekir"));

Burada "konustur" az önce bahsedilen main metodun üstüne açılan metoddur. "konustur" komutu ile yukarıda
yazılan "hayvan.konus()" komutu çağırılır ve "new Kedi" komutu burada "hayvan" adlı referansın yerini tutar.
yani aslında komut şu şekilde evrilir; "Kedi.konus()" sonrasında parantez içine yukarıda belirtilen
özellikte olduğu gibi "isim" yazılır ve yazılan isim ile referansı girilen hayvanın istenilen şekilde
önce ismi yazdırılır sonra da konuşturulması amaçlanır. Örneğin :

        konustur(new Kedi ("Tekir")); ---> hayvan.konus() ---> Kedi.konus() ----> Kedi.konus("Tekir") ===
                Çıktı: "Tekir, miyavlıyor..."

 */


/*

            ****** ÖNEMLİ ******

Biz bir objenin hangi classtan olduğunu anlamak için bir tane anahtar kelime kullanabiliriz ve bu anahtar
kelimeyi kullanarak da true ya da false değer elde edebiliriz. Bu anahtar kelimenin adı "Instance Of" tur.
Şu şekilde kullanılır: "instanceof" Biz bu instanceof anahtar kelimesine bir tane obje veririz ve bu
objenin hangi classtan olduğunu anlamaya çalışırız. Ya da, örneğin biz bir obje verdik ve dedik ki mesela
bu obje, "Kedi" classı içinde ise "miyavlıyor" şeklinde çıktı ver fakat değilse hiç bir şey yazdırma ya da
istenilen, girilen komut da yazdırılabilir..

Mesela bir obje yaratılmış olsun...

        Kopek kopek = new Kopek ("Karabaş");

Sonrasında da biz bu objenin kontrolünü şu şekilde yapalım: ( "kopek" ; "Kopek" classından mı? )

        if ( kopek instanceof Kopek ) {
                System.out.println("'kopek' objesi 'Kopek' sınıfındandır...);

Burada olduğu gibi kontrolünü yaptırttık ve koşul sağlandığı taktirde True değer dönecek ve istenen
çıktı bize verilecektir. İstenen koşul kopek, Kopek sınıfından olduğu için değer true döner ve istenen
çıktı alınır : 'kopek' objesi 'Kopek' sınıfındandır.

                ----------  YA DA ŞU ŞEKİLDE BİR OLUŞUM DA MÜMKÜNDÜR  ------------

Kontrol işlemi bu proje içerisinde yapılacaktır. Bu projede de ne yapılmıştı hatırlayalım : bir Hayvan
superclassı oluşturuldu ve ona bağlı subclasslar oluşturulmuştu. ( Kedi , Kopek , At ). Biz kontrolü
bu sefer şu şekilde yaparsak ne olur ??

        if ( kopek instanceof Hayvan ) {
                System.out.println("'kopek' objesi 'Hayvan' sınıfındandır.");

Burada sorgulanan şudur, "kopek" sınıfı "Hayvan" sınıfından mıdır?, değer true dönerse verilen komut
çalışacaktır. Burada koşul sağlanır çünkü bizim sorgulamamız true döner. Bunun sebebi "kopek" aslında bir
"Kopek" classındandır fakat, "Kopek" classı da inheritance ile "Hayvan" classından türetilmiş olduğundan
(class Kopek extends Hayvan { .... } ) değer yine true döner ve koşul sağlanır. İstenen çıktı gelir:

        'kopek' objesi 'Hayvan' sınıfındandır.


            ----------   ÖNEMLİ NOT   ----------

Aslında bizim Javadaki yazdığımız tüm classlarımız, java içerisindeki hazır bulunan "object" isimli bir
classtan türerler.Yani biz herhangi bir inheritance işlemi yapmasak bile java burda otomatik olarak bir
"object" classından bu classı türetir. Bu Java içerisinde belirli bir mekanizmadır ve biz bu object metodu
içerisinden aslında belirli metodlar alabiliriz ve bunu direkt olarak kullanabiliriz.

                           [ OBJECT ]
                               |
                               |
                               |
                             HAYVAN
                          /    |    \
                         /     |     \
                        /      |      \
                      KEDİ   KÖPEK    AT

Yukarıdaki çizimdeki gibi biz normalde "Hayvan" sınıfından 3 alt sınıf türetmiştik. Ancak biz farketmesek
bile buradaki "Kedi" - "Kopek" - "At" aynı zamanda "Hayvan" bile, object sınıfından türemektedirler ve biz
burdaki metotlarımızı ve özelliklerimizi direkt olarak alabiliyoruz. Bu projemizde de yine instanceof
anahtar kelimesi ile bu sefer de Subclasslar ve Superclass'ın object classından türetildiğinin sorgusunu
yaptırttık. Biz bu şekilde kodlamasak da, arka planda Javadaki tüm classlar Object classından inheritance
edildiği için koşul sağlanmış oldu ve belirlediğimiz çıktıyı alabilmiş olduk.

Object class ---> Hayvan (Superclass) ---> Kedi - Kopek - At (Subclass)


 */