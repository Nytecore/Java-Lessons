import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class Siparis extends JFrame {
    Map<String, Integer> siparisler = new LinkedHashMap<String, Integer>();

    private JPanel panelMain;
    private JCheckBox iskender;
    private JCheckBox urfa;
    private JCheckBox adana;
    private JCheckBox beyti;
    private JButton siparis_goster;
    private JLabel menu;
    private JLabel iskender_fiyat;
    private JLabel urfa_fiyat;
    private JLabel adana_fiyat;
    private JLabel beyti_fiyat;
    private JCheckBox ayran;
    private JCheckBox kola;
    private JCheckBox su;
    private JLabel ayran_fiyat;
    private JLabel kola_fiyat;
    private JLabel su_fiyat;

    public void siparisleriGoster() {

        String message = "";
        int tutar = 0;

        if (siparisler.isEmpty()) {
            message = "Siparişiniz Bulunmamaktadır.";
        } else {
            message += "Siparişler:\n";
            for (Map.Entry<String, Integer> entry : siparisler.entrySet()) {
                message += entry.getKey() + "\n";
                tutar += entry.getValue();
            }
            message += "Toplam Tutar : " + tutar;
        }

        JOptionPane.showMessageDialog(this, message);

    }

    public Siparis() {

        add(panelMain);
        setSize(300, 350);
        setTitle("Sipariş Uygulaması");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        siparis_goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (iskender.isSelected()) {
                    siparisler.put("İskender", 150);
                } else {
                    siparisler.remove("İskender");
                }
                if (urfa.isSelected()) {
                    siparisler.put("Urfa Kebap", 160);
                } else {
                    siparisler.remove("Urfa Kebap");
                }
                if (adana.isSelected()) {
                    siparisler.put("Adana kebap", 165);
                } else {
                    siparisler.remove("Adana Kebap");
                }
                if (beyti.isSelected()) {
                    siparisler.put("Beyti Kebap", 200);
                } else {
                    siparisler.remove("Beyti Kebap");
                }
                if (ayran.isSelected()) {
                    siparisler.put("Ayran", 20);
                } else {
                    siparisler.remove("Ayran");
                }
                if (kola.isSelected()) {
                    siparisler.put("Kola", 30);
                } else {
                    siparisler.remove("Kola");
                }
                if (su.isSelected()) {
                    siparisler.put("Su", 15);
                } else {
                    siparisler.remove("Su");
                }

                siparisleriGoster();
            }

        });
    }
}
