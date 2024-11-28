import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Locale;

public class RegisterEkrani extends JFrame {
    private JPanel panelRegister;
    private JPanel register_panel;
    private JTextField kullanici_adi_alani;
    private JPasswordField parola_alani;
    private JButton register;


    public RegisterEkrani() {

        add(panelRegister);
        setSize(350, 200);
        setTitle("Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanici_adi = kullanici_adi_alani.getText();
                String parola = new String(parola_alani.getPassword());

                ArrayList<User> user_list = AnaEkran.getUser_list();
                user_list.add(new User(kullanici_adi, parola));
                setVisible(false);
            }
        });
    }
}
