import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Stok extends JFrame {

    private JPanel panelMain;
    private JTextField tf_urun_ismi;
    private JComboBox cb_kategori;
    private JTextField tf_fiyat;
    private JLabel mesaj_yazisi_kirmizi;
    private JTable urun_tablosu;
    private JButton ekle_butonu;
    private JButton guncelle_butonu;
    private JButton silme_butonu;
    private JLabel mesaj_yazisi_yesil;

    public Stok() {

        // Panel görünür kılmak için add metodu ile eklendi.
        add(panelMain);

        // setSize metodu ile pencere boyutu ayarlandı.
        setSize(700, 700);

        // Pencere adı eklendi.
        setTitle("Stok Programı");

        // program kapatılınca, program çalışmayı durdurması için kod yazıldı.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTable ve JScrollPane eklenmişti. Aşağıda Tablonun en başında
        // yazacak olan sütun isimleri belirlenmesi için kodlandı.
        String[] sutunlar = {"Ürün İsmi", "Kategori", "Fiyat"};

        // Tabloyu görünür kılmak için aşağıda bir Default Table Model atandı.
        DefaultTableModel model = new DefaultTableModel(sutunlar, 0);

        // sonrasında da tabloyu .form dosyasındaki "urun_tablosu"'nun olacağı gösterildi.
        urun_tablosu.setModel(model);

        // .form üzerinden CreateListener > ActionListener yapıldığında burası gelir
        // Burada butona tıklayınca ne yapılması gerektiğinin kodlaması yapılır.
        ekle_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesaj_yazisi_kirmizi.setText("");
                mesaj_yazisi_yesil.setText("");
                // Yukarıda "mesaj_yazisi_kirmizi" olarak eklenen JLable, default olarak boş gelecek. Bu belirtildi.
                // Yukarıda "mesaj_yazisi_yesil" olarak eklenen JLable, default olarak boş gelecek. Bu belirtildi.
                // Kırmızı JLable hata mesajlarını, yeşil ise olumlu mesajları gösterecektir.

                if (tf_urun_ismi.getText().trim().equals("")) {
                    mesaj_yazisi_kirmizi.setText("Ürün ismi boş bırakılamaz...");
                    // "tf_urun_ismi" referansındaki textfield, Ürün adını gireceğimiz
                    // alandır. Bursıa boş kalırsa "Ürün ismi boş bırakılamaz.." uyarısı
                    // JLable içine gönderilecektir.

                } else if (tf_fiyat.getText().trim().equals("")) {
                    mesaj_yazisi_kirmizi.setText("Ürün fiyatı boş bırakılamaz...");
                    // "tf_fiyat" referansındaki textfield, Ürün fiyatını gireceğimiz
                    // alandır. Burası boş kalırsa "Ürün ismi boş bırakılamaz.." uyarısı
                    // JLable içine gönderilecektir.

                } else if (cb_kategori.getSelectedItem().equals("Seçiniz...")) {
                    mesaj_yazisi_kirmizi.setText("Kategori alanı boş bırakılamaz...");
                    // "cb_kategori" referansındaki JComboBox, Ürün kategorisini gireceğimiz
                    // alandır. Burası "Seçiniz..." olarak seçilirse boş kalmış olacaktır.
                    // Bu durumda "Ürün ismi boş bırakılamaz.." uyarısı JLable içine gönderilecektir.

                } else {
                    Object[] eklenecek = {
                            tf_urun_ismi.getText(),
                            cb_kategori.getSelectedItem().toString(),
                            tf_fiyat.getText()
                            // Her koşul sağlandıysa, alanlar boş değilse, else bloğu devreye girer.
                            // Bu durumda da "eklenecek" referansında bir "Object[]" arrayi oluşturulur.
                            // Array içerisine de yazılan ürün ismi, "tf_urun_ismi.getText()" metodu ile,
                            // kategorisi, "cb_kategori.getSelectedItem()" metodu ile ve fiyatı da
                            // "tf_fiyat.getText()" metodu ile alınarak bu array içerisine eklenir.
                    };
                    model.addRow(eklenecek);
                    mesaj_yazisi_yesil.setText("Ürün başarıyla eklenmiştir...");

                    // Sonra da model.addRow metodu ile tukarıda alınan array içindeki bilgiler tablo alanına
                    // Girilen sıra ile eklenir ve kullanıcı tarafından eklenen verileri içerek Object[] array
                    // model.addrow metodu içerisine referansı ile gönderilir. "odel.addRow(eklenecek)".
                }
            }
        });

        // Aşağıdaki alanda, bir diğer buton olan "guncelle_butonu" butonunu oluşturduk ve
        // bu butona özellik kazandırdığıız alandır. Bu buton, girilen değerleri değştirmemizi
        // yani güncelleştirmemizi sağlayacaktır.
        guncelle_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesaj_yazisi_kirmizi.setText("");
                mesaj_yazisi_yesil.setText("");
                // Yukarıda "mesaj_yazisi_kirmizi" olarak eklenen JLable, default olarak boş gelecek. Bu belirtildi.
                // Yukarıda "mesaj_yazisi_yesil" olarak eklenen JLable, default olarak boş gelecek. Bu belirtildi.
                // Kırmızı JLable hata mesajlarını, yeşil ise olumlu mesajları gösterecektir.

                int secili_row = urun_tablosu.getSelectedRow();
                // "secili_row" referansında bir integer değer oluşturuldu ve "uruntablosu.getSelectedRow()"
                // metodu ile seçilen satırın (0-1-2) hangi satır olduğu değer, integer'a gönderildi.

                if (secili_row == -1) {
                    // "secili_row" olarak oluşturulan integer değer, hiç bir şey
                    // seçilmediğinde "-1" değer verir yani seçilmediğini ifade eder.

                    if (urun_tablosu.getRowCount() == 0) {
                        mesaj_yazisi_kirmizi.setText("Ürün tablosu şu anda boş...");
                        // Ya da, "urun_tablosu" referansındaki JTable'ın içerisinde hiç
                        // satır yoksa (.getRowCount() == 0") tablonun boş olduğunu söyler.
                        // Tablo boşsa "Ürün tablosu şu anda boş..." uyarısı JLable'a gönderilir.

                    } else {
                        mesaj_yazisi_kirmizi.setText("Güncellemek istediğiniz ürünü seçiniz...");
                        // Eğer ürün seçilmesiyle ve "-1" değer verildiyse o zaman da JLable
                        // alanına "Güncellemek istediğiniz ürünü seçiniz..." uyarısı gidecektir.
                    }

                } else {
                    model.setValueAt(tf_urun_ismi.getText(), secili_row, 0);
                    model.setValueAt(cb_kategori.getSelectedItem().toString(), secili_row, 1);
                    model.setValueAt(tf_fiyat.getText(), secili_row, 2);
                    // Diğer durumlarda (else bloğunda) yani diğer koşullar sağlanmıyorsa;
                    // buradaki "model" = bizim tablomuz. ".setValueAt()" metodu da değeri tekrar
                    // güncelle yani ekle anlamına gelir. İçerisine de eklenecek olan alanın
                    // ne olduğu girilir yani, 3 sütun olduğundan, sütun değerleri yazılır yani;
                    // "tf_urun_ismi" = Ürün ismi text alanı, ".getText()" bu alana girilen değer.
                    // "secili_row" = yukarıda tıklanıp seçilen satırın integer olarak gönderilen veri tipi.
                    // "tf_fiyat" = Ürün fiyatı text alanı, ".getText()" bu alana girilen değer.
                    // sonrasında da 3. alana, hangi sütunda olduğu yazılır. 0 = 1. sütunu ifade eder.


                    mesaj_yazisi_yesil.setText("Ürün başarıyla güncellendi...");
                    // sonrasında da güncelleme işlemi yapılmış olur ve JLabel (mesaj alanı)'a
                    // "Ürün başarıyla güncellendi..." mesajı başarıyla güncelleme yapıldıktan sonra
                    // gönderilir.
                }
            }
        });

        // Aşağıdaki alanda yeni bir tıklama işlemleri yapılacaktır. (mouseClicked)
        // JTable üzerinde CreateListener > MouseListener > Click
        // Aşağıda yapılan işlem ile tabloda oluşturulan ürünler seçildiğinde
        // JTextField alanları ve JComboBox güncellenecek ve seçili olan değerler
        // Direkt olarak o alana yazılmış olacaktır.
        urun_tablosu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int secili_row = urun_tablosu.getSelectedRow();
                // Yukarıdaki işlem ile bir integer veri tipi yaratıldı ve tablodan dönen
                // seçilen satır numarası, "secili_row" referansına atandı.

                tf_urun_ismi.setText(model.getValueAt(secili_row, 0).toString());
                cb_kategori.setSelectedItem(model.getValueAt(secili_row, 1).toString());
                tf_fiyat.setText(model.getValueAt(secili_row, 2).toString());
                // Yukarıda yapılan işlemde; sırasıyla :
                // Ürün adı, kategorisi ve fiyatı setText ve setSelectedItem metodları ile alınarak
                // girdi yapılan alanlardaki kutucukların içlerine eklendi. Seçilen değerlerin ne
                // olduğu da metodun içine yazılan formül ile belirlendi. Örneğin:
                // "model.getValueAt(secili_row, 0).toString()" bu formül şu demek: model(tablo)
                // içerisindeki değerlerden olan (.getValueAt), secili_row ile tıklanan satırın
                // indexinden dönen int değeri, sütun numarası (column 0-1-2) ve bu obje olduğundan
                // bu objenin de String değerden döndürülmesi (.toString())" şeklinde. Bu sayede
                // tıkladığımızın ne olduğu alınarak, yukarıdaki doldurulma alanlarına yerleştirilecek.
            }
        });

        // Aşağıdaki alanda yeni bir butonun işlevi işlemleri yapılacaktır.
        // Silme butonu eklendi ve sonrasında CreateListener > ActionListener yapıldı.
        silme_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesaj_yazisi_kirmizi.setText("");
                mesaj_yazisi_yesil.setText("");
                // Yukarıda "mesaj_yazisi_kirmizi" olarak eklenen JLable, default olarak boş gelecek. Bu belirtildi.
                // Yukarıda "mesaj_yazisi_yesil" olarak eklenen JLable, default olarak boş gelecek. Bu belirtildi.
                // Kırmızı JLable hata mesajlarını, yeşil ise olumlu mesajları gösterecektir.

                int secili_row = urun_tablosu.getSelectedRow();
                // "secili_row" referansında bir integer değer oluşturuldu ve "uruntablosu.getSelectedRow()"
                // metodu ile seçilen satırın (0-1-2) hangi satır olduğu değer, integer'a gönderildi.

                if (secili_row == -1) {
                    // "secili_row" olarak oluşturulan integer değer, hiç bir şey
                    // seçilmediğinde "-1" değer verir yani seçilmediğini ifade eder.

                    if (urun_tablosu.getRowCount() == 0) {
                        mesaj_yazisi_kirmizi.setText("Ürün tablosu şu anda boş...");
                        // Ya da, "urun_tablosu" referansındaki JTable'ın içerisinde hiç
                        // satır yoksa (.getRowCount() == 0") tablonun boş olduğunu söyler.
                        // Tablo boşsa "Ürün tablosu şu anda boş..." uyarısı JLable'a gönderilir.

                    } else {
                        mesaj_yazisi_kirmizi.setText("Lütfen bir ürün seçiniz...");
                        // Eğer ürün seçilmesiyle ve "-1" değer verildiyse o zaman da JLable
                        // alanına "Güncellemek istediğiniz ürünü seçiniz..." uyarısı gidecektir.

                    }
                } else {
                    model.removeRow(secili_row);
                    // Yukarıdaki koşullara girilmediği taktirde (her şey yolunda gittiğinde) ise;
                    // "model" ile belirlenen = JTable, ".removeRow()" metodu ile (satır sil) içerisine
                    // yukarda oluşturulan ve seçildiğinde "secili_row" içerisine seçilen satırın indexini
                    // gönderen integer değer girildi. Sonuç olarak da seçilen index değeri secili_row'a
                    // eşitlendi. "secili_row" 'da "mode.removeRow()" fonksiyonu içerisine gönderildi ve
                    // seçileni sil durumu uygulandı. Butona basıldığında seçilen satır silinecektir.

                    mesaj_yazisi_yesil.setText("Ürün başarıyla silindi...");
                    // Sonrasında da yukarıdaki fonksiyon ile "mesaj_yasizi_yesil" fonksiyonu ile oluşturulan
                    // JLable alanına "Ürün başarıyla silindi..." uyarısı gönderilecektir.
                }
            }
        });
    }
}