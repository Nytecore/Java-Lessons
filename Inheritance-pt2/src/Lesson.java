
    /*
    Buradaki derste yer alanlar Inheritance için ekstra detaylar içermektedir.
    Burada öğreneceklerimiz sayesinde daha güvenli kodlar yazabilmiş olacağız.

    Buradaki örnekte bir hayvan sınıfı yarattık ve hayvan sınıfına ait bir alt
    sınıf olarak köpek sınıfını yaratarak. Superclass'dan hayvanlara ait olan
    genel özellikleri (örneğin adı, kilosu, boyu, diş sayısı gibi) Subclass'a
    çektik.

    Superclass (Animal) içerisine herhangi bir hayvan için genel bir durum olarak
    beslenme üzerine "eating" metodu, bir de hareket etme metodu ve metod içinde
    kendi hareket hızını alacağımız hız değişkeni için bir veri tipi oluşturduk.
    Sonrası getter ve setter'lar...

    Subclass (Dog) içerisinde yine diş sayısı alacağımız bir veri tipi oluşturduk.
    (private int n_o_teeth), alt satırında Superclasstan çekeceğimiz özellikler
    için ayriyeten bir constructor oluşturduk ve bu contructor içerisine Superclass
    içerisinden veri çekmek için super (adı , kilosu , boyu) bilgilerini yazdık ve
    Subclass içerisindeki diş sayısı verisini içeren özelliği de eklemek için
    constructor içerisine bir de diş sayısını alacağımız satırı ekledik. Sonrasında
    köpeğin hareketini ve hareket hızını bize yazdırmasını sağlayan bir metod daha
    oluşturduk ve bu metod Superclass içerisindeki metodun aynısı olduğundan override
    edilmiş oldu. Altına da başka bir metod olarak run (koş) adlı bir metod daha
    oluşturarak metod için bir hız değeri atanmasını istedik .....run (int speed)
    Bu metod içerisine bir oluşum ekledik ve bu oluşum kilit noktadır :

    Buradaki fark, "movement(speed)" ve "super.movement(speed)" arasındaki farktır.
    Main classımızda köpek sınıfından bir obje oluşturduk ve bu objeye dog adı
    verdik. İçerisine de almak istediğimiz değerler olan Superclass ve Subclass
    içindeki özellikleri ekledik. Örn. Dog dog = new Dog ("Pasha" , 40 , 35 , 4 , 37);

    ve "dog" objesi ile Dog classındaki "run" metodunu çağırdık. (dog.run(20);)
    Bu metod ne yapar : "The dog is running...." çıktısını verecek ve altındaki kod
    satırında yazılan "movement(speed);" ile "movement" metodunu çağıracak ve değer
    olarak bizim en başta main classı içerisinde vermiş olduğımız speed (hız) değerini
    döndürecek ve bize şöyle bir çıktı verecek :::::::

    The dog is running....
    The dog moves at a "20" speed of km/h.

    KİLİT NOKTA: Dog classı içerisindeki "run" metodunda yer alan kodların farkı --->

    movement(speed);
        The --dog-- moves at a "20" speed of km/h.

    super.movement(speed);
        The --animal-- moves at a "20" speed of km/h.

    ------>>  Burada değişen şeyler yalnızca "dog" ve "animal" ibareleri. Bunun sebebi
    override işlemi için kod satırını oluşturduk fakat override yaptığımızda bize
    Superclass ieçrisinde yer alan kod olan "The --animal-- moves at a "20" speed of km/h."
    çıktısını verecek fakat super kodunu kullanmazsak Subclass içerisinde yazılmış metod
    olan "movement" çağrılacak ve override yaptırmamış olacağız.

    AMAÇ: Subclass içerisine override kodunu yazarak override yapmayıp Superclass içinde
    yer alan "movement" classını korumak. Yok saymamasını sağlayarak sonraki kodlarda
    kullanılmak üzere saklamak, diyebiliriz...

    */
