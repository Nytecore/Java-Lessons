import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;

class User {
    private String kullanici_adi;
    private String parola;

    public User(String kullanici_adi, String parola) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}


public class AnaEkran extends JFrame {

    private static ArrayList<User> user_list = new ArrayList<User>();

    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        AnaEkran.user_list = user_list;
    }

    private JPanel panelMain;
    private JButton login;
    private JTextField kullanici_adi_alani;
    private JPasswordField parola_alani;
    private JButton register;

    public AnaEkran() {

        add(panelMain);
        setTitle("Kullanıcı Girişi Uygulaması");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterEkrani registerEkrani = new RegisterEkrani();
                registerEkrani.setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanici_adi = kullanici_adi_alani.getText();
                String parola = new String(parola_alani.getPassword());

                if (user_list.size() == 0) {
                    JOptionPane.showMessageDialog
                            (AnaEkran.this, "Hiçbir kullanıcı bulunmamaktadır.");
                } else {
                    for (User user : user_list) {
                        if (user.getKullanici_adi().equals(kullanici_adi) && user.getParola().equals(parola)) {
                            JOptionPane.showMessageDialog
                                    (AnaEkran.this, "Hoşgeldiniz, " + kullanici_adi);
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog
                            (AnaEkran.this, "Böyle bir kullanıcı yoktur. Lütfen kayıt olunuz...");
                }

            }
        });
    }
}
