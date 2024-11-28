import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DosyaIndirme extends JFrame {

    private JPanel panelMain;
    private JProgressBar checkprogress;
    private JButton dosyaindir;

    private int say = 0;

    public DosyaIndirme() {

        add(panelMain);
        setSize(300, 100);
        setTitle("Dosya İndirme Programı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dosyaindir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Butona tıkladığımızda progress bar'ı ilerletmek istiyoruz.
                // Bunun için timer'a ihtiyaç var. Neden? Çünkü belirli ms'de bir bu bar ilerlesin diyeceğiz.

                Timer timer = new Timer(50, null);
                // Timer classından bir obje oluşturduk. 50 msde - 1 çalışacak.
                // 'null' yazan yer aslında actionPerformeddir. Şimdilik boş bırakıyoruz.

                timer.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        say++;
                        checkprogress.setValue(say);

                        if (checkprogress.getValue() == 100) {
                            //JOptionPane.showMessageDialog(DosyaIndirme.this, "Dosya İndirme Tamamlandı.");

                            timer.stop();
                            SonucSayfasi sonuc = new SonucSayfasi();
                            setVisible(false);
                            sonuc.setVisible(true);
                        }
                    }
                });
                timer.start();
            }       // Timer her çalıştığında bir işlem yapmak istiyoruz, her çalıştığında actionPerformed
            // çalışacak. Burada timer'ımızı direkt olarak başlatmak istediğimizi belirteceğiz.
        });
    }
}