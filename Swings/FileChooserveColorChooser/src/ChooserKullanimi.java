import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ChooserKullanimi extends JFrame {
    private JButton dosyaAc;
    private JButton renkDegistir;
    private JTextArea yazi_alani;
    private JPanel panelMain;

    public ChooserKullanimi() {

        add(panelMain);
        setSize(300, 300);
        setTitle("FileChooser ve ColorChooser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        dosyaAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int i = fc.showOpenDialog(ChooserKullanimi.this);

                if (i == JFileChooser.APPROVE_OPTION) {
                    // açılan pencerede "OK" tuşuna basılmışsa;
                    // Biz burada bir dosya seçmişiz ve ok'a basmışız demektir...
                    File file = fc.getSelectedFile();

                    String icerik = "";

                    try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
                        while (scanner.hasNextLine()) {
                            icerik += scanner.nextLine() + "\n";
                        }
                        yazi_alani.setText(icerik);

                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        renkDegistir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(ChooserKullanimi.this, "Bir renk seçiniz", Color.RED);
                yazi_alani.setForeground(color);
            }
        });
    }
}
