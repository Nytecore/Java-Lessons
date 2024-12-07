import java.sql.*;
import java.util.Scanner;

public class CommitveRollback {

    /*  DATABASE TRANSACTİON

    Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız. Örneğin
    elimizde birbirleriyle bağlantılı 3 tane tablo güncelleme işlemimiz var. (delete,
    update). Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim...

    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2);        // Burada harhangi bir hata oldu ve programımız sona erdi;
    statement.executeUpdate(sorgu3);

    Böyle bir durumda 2. sorgumuzda bir hata oluyor ancak 1. sorguda hata olmadığı için o sorgumuz
    veritabanını güncelledi. Ancak bu sorgular birbirleriyle bağlantılı ise 1. sorgunun da çalışmaması
    gerekirdi. İşte böyle durumların önüne geçmek için Transaction kullanılmaktadır. (Rollback - Commit)

    (ATM Örneği)

    Transaction mantığını kullanmak için bu sorguların sadece hiç bir sorun oluşmadığında toplu
    çalışmasını istiyoruz. Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları
    sorgusuz sualsiz çalıştırır. Onun için ilk olarak "con.setAutoCommit(false)" şeklinde bir
    komut yazarak bu durumu engellemiş oluyoruz.

    commit() : Bütün sorguları çalıştır. (Sorun olmadığı zaman hepsini çalıştırmak için kullanılır)
    rollback() : Bütün sorguları iptal et. (Sorun olduğu zaman hiçbirini çalıştırmamak için kullanılır)

    Bu sayede de programımızı daha güvenilir şekilde yazmış oluyoruz.

    Not: setAutoCommit(false) yazsak bile veritabanını güncellemeyen bir komutumuz varsa, herhangi
    güvenlik sıkıntısı olmayacağı için o komutumuz çalıştırılır.            */

    private String kullanici_adi = "root";
    // Kullanıcı adını default "root" olduğundan root yaparız.

    private String parola = "";
    // Parola da default boş olduğundan boş bırakıldı.

    private String db_ismi = "demo";
    // Hangi veritabanına bağlanmak isteediğimizi söylememiz gerekiyor.
    // Yani databate'imizin hangi sunucuda olduğunu söylememiz gerkiyor.

    private String host = "localhost";
    // Eğer uzak bir sunucu ise o sunucunun direkt adresini vermemiz gerkeirdi.
    // Ancak bizimki şu anda yerel bir sucunu olduğuna göre buraya localhost vermemiz gerkir.

    private int port = 3306;
    // Eğer MySql veritabanı belirli bir portta çalışıyor ise bizim o port numarasını buraya
    // vermemiz gerekmektedir. Bizim MySqL 'imiz "3306" portta çaıştığı için bunu söylememiz gerekir.

    private Connection con = null;
    // Sonrasında da bizim connection şeklinde Connection classından obje üretmemiz gerekiyor.
    // Bu obje üzerinden veritabanı bağlantımızı gerçekleştireceğiz. En başta null olarak başlattık.
    // Daha sonra bir constructor içerisinde bu connection 'u sağlamaya çalışacağız.

    private Statement statement = null;
    // Veritabanında işlem yapmak için bir "Statement" oluşturmak gerekmektedir.
    // Direk SQL sorgularını çalıştırmak için gerekli olan classımızdır.
    // Bunun içindeki metodları kullanarak SQL sorgularımızı çalıştırıyoruz.

    public CommitveRollback() {
        // Constructor oluşturuldu. İlk olarak bir URL vermemiz gerekiyor ve bu URL 'leri de
        // özellikleri ile beraber oluşturmamız gerekmektedir.

        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        // "jdbc:msql://localhost:3306/demo"
        // Bu sayede veritabanına bağlanmış olacağız.

        // NOT : Yukarıda ("?useUnicode=true&characterEncoding=utf8") şeklinde yazılan kod, listeye ekleme
        // yapılacağında türkçe karakter içeriyorsa, hata almamak için oluşturulmuştur.

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı.");

        }
        // İlk başta veritabanına bağlanmak için gerekli olan Driver 'ı, özellikle
        // başlatmamız gerekiyor. try - catch bloğunda kullanacağız.
        // Bu sayede de buradaki jdbc driver 'ını ekstradan burada çağırmış oluyoruz.

        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı...");
            // Bu işlem veritabanına bağlanma işlemidir. Biz bir DriverManager başlattık ve
            // içerisine bir url, kullanıcı adı ve parola atamamız gerekiyor. Eğer bu başarılı
            // olursa ve biz belirli bir connection elde edersek direkt veritabanına bağlanmış olacağız.
            // Ancak bağlanamazsak da, SQLException fırlatılır.

        } catch (SQLException e) {
            System.out.println("Bağlantı başarısız...");

        }
    }

    public void calisanlariGetir() {

        String sorgu = "Select * from calisanlar";

        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {

                int id = rs.getInt("id");

                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("ID : " + id + " Ad : " + ad + " Soyad : " + soyad + " E-mail : " + email);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void commitverollback() {

        Scanner scanner = new Scanner(System.in);

        try {
            con.setAutoCommit(false);
            // Burada javaya "sen bu işlemlerin hiçbirini otomatik yapma. Ben bunları kendim yapacağım" diyoruz.

            String sorgu1 = "Delete From calisanlar where id = 3";
            // calisanlar listesindeki id'si üçe eşit olanı siler.
            String sorgu2 = "Update calisanlar set email = 'exmple@email.com' where id = 1";
            // calisanlar listesindeki id'si bire eşit olanın e-mail adresini günceller.

            System.out.println("\n\t\t-----------  Güncellenmeden önce -----------\n");
            calisanlariGetir();

            Statement statement = con.createStatement();    // ---> createStatement oluşturuldu.
            statement.executeUpdate(sorgu1);    // sorgu1 ---> çalıştırıldı.
            statement.executeUpdate(sorgu2);    // sorgu2 ---> çalıştırıldı.

            System.out.print("\nİşlemleriniz kaydedilsin mi? (Y ~ N) : ");
            String cevap = scanner.nextLine();

            if (cevap.equals("y")) {
                con.commit();           // ---> Bütün sorgular çalıştırıldı.
                calisanlariGetir();     // ---> Çalışanlar listesi çağrıldı.
                System.out.println("Veritabanı güncellendi...");

            } else {

                con.rollback();         // ---> Bütün sorgular iptal edildi.
                System.out.print("\nVeritabanı güncellemesi iptal edildi. Listeyi görüntülemek istiyor musunuz? (Y ~ N) : ");
                String cevap2 = scanner.nextLine();

                if (cevap2.equals("y")) {
                    System.out.println("\nListe görüntüleniyor :\n");
                    calisanlariGetir();

                } else {
                    System.out.println("Çıkış yapılıyor...");
                    return;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        CommitveRollback comroll = new CommitveRollback();
        comroll.commitverollback();

        // Commit vr Rollback işlemleri bu şekilde yapılıyor. Bu sayede biz işlemlerimizi
        // daha güvenilir bir şekilde yapıyoruz. Programımız daha güvenli çalışmış oluyor.

    }
}