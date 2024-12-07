import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

public class GirisEkrani extends JFrame {
    private JTextField kullanici_adi_alani;
    private JPasswordField parola_alani;
    private JPanel girisPaneli;
    private JButton cikis;
    private JButton giris;
    private JLabel k_mesaj_yazisi;
    private JLabel y_mesaj_yazisi;

    CalisanIslemleri islemler = new CalisanIslemleri();

    public GirisEkrani() {

        add(girisPaneli);
        setVisible(true);
        setBounds(500, 300, 450, 250);
        setTitle("Giriş Ekranı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        giris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Giriş Yap Butonu.
                k_mesaj_yazisi.setText("");
                y_mesaj_yazisi.setText("");

                String kullanici_adi = kullanici_adi_alani.getText();
                String parola = new String(parola_alani.getPassword());
                boolean girisBasarili = islemler.girisYap(kullanici_adi, parola);

                if (girisBasarili) {
                    y_mesaj_yazisi.setText("Başarıyla giriş yapıldı..   " + "-" + kullanici_adi);

                    CalisanEkrani calisanEkrani = new CalisanEkrani();

                    setVisible(false);
                    calisanEkrani.setVisible(true);

                    calisanEkrani.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent windowEvent) {
                            System.exit(0);
                        }
                    });


                } else {
                    k_mesaj_yazisi.setText("Giriş başarısız..");
                }

            }
        });

        cikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Çıkış Yap Butonu.
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        // Çalışma alanı
        GirisEkrani giris = new GirisEkrani();
        giris.setVisible(true);


    }
}
