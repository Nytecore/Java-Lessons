import javax.swing.*;
import java.awt.*;

public class GrafikKullanimi extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        // g --> bizim constructor'da verdiğimiz referanstır.
        // .setcolor() metodu bundan sonraki şeylerin renginin ne olacağını ayarlar. (Color.red --> kırmızı)

        g.drawRect(100, 10, 30, 40);
        // x --> 100 , y --> 10 konumunda ; 30 genişlik ve 40 yükseklikte bir dikdörtgen oluşturur.
        // .drawRect --> içi boş bir şekildir. Çizgileri boyalıdır.
        // drawRect = (draw rectangle). Rectangle --> Dikdörtgen çizer.

        g.fillRect(200, 100, 30, 40);
        // x --> 200 , y --> 100 konumunda ; 30 genişlik ve 40 yükseklikte bir dikdörtgen oluşturur.
        // .fillRect --> içi dolu bir şekildir. İçi komple boyalıdır.

        g.setColor(Color.blue);
        // Bundan sonrakilerin renkleri mavi olacak...

        g.drawOval(200, 200, 60, 60);
        // x --> 200 , y --> 200 konumunda ; 60 genişlik ve 60 yükseklikte bir OVAL oluşturur.
        // .drawOval --> içi boş bir oval oluşturur. (Oval = Oval)

        g.fillOval(300, 300, 40, 40);
        // x --> 300 , y --> 300 konumunda ; 40 genişlik ve 40 yükseklikte bir OVAL oluşturur.
        // .fillOval --> içi dolu bir oval oluşturur. (Oval = Oval)

        g.setColor(Color.yellow);
        // Bundan sonraki şekiller sarı olacak.

        g.drawLine(100, 100, 300, 300);
        // drawLine --> Bize bir çizgi çizer.
        // x1 ~ y1 --> Başlangıç noktasıdır.
        // x2 ~ y2 --> Bitiş noktasıdır.
        // (100'e 100'de başla 300'e 300'de bitir)

    }

    public GrafikKullanimi() {
        setBackground(Color.black);
    }

}