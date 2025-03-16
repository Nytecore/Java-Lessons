import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TahminOyunu extends JFrame{
    private JPanel panelMain;
    private JTextField tahminYaziAlani;
    private JLabel tahminAlani;
    private JButton tahminEt;
    private JLabel uyari_yazisi;
    private JButton cikis_butonu;

    Random random = new Random();
    int sayi = random.nextInt(100);
    int denemeSayisi = 5;

    public TahminOyunu() {

        add(panelMain);
        setTitle("Tahmin Oyunu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame kutucuk = new JFrame();

        tahminEt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int donusenSayi = Integer.parseInt(tahminYaziAlani.getText());
                if (donusenSayi == sayi){
                    JOptionPane.showMessageDialog(null,"Tebrikler, kazandınız!!!!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.exit(1);

                }else if (donusenSayi < sayi){
                    uyari_yazisi.setText("Sayı daha büyük olmalı!");
                    denemeSayisi--;
                    JOptionPane.showMessageDialog(null,"Kalan deneme sayısı : " + denemeSayisi);
                    tahminYaziAlani.setText("");

                    if (denemeSayisi == 0){
                        JOptionPane.showMessageDialog(null,"Deneme hakkı kalmadı, program kapanıyor..." +
                                "\n\t\tSAYI : -- " + sayi + " --");
                        System.exit(1);
                    }


                } else {
                    uyari_yazisi.setText("Sayı daha küçük olmalı!");
                    tahminYaziAlani.setText("");
                    denemeSayisi--;
                    JOptionPane.showMessageDialog(null,"Kalan deneme sayısı : " + denemeSayisi);

                    if (denemeSayisi == 0){
                        JOptionPane.showMessageDialog(null,"Deneme hakkı kalmadı, program kapanıyor..." +
                                "\n\t\tSAYI : -- " + sayi + " --");
                        System.exit(1);

                    }
                }
            }
        });

        cikis_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }

    public static void main(String[] args) {

        TahminOyunu tahminOyunu = new TahminOyunu();
        tahminOyunu.setResizable(false);
        tahminOyunu.setFocusable(false);
        tahminOyunu.setSize(350 , 250);
        tahminOyunu.setLocationRelativeTo(null);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                tahminOyunu.setVisible(true);

            }
        });
    }
}