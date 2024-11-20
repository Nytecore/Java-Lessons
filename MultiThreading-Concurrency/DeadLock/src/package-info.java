


        /* Bir çok thread birbirlerini bekler ve hiç bir yere ilerleme olmaz.
        Yani bir çok thread belirli bir lock'u alır, ancak diğer locklar da
        da locku alıp katıldı için deadlock olayımız ortaya çıkar ve alttaki
        işlemler hiç bir şekilde gerçekleşmezler.

        Bir kavşak düşünelim. Bu kavşakta pek çok araç olsun ve araçlardan
        birisi kavşağın içine girerek yolu tıkamış olsun. Bu sebeple diğer araç
        ların hepsi kavşakta kilitlenip kalacak. Öndeki aracın geri gitmesi için
        onun da gerisindekinin ve onun da gerisindekinin geri gitmesi gereksin.
        Ancak hiç bir şekilde kavşak içindeki araba hiç bir yere kıpırdayamaz.
        İşte bu duruma gerçek hayattaki DeadLock örneğidir.

        Threadlerde de bu durum; örneğin bizim thread1 ve thread2 şeklinde 2 adet
        thread'ımız var ve bizim uygulamamızda 2 anahtar bulunuyor diyelim. Bu
        threadlerin işlemlerini gerçekleştirebilmeleri için iki anahtara da aynı
        anda sahip olmaları gerekiyor. Ancak öyle bir durum olabilir ki thread1
        direk gidip 1. anahtarı alır ve thread 2 de de 2. anahtar varsa bu ikisi
        biebirlerinden anahtar bekler fakat ikisi de anahtarı bırakamadığı için
        işte burada DeadLock oluştururlar ve kilitlenip kalırlar.

        Bu DeadLock'larım oluşabileceği bir genel an ya da sürekli oluşabileceği
        bir durum olmadığından, rastgele olarak çalışma esnasında %1 denkgelen
        bir durum olduğu için hem öngörülemezdir hem de bu durumdan dolayı bu
        konu yani DeadLock'lar çok bela bir durum olur. Programın kilitleneceğini
        öngörmek büyük projelerde oldukça zordur. Peki bu DeadLock'lar
        ReentrantLock'lar ile nasıl çözülür ona bakacağız...    --->         */