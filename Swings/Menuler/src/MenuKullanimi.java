import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class MenuKullanimi extends JFrame {
    private JMenuBar menu_bar;
    private JPanel panelMain;
    private JMenu dosyaMenu;
    private JMenu duzenleMenu;
    private JMenu renk;
    private JMenu yaziTipi;
    private JMenu yaziSekli;
    private JMenuItem ac;
    private JMenuItem kaydet;
    private JMenuItem cikis;
    private JMenuItem renkDegistir;
    private JMenuItem arial;
    private JMenuItem timesNewRoman;
    private JMenuItem bold;
    private JMenuItem italik;

    private JTextArea yazi_alani;

    private void createUIComponents() {
        menu_bar = new JMenuBar();

        dosyaMenu = new JMenu();
        duzenleMenu = new JMenu();
        renk = new JMenu();
        yaziTipi = new JMenu();
        yaziSekli = new JMenu();

        ac = new JMenuItem();
        kaydet = new JMenuItem();
        cikis = new JMenuItem();
        renkDegistir = new JMenuItem();
        arial = new JMenuItem();
        timesNewRoman = new JMenuItem();
        bold = new JMenuItem();


        dosyaMenu = new JMenu("Dosya");
        duzenleMenu = new JMenu("Düzenle");

        ac = new JMenuItem("Aç");
        kaydet = new JMenuItem("Kaydet");
        cikis = new JMenuItem("Çıkış");

        renk = new JMenu("Renk");
        yaziTipi = new JMenu("Yazı Tipi");
        yaziSekli = new JMenu("Yazı Şekli");

        dosyaMenu.add(ac);
        dosyaMenu.add(kaydet);
        dosyaMenu.add(cikis);

        renkDegistir = new JMenuItem("Rengi Değiştir");
        arial = new JMenuItem("Arial");
        timesNewRoman = new JMenuItem("Times New Roman");
        bold = new JMenuItem("Kalın");
        italik = new JMenuItem("İtalik");

        duzenleMenu.add(renk).add(renkDegistir);
        duzenleMenu.add(yaziTipi).add(arial);
        duzenleMenu.add(yaziTipi).add(timesNewRoman);
        duzenleMenu.add(yaziSekli).add(bold);
        duzenleMenu.add(yaziSekli).add(italik);

        menu_bar.add(dosyaMenu);
        menu_bar.add(duzenleMenu);

    }

    public MenuKullanimi() {

        add(panelMain);
        setSize(450, 300);
        setTitle("Menu Kullanımı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser fc = new JFileChooser();
                // Yukarıdaki kod ile bir File Chooser açılmış olacak

                int i = fc.showOpenDialog(MenuKullanimi.this);
                // Yukarıdaki kod ile bir openDialog açılacak. Eğer OK basılırsa,
                // seçilen içerik "yazi_alani" referanslı "JTextArea"'ya gidecek.

                if (i == JFileChooser.APPROVE_OPTION) {
                    // Yani kullanıcı 'OK' basmışsa;
                    File file = fc.getSelectedFile();
                    try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
                        String icerik = "";
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

        kaydet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFileChooser fc = new JFileChooser();
                int cevap = fc.showSaveDialog(MenuKullanimi.this);

                if (cevap == JFileChooser.APPROVE_OPTION) {
                    // "Cevap 'OK' ise;

                    String dosya_yolu = fc.getSelectedFile().getPath();
                    // dosya_yolu referansında bir seçilen dosya yolu oluşumu açıyoruz bu:
                    // fc = FileChooser --> .getSelectedFile = seçilen dosya
                    // .getPath = seçilen dosyanın yolu (get = al)

                    try (FileWriter writer = new FileWriter(dosya_yolu)) {
                        // FileWriter oluşturuyoruz. Kaydetmemizi sağlayacak.
                        // Bu oluşumu Try with Resources içinde yapıyoruz.
                        // writer referansı oluşturuyoruz.

                        writer.write(yazi_alani.getText());
                        // yazi_alani(JTextArea) içerisindeki yazıların tamamını alıp seçilen
                        // içeriği başka bir yere yazıyoruz. (writer referansı ile)

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

        cikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        renkDegistir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(MenuKullanimi.this, "Bir renk seçiniz", Color.RED);
                yazi_alani.setForeground(color);
            }
        });

        arial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Arial", Font.PLAIN, 14);
                yazi_alani.setFont(font);
            }
        });

        timesNewRoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times New Roman", Font.PLAIN, 14);
                yazi_alani.setFont(font);
            }
        });

        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Kalın", Font.BOLD, 14);
                yazi_alani.setFont(font);
            }
        });

        italik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("İtalik", Font.ITALIC, 14);
                yazi_alani.setFont(font);
            }
        });

    }
}