import javax.swing.*;
import java.awt.*;

public class OyunEkrani extends JFrame {

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {

        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        //(1) Oyun ekranına isim verdik. (Bunun için constructor oluşturuldu.)

        ekran.setResizable(false);
        //(1) Oyun ekranımızın yeniden boyutlandırılabilir olmasını istemiyoruz. (false)
        ekran.setFocusable(false);
        //(1) Programın, oyun ekranımızın burasına odaklanmasını istemiyoruz. (false) JPanele odaklanacak.

        ekran.setSize(800,600);
        //(1) Oyun ekranımız 800x600 genişliğinde olacak.

        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //(1) Oyunumuz kapat tuşuyla kapatıldığında program da duracak.

        Oyun oyun = new Oyun();
        //(1) JPanel işlemlerini içeren JPanel'imizden bir obje oluşturduk.

        oyun.requestFocus();
        //(1) JPanelimzin bizim klavye işlemlerimizi anlaması için böyle bir kod yazılır.

        oyun.addKeyListener(oyun);
        //(1) Daha sonra JPanel üzerinde KeyListener şeklinde bir interface'i implemente edeceğiz. Bu,
        //(1) Bizim klavye işlemlermizi anlamayı sağlayacak. Direkt klavyeden işlemleri almamızı sağlayacak.

        oyun.setFocusable(true);
        //(1) Programın, oyun ekranımızın burasına odaklanmasını istiyoruz. (true) Odak, JPanelde olacak.

        oyun.setFocusTraversalKeysEnabled(false);
        //(1) Klavye işlemlerini buradaki JPanel'in anlaması için gereken metoddur. (false demeliyiz)

        ekran.add(oyun);
        //(1) Yukarıdaki kod ile JPanel'imizi, JFrame'imize eklemiş oluyoruz.

        ekran.setVisible(true);
        //(1) Yukarıdaki kodla JFrame'imiz, JPanel eklendikten sonra direkt olarak oluşturulacaktır.



    }
}
