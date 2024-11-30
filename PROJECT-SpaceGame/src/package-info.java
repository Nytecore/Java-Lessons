/*

            Oyunu çalıştırılabilir bir JAR dosyasına dönüştürmek için;

            - Öncelikle File > Project Structure ayarına gilidir.
            - Sonrasında orada sol taraftaki (+) tuşuna basılır JAR seçilir > From modules with dependencies... seçilir
            - Sonrasında açılan pencerede MAİN CLASS: alanına dosyanın çalıştırılacak olan classı seçilir.
                - Yani Run classı hangisi ise oraya o seçilir ve OK tuşlanır.
            - Sonrasında sağ tarafa o bilgiler geçer ve orada yukarda bir kutucuk var o seçilir kutucuk:
                - "Include in project build" kutucuğu seçilir. (Bu seçenek jws haricinde kütüphaneden
                - eklenen başka bir kütüphane var ise onu da dahil etmek için seçilir.)
            - Üst kısımdan dosyanın yolu, adı ve türü belirlenir.
            - Sonrasında Apply > OK diyerek çıkılır.
            - Sonrasında proje ekranında yukarda "Build" sekmesi tıklanır. Buradan da "Build Artifacts" seçilir.
            - Az önce oluşturulan ve ismi verilen JAR artifacts'ı burada görünür ve onun üzerine tıklanır.
            - Sonrasında açılan pencereden de "Build" tuşlanır. JAR dosyası oluşturulur.

            NOT: Proje içerisinde kullanılan görsel dizinden projeye çekildi ise; JAR dosyası ile
            oradaki görsel aynı klasörde - yan yana olması gerekmektedir.

            NOT2: Proje içerisine çekilen dosya yolu ile, dosyanın yolu aynı olmalıdır. Bu projeden
            örnek verirsek: "image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));"
            şeklinde bir kod yazıldı. Bu kod, image referansı ile, "uzaygemisi.png" dosyasını aç komutunu
            ifade eder. Dosya çalıştırmada eğer dosyayı direkt görmüyor da biz ayrıca dosya yoluna örn.
            "çalışmalar/Proje/uzaygemisi.png" şeklinde bir şey yazarsak; IDE içerisinde projemiz çalışır
            fakat dosya yolundaki oradaki ile aynı adı taşımadığından JAR çalışmayacaktır. Bunun için Run
            sekmesinde Edit Configurations penceresinde dosya yolunun direkt seçili olması gerekir. Bu sayede
            hem IDE içerisinde hem de JAR dosyaası olarak proje çalıştırılabilir.

























 */