import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class Ates {
    //(1) Uzay gemisinin atışlarını yapacak olan ateşin üretileceği class oluşturuldu.
    //(1) Ateşimizin bir x ve y koordinatı olacak ve her ActionPerformed çalıştığında bir ileri gitmeye çalışacak.

    private int x;
    private int y;

        // Constructor
    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

        // Getter & Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Oyun extends JPanel implements KeyListener, ActionListener {

    Timer timer = new Timer(5, this);
    //(2) Bir timer oluşturuldu. Constructor'una iki değer girmeliyiz.Birinci değer timer kaç ms/de bir çalışacağı,
    //(2) ikinci değer ise timer 'ımızın içine de ActionListener interface' ini implemente eden bir obje göndermemiz gerekir.
    //(2) Bizim yukarıdaki JPanel'imiz ActionListener'i implemente ettiği için direkt buraya bu objeyi verebiliriz.
    //(2) timer 'ımızı da 5 ms'de başlatırız, (this = buluncuğu alan) ve timer'ımız her çalıştığında biz buradaki
    //(2) ActionPerformed metodunu çalıştırmış olacağız.

    //(1) Klavye işlemlerimizi anlaması için KeyListener implemente edildi.
    //(1) Topu ve uzay mekiğini hareket ettirmemiz için ActionListener implemente edildi.

    //(1) ActionListener içindeki ActionPerform şeklinde bir metod kullanacğız. Timer'ımız her çalıştığında
    //(1) Bu action perform harekete geçmiş olacak ve bu şekilde topumuz hareket etmiş olacaktır.

    private int gecen_sure = 0;
    //(1) Geçen süreyi sayacak.

    private int harcanan_ates = 0;
    //(1) Harcanan atışı sayacak.

    private BufferedImage image;
    //(1) Uzay gemimizin şeklini buna eşitleyeceğiz. Proje dosyasına "uzaygemisi.png"  olarak eklendi.

    private ArrayList<Ates> atesler = new ArrayList<Ates>();
    //(1) Yukarıdaki satır, atılan ateşleri tutmak için oluşturulan Arraylisttir. Bir tuşa basıldığında
    //(1) ateşler üretilecektir. Ancak tek bir ateş yerine bir çok ateş olabilsin diye ArrayListte tutulacaktır.

    private int atesdirY = 1;
    //(1) Ateşler yukarı doğru gicektir. Bu yüzden her timer çalıştığında bir ileri götürmemiz gerekiyor ki
    //(1) ateşlerimiz hareket edebilsin. Belli bir yerde ateşlerimiz oluşacak, daha sonra "atesdirY" yi
    //(1) biz her ActionPerformed olduğunda o ateşleri "y" koordinatına ekleyeceğiz ve ateşlerimiz hareket etmiş olacak.

    private int topX = 0;
    //(1) Bu "topX" imiz, sağa sola gitmeyi ayarlayacak. ilk başta sıfıra sıfırdan başlayacak. Sonra topX sürekli
    //(1) 1 artacak (yani örn her 5/10 ms'de bir her ActionPerformed olduğunda) bu şekilde yop sürekli hareket edecek.

    private int topdirX = 2;
    //(1) Biz bu topdirX 'i sürekli topX 'e ekleyeceğiz ve daha sonra topX 'imiz sağda belirli bir limite çarptığında
    //(1) sola dönecek bu şekilde sağa sola hareket edecek ve işlemlerimizi gerçekleştirmiş olacağız..

    private int uzayGemisiX = 0;
    //(1) Yukarıdaki uzayGemisiX 'de uzay gemisinin nereden başlatılacağını söyleyecek. (X koordinatı 0'dan başlasın)

    private int dirUzayX = 20;
    //(1) Örneğin biz klavyede sağ tuşuna bastığımızda, uzayGemisiX 'e, dirUzayX eklenecek ve bu şekilde de gemi
    //(1) 20 birim sağa kaymış olacak. Ya da sola bastığımızda 20 birim eklenecek ve sola hareket etmiş olacak.


    public boolean kontrolEt() {
        //(5) Biz bu metod ile ateşimizin ve hedefimizin çarpıştığının kontrolünü yapacağız.
        //(5) Burada, en az bir ateş bile top ile çarpışırsa buradan "true" değer dönecek. Diğer
        //(5) durumlarda "false" durum dönecektir.

        for (Ates ates : atesler) {
            //(5) forEach döngüsü ile ateşler arrayi içerisinde gezineceğiz. Çarpışmayı hesaplamak
            //(5) için bir metod kullanacağız ve bu metodlara iki tane rectangle (dikdörtgen)
            //(5) vereceğiz. Bunların çarpışması eğer oluyorsa, biz burada true değer döndüreceğiz.

            if (new Rectangle(ates.getX(), ates.getY(), 10, 20)
                    .intersects(new Rectangle(topX, 3, 20, 20))) {
                //(5) Yukarıdaki uzun formül: new Rectangle() classı ile bir dikdörtgen oluşturulur. Oluşturulan
                //(5) dikdörtgenin X konumu, ates.getX olarak ateşimizin X. konumu olarak, Y 'de yine aynı şekilde
                //(5) ates.getY ile verilir. Ateşimizin boyutu w:10/h:20 olduğundan aynı şekilde bir dikdörtgen
                //(5) oluşturulur. Sonrasında " .intersects() " metodu yazılır. Bu metod, dikdörtgenlerin çarpışma
                //(5) durumunun kontrolünü yapan bir metoddur. Yine o metod içerisine de new Rectange classı ile
                //(5) bir dikdörtgen daha oluşturulur ve buna da, yukarıda hareket eden topun konumları gönderilir.
                //(5) X ve Y eksenini topun X ve Y ekseninden alır ve genişliği yine top genişliğindedir.
                //(5) çarpışma durumunda yukarıdaki uzun formül bize "TRUE" değer döndürecektir ve koşula girmiş oluruz.

                return true;
                //(5) en az bir teş bile burada çarpıştığında fonksiyonumuz true değer dönecektir.
            }
        }
        return false;
        //(5) aksi halde; çarpışmadığını göstermek için burada false döndüğünü söyleriz.
        //(5) artık bu kontrol et metodunu paint'in içinde kullanabiliriz..     -------->>

    }


    //TODO: CONSTRUCTOR YAZILIYOR --->
    public Oyun() {

        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        //(1) Yukarıda oluşturulan uzay gmeisinin şeklini içeren "image" referansına, dosyamızın içindeyer alan
        //(1) uzaygemisi.png dosyasını okutuyoruz. Yani dosyayı image referansına eşitliyoruz.
        }

        setBackground(Color.black);
        //(1) JPanel 'imizin arkaplanını siyah yapıyoruz.

        timer.start();
        //(1) Constructor yani oyunumuz başladığı zaman biz direkt timer'ı başlatmak istiyoruz.
        //(1) Yukarıdaki kodla bu işlemi yaparız. Timer'ımız çalıştığında her 5 ms/de bir ActionPerformed
        //(1) metodumuz çalışacaktır ve artık bütün işlemlerimizi biz ActionPerformed içinde yapacağız.

    }


    // TODO: ---> ŞEKİLLER JPANEL ÜZERİNE ÇİZİLECEK ----->>
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        gecen_sure += 5;
        //(5) Yukarıdaki durum geçen süreye +5 misaniye eklediğimizi belli eder. Yukarıda geçen süreyi 0'dan
        //(5) başlattık ve oyunumuz bittiğinde geçen süreyi ekrana yazdıracağız.

        g.setColor(Color.red);
        //(1) Bundan sonra yapılanlar kırmızı renkte yapılacaktır.

        g.fillOval(topX, 3, 20, 20);
        //(1) Burada topumuzu oluşturmuş oluyoruz. x ekseninde sürekli artacağı ve azalacağı için (hareket edecek)
        //(1) burada x ekseninde topX'i ayarlayacağız ve y ekseni değişmeyeceği için "3" değeri verildi.
        //(1) top her zaman y ekseninde sabit olacak ve y ekseninin 10. pixelinde olacaktır.
        //(1) genişliği 20, yüksekliği de 20 olarak büyüklüğü de ayarlanacaktır. Topumuz her hareket ettiğinde
        //(1) topX güncellenmiş olacak ve tekrardan painti çağırdığımızda toplarımız hareket etmiş olacaktır.

        g.drawImage(image, uzayGemisiX, 490, image.getWidth() / 10, image.getHeight() / 10,this);
        //(1) Okunulan image'i graphics üzerinden çizme işlemini yapıyoruz. En soldaki alana image 'ımızı veriyoruz.
        //(1) Onun yanına 'uzayGemisiX' referansı ile uzay gemimizin 0 'ıncı pixelden başlayacağını yazıyoruz.
        //(1) İlerde uzayGemisiX'e hareket vereceğimizden  (x ekseninde yani sağa ve sola hareket edecek) bunu ekleriz.
        //(1) Onun yanına y ekseninde sabit kalacağı için "490" yazıldı ve bu değer tam alt noktaya geldiği değerdir.
        //(1) Onun yanına image 'ımızın genişliğini, (Çok geniş olduğundan 10 'a bölünerek alındı) (image.getWidth() / 10)
        //(1) Onun yanına image 'ımızın uzunluğunu, (Çok geniş olduğundan 10 'a bölünerek alındı) (image.getHeight() / 10)
        //(1) onun yanına da "this" yazarak objenin direkt JPanel üzerinde oluşacağını belirtmemiz gerektiğinden yazıldı.


        for (Ates ates : atesler) {
            //(4) ateşlerimizi çizeceğimiz yere geldik. Yine bir forEach döngüsü yarattık. Burada kontrol yapacağız:

            if (ates.getY() < 0) {
                // Burada ateşimizin JFrame'den çıktığının kontrolünü yapıyoruz yani varsayalım ki vuramadık;
                // ateşimiz ekrandan çıkacak (yani silinecektir) bunun kontrolünü yapacağız ve ateşi sileceğiz.

                atesler.remove(ates);
                // Bu şekilde de ateşi sileriz.
            }
        }

        g.setColor(Color.blue);
        // buradan sonraki çizimler mavi olacaktır.

        for (Ates ates : atesler) {
            // tekrardan bir forEach döngüsü oluşturulur.

            g.fillRect(ates.getX(), ates.getY(), 10, 20);
            // Burada ateşimizi çizdik. Ateşimizin x ve y konumları ates.get metodu ile direkt alınacaktır.
            // fillRectangle yani içi dolu dikdörtgen olarak mavi renkte çizilecektir.
            // genişliği 10, yüksekliği 20 piksellik bir diktörtgen olacak şekilde çizilmiştir.
        }

        if (kontrolEt()) {
            // Paint içerisinde bir kontrol yaptıracağız. Yukarıda yazdığımız metottaki durum yani çarpışma;
            // burada true olursa; timer'ımız duracaktır ve oyun kazanılmış olacaktır. Ekrana da bir mesaj
            // yazdırmak isteyelim. Mesaj içerisinde kazandınız, yapılan atış sayısı ve geçen süre yer alacak.
            // sonrasında da bu mesaj, JOptionPane.showMessageDialog ile ekrana verilecektir.
            // mesaj bittikten sonra da System.exit(0) fonksiyonu ile oyun sonlandırılacaktır.

            timer.stop();
            String message = "Kazandınız...\n" +
                                "Yapılan Atış: " + harcanan_ates + "\n" +
                                    "Geçen Süre: " + gecen_sure / 1000.0 + " saniye.";

            JOptionPane.showMessageDialog(this,message);
            System.exit(0);
        }

    }

    @Override
    public void repaint() {
        super.repaint();
    }

    //-----------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------
    /* NOT : paint, override methods içerisinde JCompanent'de yer alır ve Implemente edilmiştir.
    Aynı şekilde "repaint" de yine override method içerisinde sadece Component içerisinde repaint
    diye yer alan methoddur ve implemente edilmiştir. Bunların farkı, repaint her çağrıldığında
    paint de çağırılır. Bu repaint oyunlarda yazılması gerekmektedir. Bu repaint'i biz ilerde
    ActionPerformed yazdığımız zaman onun en sonunda repaint çağırılacak ve tekrardan vu paint
    işlemlerinin yapılmasını istemiş olacağız. repaint ile paint tekrar çağrılır ve paintimiz de
    tekrardan şekilleri oluşturmuş olur.    */      // (1)
    //-----------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------




    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        //(3) keyPressed metodu ile geminin, sola basınca sola sağa basınca sağa gitme işlemini yapıcaz.

        int c = e.getKeyCode();
        //(3) Buradaki işlemle keyCode'umuz sola basınca "sola basılmış" sağa basınca da tam tersi bir değer dönecek.

        if (c == KeyEvent.VK_LEFT) {
            //(3) Sol tuşuna basılıp basılmadığı kontrol edilmiş olacaktır.
            //(3) Yukarıda "dirUzayX = 20" şeklinde bir referans tanımlanmıştı. Bubu şu şekilde kullanacağız;
            //(3) sola basarsa 20 birim sola, ya da tam tersi olarak o değer, uzayGemisiX'e eklenecektir..

            if (uzayGemisiX <= 0) {
                //(3) Buradaki kontrol de şunu ifade eder; uzay gemisi konumu (uzayGemisiX) 0'a eşit yada küçükse;
                //(3) burada şunu kontrol etmiş oluyoruz, uzay gemimiz bir alanın içinde. O alandan çıkmadan sağa
                //(3) ve sola gitme işlemlerini gerçekleştirsin. Aksi halde 0'ıncı konumdaysa ve tekrar sola doğru
                //(3) hereket ederse -20. değere gidecek ve gemimiz JFrame' imizden çıkıp kaybolacaktır.

                uzayGemisiX = 0;
                //(3) bu şeklilde bir durum olduğunda uzayGemisiX, 0'a eşitlenir yani ordan sola gitme ifadesi verilir.

            } else {
                //(3) Aksi halde ise; yani uzay gemisi 0' dan büyük ise;

                uzayGemisiX -= dirUzayX;
                //(3) Bu işlemle de gemi hareket edecektir. Örn. gemimiz 300. koordinatta, (0' dan büyük) sola basınca
                //(3) 20 bilim eksilip güncellenip tekrar çizilecektir. Bu sayede 20 birim sola kaymış olacaktır.
            }
        } else if (c == KeyEvent.VK_RIGHT){
            //(3) Sağ tuşuna basılıp basılmadığı kontrol edilmiş olacak.
            //(3) Yukarıda "dirUzayX = 20" şeklinde bir referans tanımlanmıştı. Bubu şu şekilde kullanacağız;
            //(3) sola basarsa 20 birim sola, ya da tam tersi olarak o değer, uzayGemisiX'e eklenecektir..

            if (uzayGemisiX >= 760) {
                //(3) Yukarıdaki kontrol de yine gemimiz bu sefer sağ tarafa doğru JFrame' den çıkmasın diye
                //(3) kontrol edilecektir. Gemimizin bulunduğu konum 760 olmuş ise, daha fazla sağa gitmeyecek
                //(3) sürekli olarak 700'a eşitlenecektir.

                uzayGemisiX = 760;

            } else {
                //(3) Aksi halde;

                uzayGemisiX += dirUzayX;
                //(3) bu sayede de sağa hareket edeceğimizi ifade ettik. Yani Kontrol edecek Örneğin;
                //(3) uzay gemimiz 300. koordinatta (720'den küçük) o halde sağa gidebilr yani her sağ tuşta
                //(3) +20 birim ileri tekrar çizilecektir ve bu sayede sağa hareket etmiş olacaktır.
            }
        } else if (c == KeyEvent.VK_SPACE) {

            //---------------------------------------------------------------------------------//
            //---------------------------------------------------------------------------------//
                /* NOT : Uzay gemimiz space tuşuna bastığımız zaman ateşleri oluşturacak
                ve bu ateşleri yukarda oluşturduğumuz bir ArrayList'e gönderecek. Bu =
                (private ArrayList<Ates> atesler = new ArrayList<Ates>();) Bu şekilde de
                ateşlerimizi çizmeye çalışacağız. Bunun için öncelikle space tuşuna basılma
                kontrolünü yapacağız... ----->>         */       // --- (4. ders) ---
            //---------------------------------------------------------------------------------//
            //---------------------------------------------------------------------------------//

            //(4) Yukarıda kontrol yaptığımız durumda space basılınca artık bir ateş oluşturmamız gerekiyor.
            //(4) bunu da yukarıda oluşturduğumuz class cinsinden yani bunları class'a yazmıştık. (class Ates)
            //(4) ve biz oluştururken Constructor yapmıştık yani oluştururken direkt olark x ve y koordinatlarını
            //(4) vererek oluşturmamız gerekmektedir ve ateşlerimiz her actionPerformed çalıştığında sadece yukarı
            //(4) yönlü hareket edeceklerdir. Yani 'y' değerimiz sürekli olarak güncellenecektir.

            atesler.add(new Ates(uzayGemisiX + 15,470));
            //(4) yukarıdaki işlem şudur. Ateş'in 'y' koordinatı gemi ile aynı düzende olacağı için (gemiden atılacak)
            //(4) gemi 'y' koordinatında sürekli 490. koordinatta olacağından ateş de hep o koordinatta olacaktır.
            //(4) Bu yüzden 'y' koordinatına 470 girildi, X koordinatına da uzayGemisiX yazıldu bu da gemiyi x ekseninde
            //(4) hangi koordinata götürürsek, o koordinattan ateş başlayacağını belirleyeceğimiz için. Ancak bizim
            //(4) uzay gemimiz bir image' dan oluştuğu için +15 şeklinde bir değer veriyoruz ve geminin 15 birim sağı
            //(4) ateşin başlayacağı yer olacak. Bunu belirtiyoruz. Bu sayede uzay gemimiz neredeyse ateş orda oluşmuş oldu.

            harcanan_ates++;
            //(4) Yukarıda bizim harcanan_ates değerimiz vardı. Ateş oluştukça bu değer 1 artacaktır. Çünkü bu ateşin
            //(4) sayılmasını istiyoruz.

            //(4) Buradan tekrar actionPerformed içerisine gidiyoruz. Ateşi oluşturduk fakat
            //(4) ateşin yukarı doğru hareketini actionPerformed metodunda yapacağız. ----->>



        }

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (Ates ates: atesler) {
            //(4) Yukarıdaki gibi bir forEach döngüsü oluşturuyoruz ve bu actionPerformed her çalıştığında
            //(4) bu ateşlerimin 'y' koordinatlarını değiştirmem gerekiyor.. bunun için ------->>>

            ates.setY(ates.getY() - atesdirY);
            //(4) Yukarıdaki kod ile her actionPerformed çalıştığında ateşlerimin 'y' koordinatları değişmiş olacak.
            //(4) ates.setY diyerk ateşimizin koordinatını değiştireceğimizi, içerisine de ates.getY ile şu anki
            //(4) değerini alacağız ve o değerden de yukarıda "atesdirY = 1" şeklinde oluşturduğumuz 1 değerini
            //(4) o anki ateş değerinden sürekli çıkarılacaktır. Yani her ateşlemede ateş yukarı yönlü tektrar
            //(4) tekrar çizilecektir ve hareket etmiş gibi görünecektir.
            //(4) Sonrasında da tekrar repaint() metodu ile tekrar tekrar çizmemiz gerekmektedir. Repaint;
            //(4) pain'i çağırır ve paint ateş'i tekrar tekrar çizer. (actionPerformed sonunda repaint çağrıldı)
            //(4) Buradan da tekrar paint() metoduna gidip ateşimizi çizelim.      ---------->>>

        }
        //(2) Yukarıda anlatılan actionPerformed burasıdır. Her actionPerformed çalıştığında topu hareket
        //(2) ettirmek istiyoruz peki bunu nasıl yapacağız?? --->>

        topX += topdirX;
        //(2) topX değişkenimize topdirX değişkenimiz timer her çalıştığında eklenecektir. Yani olay şu;
        //(2) 5 ms'de bir timer çalışacak. topX değerimiz 0 olarak başlayacak. topdirX değerimiz "2" olduğundan
        //(2) her 5 ms 'de bir topX değerine yani topun x eksenindeki değerine 2 ekleyerek tpu 2 piksel sağa
        //(2) çizecektir. Her 5 ms' de bir top sağa hareket etmiş olacaktır. Buna bir sınır koyacağız ki topumuz
        //(2) alandan çıkmasın ve ordan sonra da geri dönsün. Bunu aşağıda yapalım....

        if (topX >= 780) {
                //(2) topX, x ekseninde 750. koordinata geldiği zaman;

            topdirX = -topdirX;
                //(2) 750'ye geldiğinde topdirX'imi -2'ye dönüşecektir ve artık o koordinattan sonra
                //(2) her 5 ms' de bir -2 / -2 değer dönecektir ve bu sefer de topX sola hareket etmeye
                //(2) başlayacaktır yani geriye gidecektir. Bu sefer de sıfıra gittiğinde 0'dan çıkmaması
                //(2) gerektiği için ona göre de bir kontrol yapmamız gerekecektir. Bunun için -->
        }
        if (topX <= 0) {
            //(2) top, 0 koordinatına eşit veya küçükse;

            topdirX = -topdirX;
            //(2) bu sefer de - olan topdirX değerimizi + değere dönüşecektir ve 0'a geldiğinde
            //(2) topdirX, topX 'imize +2 değerler verecek ve tekrar topumuz sağa doğru harekete
            //(2) başlayacaktır.

            //(2) Burada olay şudur, "-topdirX" durumu, topdirX'in o anki durumunu negatife çevirmek için
            //(2) yazılır. Yani artı ise eksiye, eksi ise de artıya çevirir.
        }
        repaint();
        //(2) Sonrasonda da bizim tekrar repaint() metodunu çalıştırmamız gerekecek yani yukarıdaki
        //(2) işlemlere göre top tekrar çizilecek. Repaint de paint'i otomatik olacak çağıracaktır ve
        //(2) topumuz o işlemlere göre tekrar çizilecektir. Bu sayede timer ile her actionPerformed
        //(2) çalıştığında topumuz hareket etmiş olacaktır.








    }


}
