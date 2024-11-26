import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stok extends JFrame {


    private JPanel panelMain;
    private JTextField tf_urun_ismi;
    private JComboBox cb_kategori;
    private JTextField tf_fiyat;
    private JLabel mesaj_yazisi;
    private JTable urun_tablosu;
    private JButton ekle_butonu;

    public Stok() {

        add(panelMain);
        setSize(500, 400);
        setTitle("Stok Programı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Ürün Adı", "Kategori", "Fiyat"};
        Object[][] data = {
                {"ÜRÜN ADI", "KATEGORİ", "FİYAT"}
        };
        urun_tablosu.setModel(new DefaultTableModel(data, columnNames));

        ekle_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesaj_yazisi.setText("");
                DefaultTableModel model = (DefaultTableModel) urun_tablosu.getModel();

                if (tf_urun_ismi.getText().trim().equals("")) {
                    mesaj_yazisi.setText("Ürün ismi boş bırakılamaz...");
                } else {
                    Object[] eklenecek = {tf_urun_ismi.getText(), cb_kategori.getSelectedItem().toString(), tf_fiyat.getText()};
                    model.addRow(eklenecek);
                }
            }
        });
    }
}
