import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CalisanEkrani extends JDialog {

    DefaultTableModel model;
    CalisanIslemleri islemler = new CalisanIslemleri();

    private JTable calisan_tablosu;
    private JPanel calisanPaneli;
    private JTextField arama_cubugu;
    private JTextField ad_alani;
    private JTextField soyad_alani;
    private JTextField dept_alani;
    private JTextField maas_alani;
    private JLabel mesaj_yazisi;
    private JButton calisanekle;
    private JButton guncelle;
    private JButton sil;

    public void calisanGoruntule() {

        model.setRowCount(0);       // Öncelikle tablomuzu sıfırladık.

        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
        calisanlar = islemler.calisanlariGetir();

        if (calisanlar != null) {
            for (Calisan calisan : calisanlar) {
                Object[] eklenecek = {calisan.getId(), calisan.getAd(),
                        calisan.getSoyad(), calisan.getDepartman(), calisan.getMaas()};

                model.addRow(eklenecek);
            }
        }
    }

    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        calisan_tablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));

    }

    public CalisanEkrani() {

        add(calisanPaneli);
        setBounds(220, 60, 1000, 750);
        setTitle("Çalışan Tablosu");


        model = (DefaultTableModel) calisan_tablosu.getModel();
        String[] sutunlar = {"ID", "AD", "SOYAD", "DEPARTMAN", "MAAŞ"};
        model = new DefaultTableModel(sutunlar, 0);


        calisan_tablosu.setModel(model);
        calisanGoruntule();

        arama_cubugu.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String ara = arama_cubugu.getText();
                dinamikAra(ara);

            }
        });
        calisanekle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesaj_yazisi.setText("");

                String ad = ad_alani.getText();
                String soyad = soyad_alani.getText();
                String departman = dept_alani.getText();
                String maas = maas_alani.getText();

                islemler.calisanEkle(ad, soyad, departman, maas);
                calisanGoruntule();
                mesaj_yazisi.setText("Yeni çalışan eklendi...");
            }
        });
        calisan_tablosu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int selectedrow = calisan_tablosu.getSelectedRow();
                ad_alani.setText(model.getValueAt(selectedrow, 1).toString());
                soyad_alani.setText(model.getValueAt(selectedrow, 2).toString());
                dept_alani.setText(model.getValueAt(selectedrow, 3).toString());
                maas_alani.setText(model.getValueAt(selectedrow, 4).toString());

            }
        });
        guncelle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ad = ad_alani.getText();
                String soyad = soyad_alani.getText();
                String departman = dept_alani.getText();
                String maas = maas_alani.getText();

                int selectedrow = calisan_tablosu.getSelectedRow();
                // hangisini seçtiğimizi alma alanı

                if (selectedrow == -1) {
                    if (model.getRowCount() == 0) {
                        mesaj_yazisi.setText("Çalışanlar tablosu şu anda boş..");

                    } else {
                        mesaj_yazisi.setText("Lütfen güncellemek istediğiniz çalışanı seçiniz..");

                    }
                } else {

                    int id = (int) model.getValueAt(selectedrow, 0);
                    islemler.calisanGuncelle(id, ad, soyad, departman, maas);

                    calisanGoruntule();
                    mesaj_yazisi.setText("Çalılşan başarıyla güncellendi.");

                }

            }
        });
        sil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mesaj_yazisi.setText("");
                int selectedrow = calisan_tablosu.getSelectedRow();
                // Nerenin seçildiğini alıyoruz.

                if (selectedrow == -1) {
                    if (model.getRowCount() == 0) {
                        mesaj_yazisi.setText("Çalışan tablosu şu anda boş..");

                    } else {
                        mesaj_yazisi.setText("Lütfen silinecek bir çalışan seçiniz..");
                    }

                } else {
                    int id = (int) model.getValueAt(selectedrow, 0);
                    // Burada ID' yi almış olduk.

                    islemler.calisanSil(id);
                    calisanGoruntule();
                    mesaj_yazisi.setText("Çalışan başarıyla silindi..");

                }
            }
        });
    }
}