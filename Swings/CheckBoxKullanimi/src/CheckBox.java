import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class CheckBox extends JFrame {

    Set<String> set = new LinkedHashSet<String>();

    private JCheckBox java_check;
    private JCheckBox python_check;
    private JCheckBox c_check;
    private JButton goster;
    private JLabel diller_alani;
    private JPanel panelMain;
    private JCheckBox kotlin_check;


    public void labelDegistir() {

        String yazi = "Şu diller seçildi : ";
        for (String dil : set) {
            yazi += dil + " ";
        }

        diller_alani.setText(yazi);

    }

    public CheckBox() {

        add(panelMain);
        setSize(400, 300);
        setTitle("Checkbox Kullanımı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (java_check.isSelected()) {
                    set.add("Java");
                } else {
                    set.remove("Java");
                }
                if (python_check.isSelected()) {
                    set.add("Python");
                } else {
                    set.remove("Python");
                }
                if (c_check.isSelected()) {
                    set.add("C++");
                } else {
                    set.remove("C++");
                }
                if (kotlin_check.isSelected()) {
                    set.add("Kotlin");
                } else {
                    set.remove("Kotlin");
                }

                labelDegistir();
            }
        });
    }
}
