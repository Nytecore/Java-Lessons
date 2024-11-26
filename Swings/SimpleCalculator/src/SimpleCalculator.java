import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel panelMain;
    private JButton toplama_butonu;
    private JButton carpma_butonu;
    private JTextField birinci_sayi_txt;
    private JTextField ikinci_sayi_txt;
    private JTextField sonuc_txt;
    private JButton cikarma_butonu;
    private JButton bolme_butonu;


    public SimpleCalculator() {
        add(panelMain);
        setSize(300, 200);
        setTitle("Basit Hesap Makinesi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        toplama_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinci_sayi_txt.getText());
                int ikinci_sayi = Integer.valueOf(ikinci_sayi_txt.getText());
                sonuc_txt.setText(String.valueOf(birinci_sayi + ikinci_sayi));
            }
        });

        cikarma_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinci_sayi_txt.getText());
                int ikinci_sayi = Integer.valueOf(ikinci_sayi_txt.getText());
                sonuc_txt.setText(String.valueOf(birinci_sayi - ikinci_sayi));
            }
        });

        carpma_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinci_sayi_txt.getText());
                int ikinci_sayi = Integer.valueOf(ikinci_sayi_txt.getText());
                sonuc_txt.setText(String.valueOf(birinci_sayi * ikinci_sayi));
            }
        });

        bolme_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int birinci_sayi = Integer.valueOf(birinci_sayi_txt.getText());
                int ikinci_sayi = Integer.valueOf(ikinci_sayi_txt.getText());
                sonuc_txt.setText(String.valueOf((double) birinci_sayi / ikinci_sayi));
            }
        });
    }
}