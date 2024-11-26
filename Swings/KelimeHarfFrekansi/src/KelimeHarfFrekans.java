import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KelimeHarfFrekans extends JFrame {

    private JPanel panelMain;
    private JButton goster;
    private JLabel kelime_alani;
    private JLabel harf_alani;
    private JTextArea yazi_alani;

    public KelimeHarfFrekans() {
        add(panelMain);
        setSize(500, 300);
        setTitle("Kelime ve Harf Hesaplama Aracı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String yazi = yazi_alani.getText();
                int karakter_sayisi = 0;
                int kelime_sayisi = 0;

                for (int i = 0; i < yazi.length(); i++) {
                    if (yazi.charAt(i) != ' ') {
                        karakter_sayisi++;
                    }
                }
                String[] kelime_array = yazi.split(" ");
                for (String kelime : kelime_array) {
                    kelime_sayisi++;
                }
                kelime_alani.setText("Kelime Sayısı : " + kelime_sayisi);
                harf_alani.setText("Harf Sayısı : " + karakter_sayisi);
            }
        });
    }
}