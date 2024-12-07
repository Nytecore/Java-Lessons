import java.sql.*;

public class Baglanti {

    private String kullanici_adi = "root";
    // -1- Kullanıcı adını default "root" olduğundan root yaparız.

    private String parola = "";
    // -1- Parola da default boş olduğundan boş bırakıldı.

    private String db_ismi = "demo";
    // -1- Hangi veritabanına bağlanmak isteediğimizi söylememiz gerekiyor.
    // -1- Yani databate'imizin hangi sunucuda olduğunu söylememiz gerkiyor.

    private String host = "localhost";
    // -1- Eğer uzak bir sunucu ise o sunucunun direkt adresini vermemiz gerkeirdi.
    // -1- Ancak bizimki şu anda yerel bir sucunu olduğuna göre buraya localhost vermemiz gerkir.

    private int port = 3306;
    // -1- Eğer MySql veritabanı belirli bir portta çalışıyor ise bizim o port numarasını buraya
    // -1- vermemiz gerekmektedir. Bizim MySqL 'imiz "3306" portta çaıştığı için bunu söylememiz gerekir.

    private Connection con = null;
    // -1- Sonrasında da bizim connection şeklinde Connection classından obje üretmemiz gerekiyor.
    // -1- Bu obje üzerinden veritabanı bağlantımızı gerçekleştireceğiz. En başta null olarak başlattık.
    // -1- Daha sonra bir constructor içerisinde bu connection 'u sağlamaya çalışacağız.

    private Statement statement = null;
    // -2- Veritabanında işlem yapmak için bir "Statement" oluşturmak gerekmektedir.
    // -2- Direk SQL sorgularını çalıştırmak için gerekli olan classımızdır.
    // -2- Bunun içindeki metodları kullanarak SQL sorgularımızı çalıştırıyoruz.

    private PreparedStatement preparedStatement = null;
    // -6- preparedStatement için burada referans oluşturuldu.



    public void preparedCalisanlariGetir(int id) {
        // -6- Normalde çalışanları eklerken adı soyadı ve emaili alıp çok karmaşık bir sorgu yapıyorduk.
        // -6- Ancak bu sorgu çok karşılık ve yazmak çok zor ve çoğu zaman bu sorguyu yazarken belirli
        // -6- SQL Syntax hatası alabiliriz. Biz bu kadar karmaşık şekilde yazmak yerine biz bunu
        // -6- preparedStatement sayesinde bu işlemi daha güzel bir şekilde yazabiliriz.

        String sorgu = "Select * From calisanlar where id = ?";
        // -6- Sorguyu oluşturduk ve buradaki "?" şu anlama gelir; Biz preparedStatement oluşturacağız ve
        // -6- bu "?" yerine hangi değeri eklemek istediğimizi direkt olarak söyleriz. Yani biz örneğin
        // -6- çağırma işlemi de yaparken buraya 3 yazmıyoruz da sonradan kaç değer çağıracaksak onu
        // -6- direkt olarak içerisine gönderiyoruz.

        try {
            preparedStatement = con.prepareStatement(sorgu);
            // -6- preparedStatement 'imiz içerisine bir sorgu bekler. Biz bu yüzden
            // -6- sorguyu preparedStatement üzerine yazarız.

            preparedStatement.setInt(1, id);
            // -6- Bu şekilde bir şey yaparsak, burada "?" işaretimiz yerine "id" geçmiş olacaktır.
            // -6- Örneğin bizim id 'miz 4 ise, oraya 4 geçecektir.

            ResultSet rs = preparedStatement.executeQuery();
            // -6- Yukarıdaki komut ile de biz preparedStatement içerisine gönderdiğimiz sorguyu
            // -6- bu komut ile direkt olarak çalıştırmış oluruz ve bu sorgumuz da bize yine
            // -6- ResultSet şeklinde bir yapı döner.

            while (rs.next()) {
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                System.out.println("Ad: " + ad + " Soyad: " + soyad + " Email: " + email);
                // -6- Sonrasında da yine burada üzerinde gezinme işlemleri yaparak eklenen değerleri bastırıyoruz.

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        // --6-- En son da main metoda giderek bu kod bloğunu çaşıştıralım.....




    }

    public void calisanSil() {
        // -5- Tabloda eklenen bir çalışanı da kod yazarak silme işlemi yapma işlemi de mümkündür.

        try {
            statement = con.createStatement();
            // -5- Yine öncelikle bir createStatement oluşturmamız gerekmektedir.
            // -5- Sonrasında da yine sorgumuzu yazmamız gerekiyor:

            String sorgu = "Delete from calisanlar where id > 3";
            // -5- "D"elete from calisanlar" yazarak direkt olarak çalılanlar tablosundan bir veriyi
            // -5- silmek istediğimizi sorguda söylemiş oluruz. Ancak bunu yaptığımız zaman buradaki
            // -5- bütün verileri silmiş oluruz. Bunun yanına da "where id > 3" yazarsak da id 'si
            // -5- 3 'den büyük olanları silecektir.

            int deger = statement.executeUpdate(sorgu);
            // -5- Bu sayede de sorguyu çalıştırmış oluruz. Bu arada bizim yazdığımız executeUpdate bir
            // -5- integer değer döner. Bu değer de şu aslında, mesela bizim kaç değerimiz silinirse örn.
            // -5- 3 tane değer silindiyse bize bu executeUpdate, 3 değerini döner.

            System.out.println(deger + " kadar veri etkilendi...");
            // -5- Bu sayede de kaç değerin etkilendiğini executeUpdate'den dönen değerden almış oluruz.




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void calisanGuncelle() {
        // -4- Tablo içerisinde çalışanları güncellemek için de belirli işlemleri yapabiliriz.
        // -4- Yine ilk olarak statement oluşturacağız.

        try {
            statement = con.createStatement();
            // -4- statement oluşturuldu.

            String sorgu = "Update calisanlar Set email = 'borayldrm@hotmail.com' where id = 1";
            // -4- Daha sonra sorgu girmemiz gerekşyor. Burada hangi tabloyu güncelleyeceğimizi söylüyoruz.
            // -4- Sonrasında bunu söyledikten sonra da tablomnuzda hangi özelliğin değişmesini istediğimizi
            // -4- söylememiz gerekiyor. Örn. tablodaki emaillerimi güncellemek istediğimi Set email şeklinde
            // -4- söyleyerek belirtmiş oluyoruz. Sonra da güncelleyeceğimiz özelliği gireriz. Ancak biz bunu
            // -4- bu şekilde yaparsak ekstradan belirtmediğimiz için tablodaki tüm email değerleri bu şekilde
            // -4- güncellenir. Fakat sadece id 'si 1 olan çalışanın güncellenmesini istiyorsak; burada
            // -4- where id = 1 şeklinde bir şey daha söylememiz gerekiyor.

            statement.executeUpdate(sorgu);
            // -4- Bu sayede de tablomuz direkt olarak güncellenmiş olacaktır.

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void calisanEkle() {
        try {
            statement = con.createStatement();
            // -3- Statement 'i yine oluşturmamız gerekmektedir.

            String ad = "Mehmet Kaan";
            String soyad = "Mesci";
            String email = "mesci@kaanke.com";

            // -3- URL üzerinden panelde SQL sekmesinde yaptığımız sorgunun aynısı
            // -3- INSERT INTO calisanlar (ad,soyad,email) VALUES('Mesut', 'Çelik', 'mesutke@mesutmesut.com')
            String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES(" + "'" + ad + "'," + "'" + soyad + "'," + "'" + email + "')";

            statement.executeUpdate(sorgu);
            // -3- Sonrasında da statement üzerinden bu sorguyu çalıştırmamız gerekiyor. Biz her güncelleme
            // -3- ya da değiştirme yaptığımız zaman burada executeUpdate metodumuzu kullanmamız gerekiyor.
            // -3- bu sayede de veritabanımıza bir değer eklenmiş olacaktır. Main metodda bunu çalıştıralım:



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void calisanlariGetir() {
        // -2- URL üzerinden bir çalışanlar tablosu oluşturuldu. Buraya 4 tane çalışan girildi.
        // -2- Biz daha sonra bu verileri çekmek için bir metod yazalım.
        // -2- İlk olarak bir SQL sorgusu oluşturmamız gerekmekteedir.

        String sorgu = "Select * from calisanlar";      // ---->> BU ÇOK ÖNEMLİ
        // -2- Yukarıdaki SQL sorgumuz şu işe yarar: "çalışanlar tablosundaki bütün verileri al"
        // -2- "*" yıldızın anlamı da şudur; bütün özellikleri istediğimizi söylemiş oluruz.
        // -2- Bu sorgu direkt statement üzerinden çalıştırılacaktır. Normalde bu statement'imizi null yaptık.
        // -2- Bu statement 'imizi çalıştırailmek için connection yaptığımız "con" değişkeninden,
        // -2- bu statement 'i oluşturmamız gerekiyor.

        // Eğer biz id 'si 2'den büyük olan değerleri almak istersek de ;
        // "Select * from calisanlar where id > 2" şeklinde sorgu vermemiz gerekiyor.

        try {
            statement = con.createStatement();
            // -2- yani connection üzerinden bir statement oluşturacağımızı söylüyoruz.

            ResultSet rs = statement.executeQuery(sorgu);
            // -2- Yukarıdaki kod ile sorgumuzu çalıştırma işlemi yapıyoruz.
            // -2- executeQuery, veritabanında belirli bir güncelleme yapmıyorsak bu metodu kullanırız.
            // -2- bu executeQuery, içine aldığı bir SQL sorgusunu direkt çalıştıracaktır.
            // -2- executeQuery 'nin 'ResultSet' şeklinde bir return değeri vardır. Biz bu SQL sorgusunu
            // -2- çalıştırırız ve tablodak değerlerimiz direkt bir ResultSet şeklinde bir classa atanacaktır.
            // -2- Sonrasında biz bu class üzerinden tablodaki değerleri tek tek alabilmiş oluruz.
            // -2- "statement.executeQuery(sorgu);" şeklinde oluşturulur fakat buradan dönen değeri almamız için
            // -2- buraya bir ResultSet oluştururuz ve "ResultSet rs = statement.executeQuery(sorgu);" böyle olur.


            while (rs.next()) {
                // -2- ResultSet üzerinde bu tablodaki bilgiler üzerinde gezinmemiz gerekiyor. Bu iterator
                // -2- mantığında çalışıyor. Biz bütün tablomuzu alıyoruz, tablomuz üzerindeki her bir değeri
                // -2- ResultSet üzerinde gezinerek alabiliyoruz. Bu aslında şu anlama gelir: Daha okunacak veri
                // -2- var mı?" (rs.next). Okunacak veri kalmadığında döngü sonlanacaktır.

                int id = rs.getInt("id");
                // -2- URL üzerinden eklenen tablodaki ad, soyad, id, e-mail gibi verileri almak için;
                // -2- mesela ilk olarak "id" yi almak istiyorsak, int id (id'miz integer bir değer)
                // -2- (ResultSet) rs.getInt dediğimizde orada "columnLabel" şeklinde bir şey ister bizden
                // -2- yani sütunumuzun ismini. Biz de oraya sütunumuzun ismini gireriz. ("id").

                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                // Diğerlerini de aynı şekilde alabiliriz..

                System.out.println("ID : " + id + " Ad : " + ad + " Soyad : " + soyad + " E-mail : " + email);
                // -2- Biz böyle bir şey yaptığımızda da tablodaki bütün değerleri almış oluruz...

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Baglanti() {
        // -1- Constructor oluşturuldu. İlk olarak bir URL vermemiz gerekiyor ve bu URL 'leri de
        // -1- özellikleri ile beraber oluşturmamız gerekmektedir.

        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        // "jdbc:msql://localhost:3306/demo"
        // Bu sayede veritabanına bağlanmış olacağız.

        // -3- NOT : Yukarıda ("?useUnicode=true&characterEncoding=utf8") şeklinde yazılan kod, listeye ekleme
        // -3- yapılacağında türkçe karakter içeriyorsa, hata almamak için oluşturulmuştur.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı.");

        }
        // -1- İlk başta veritabanına bağlanmak için gerekli olan Driver 'ı, özellikle
        // -1- başlatmamız gerekiyor. try - catch bloğunda kullanacağız.
        // -1- Bu sayede de buradaki jdbc driver 'ını ekstradan burada çağırmış oluyoruz.

        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı...");
            // -1- Bu işlem veritabanına bağlanma işlemidir. Biz bir DriverManager başlattık ve
            // -1- içerisine bir url, kullanıcı adı ve parola atamamız gerekiyor. Eğer bu başarılı
            // -1- olursa ve biz belirli bir connection elde edersek direkt veritabanına bağlanmış olacağız.
            // -1- Ancak bağlanamazsak da, SQLException fırlatılır.

        } catch (SQLException e) {
            System.out.println("Bağlantı başarısız...");

        }
    }

    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        // Bağlanıp bağlanamadığımızı test edelim...

        // System.out.println("Silinmeden önce\n");
        // baglanti.calisanlariGetir();                         // Çalışanları ekrana getirdiğimiz kod.
        // System.out.println("*************************");
        // System.out.println("Silindikten sonra\n");
        //baglanti.calisanGuncelle();
        // baglanti.calisanSil();                               // 3 tane çalışanımız silinecek.
        // baglanti.calisanlariGetir();                         // Çalışanları ekrana getirdiğimiz kod.

        //baglanti.calisanEkle();                               // Çalışan eklediğimiz kod.
        //baglanti.calisanlariGetir();                          // Çalışanları ekrana getirdiğimiz kod.

        baglanti.preparedCalisanlariGetir(3);               // id'si 3den büyük olanları getirir.
        // Bu şekilde içine 3 yazdığımız zaman "idsi 3'den büyük olanı almak istiyorum" demek olur.
        // Bu sayede de karşımıza sadece id'si 3den büyük olan değerler gelecektir. Yani biz burada
        // preparedStatement kullanarak çok daha güzel bir şekilde sorgumuzu yazmış olduk.


        /* ÖNEMLİ NOT: BİZİM YUKARIDAKİ YAPTIĞIMIZ TÜM İŞLEMLERİN YAPILABİLMESİ İÇİN
        XAMPP PROGRAMINDA "MYSQL DATABASE" VE "APACHE WEB SERVER" BAĞLANTILARIMIZIN
        HER İKİSİNİN DE AÇIK OLMASI GEREKMEKTEDİR. (RUNNİNG) EĞER BAĞLANTI BAŞARISIZ
        UYARISI VERİRSE SERVER AÇIK OLMADIĞINDAN KAYNAKLANIR YA DA DRİVER BULUNAMADI
        HATASI VERİRSE DRİVER TAM OLARAK OKUNAMADIĞI İÇİN BU HATAYI VERİR. BUNA ÇOK
        DİKKAT ETMEMİZ GEREKMEKTEDİR...     */



    }
}