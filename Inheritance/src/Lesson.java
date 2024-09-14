
        //Is - a ilişkisi diyebiliriz.

        /*

        Inheritance aslında bir classın başka bir classtan
        özellikleri ve metodları miras almasıdır diyebiliriz.
        Örneğin bir şirketin çalışanları projesini yapıyoruz,
        bu projede manager , worker gibi sınıflar olacaktır.
        Bu sınıfların özellikleri genellikle birbirleri ile
        ortak olur. Biz bu benzer metod ve özellikleri tekrar
        tekrar tanımlamak yerine bir ana class oluşturup bu
        özellik ve metodları başka classlardan çağrılmasını
        sağlayabiliriz. İşte buna 'inheritance' denir.

        Is - a ilişkisi: Örneğin bir çalışanlar projesinde biz
        bir yöetici sınıfı oluşturacağız fakat yönetici de
        aslında bir çalışandır. Yani "Manager IS A employee."
        gibi düşünülebilir. Burada Is - a ilişkisi vardır
        diyebiliriz.

        Projede özellikleri ve metodları miras verecek olan
        yani Inheritance yapacak olan classa "Superclass" veya
        "BaseClass" diye isimler verilebilir. Örneğin bu projede
        bizim "Employee" yani çalışanlar sınıfımıza "Superclass"
        ya da "BaseClass" diyebiliriz. Bu class çalışanlar sınıfı
        olacak ve açmış olduğumuz "Manager" sınıfı da bir çalışan
        olacağı için, "Employee" sınıfından özellik alacaktır..

        Yine projede miras alacak olan alt classlara da "Subclass"
        denilebilir. Yani örneğin bu projeden düşünürsek "Manager"
        classı, "Employee" classından özellik ve metod alacağı
        için, "Manager" bir alt class yani "Subclass" denebilir.

        OVERRIDING KAVRAMI: Overriding, kısaca bir classta oluşturulan
        metodun aynısını başka bir classta oluşturarak üzerine bindirme
        yaptırma durumudur. Yaptırılan bindirilme sonucu iki metot da
        aynı olduğundan main classta o metodun çağrılmasını durumunda
        çağrı en son oluşturulan classtaki metoda yapılır. Ondan önceki
        classta oluşturulan metod yok sayılır, görülmez.

        Örnek: Bu projede bir superclass ve bir subclass var. Superclass
        içerisinde bir bilgileri göster metodu oluşturuldu. Bu metod:
        (showInformation) metodu. Bu metod, bizim o metod içerisinde
        yazdığımız kodları baz alarak class içinde oluşturduğumuz
        özellikleri yazdırma ekranında göstermemizi sağlar. Mesela
        Superclassta biz Employee için özellikler oluşturmuştuk. Bunlar
        isim, maaş ve departman. Sonrasında biz subclassta (manager)
        yönetici için ayrıca ekstra özellikler verdik. Main sınıfta
        göstermek istediğimizde yine showInformation metoduna çağrı
        yapacağız fakat son girilen özelliğin de görülmesi için biz
        bu metodu overriding yaparız. Subclass'a da aynı isimde bir
        metod oluştururuz. Aynı isimde oluşturulan metoda ekstra olarak
        eklediğimiz ve görmek istediğimiz özelliğin olduğu kodu yazarız.
        Sonrasında da tekrar superclass içinde yer alanları da görmek
        için superclassta göstermek istediğimiz özelliklere getter ve
        setter ekleyerek bunu subclass içinde oluşturduğumuz overriding
        metodun içine get komutu ile çağırırız.

        Superclassta "String isim" , "int maas" , "String departman"
        şeklinde belirlediğimiz özellikler; Superclass içerinde yer
        alan metodda şu şekilde istenir  --------->

        System.out.println("Yönetici adı : " + isim);
        System.out.println("Aldığı maaş : " + maas)
        System.out.println("Departman : " + departman)

        Subclass içinde girilen "int sorumlu_kisi" özelliği;
        System.out.println("Sorumlu kişi sayısı : " + sorumlu_kisi)
        şeklinde gösterilir fakat subclassta overriding yapıldığı için
        ekstra olarak aynı metoda şu kod satırları da eklenmelidir:

        System.out.println("Yönetici adı : " + getName());
        System.out.println("Aldığı maaş: " + getMaas());
        System.out.println("Departmanı : " + getDepartman());

        --------> Buradaki getter komutları, bu değerlerin superclasstan
        çağrıldığını bize ifade eder.

        *** Unutulmaması gereken bir şey vardır: Overriding yapan metod,
        Overriding yapılan metodu sildirir ve görmezden geldirir!! ***


        ----> ANCAK Overriding yapmanın getter yapmaktan başka bir yolu daha var.
        Bunun için şu da yapılabilir: Superclassta oluşturulan constructor'ı
        Subclassta çağırırken kullandığımız super (name , wage , department)
        kodu gibi Superclass içinde override yapmak istediğimiz class, override
        yapılacak olan Subclassa "super.showInformation();" kodu ile çağırılabilir
        Bu çağrı yukarıda getter ile verilen örneklerin hepsini gerçekleştirir.
        Yani o classta yer alan her şeyi olduğu gibi çağırır. Sonrasında sadece
        Subclass içerisine eklediğimiz ekstra özelliği override edilen metotta
        göstermek için gereken kodu yazarız.

        Örnek:
        super.showInformation();
        System.out.println("Number of people responsible : " + sorumlu_kisi)

        Önemli bilgi : Çağırı işlemi çağrılan yani overriding yapılan metodu
        silmez ya da yok saymaz. Olduğu gibi çağırarak kullanır.
         */