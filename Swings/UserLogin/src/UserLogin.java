import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin extends JFrame {
    private JButton giris;
    private JTextField kullanici_adi_alani;
    private JPasswordField parola_alani;
    private JLabel k_adi;
    private JLabel password;
    private JPanel panelMain;

    public UserLogin() {

        add(panelMain);
        setSize(300, 200);
        setTitle("Basit Hesap Makinesi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        giris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanici_adi = kullanici_adi_alani.getText();
                String parola = new String(parola_alani.getPassword());
                String message;

                if (kullanici_adi.equals("Bora") && parola.equals("12345")) {
                    message = "Hoşgeldiniz!\n" + kullanici_adi;
                } else if (!kullanici_adi.equals("Bora") && parola.equals("12345")) {
                    message = "Kullanıcı adı hatalı.\n" + kullanici_adi;
                } else if (kullanici_adi.equals("Bora") && !parola.equals("12345")) {
                    message = "Kullanıcı adı hatalı.";
                } else {
                    message = "Kullanıcı adı ve parola hatalı!";
                }

                if (message.equals("Hoşgeldiniz!\n" + kullanici_adi)) {
                    JOptionPane.showMessageDialog(UserLogin.this, message);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(UserLogin.this, message);
                }
                kullanici_adi_alani.setText("");
                parola_alani.setText("");

            }
        });
    }
}
