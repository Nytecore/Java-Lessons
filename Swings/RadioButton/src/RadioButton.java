import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashSet;
import java.util.Set;

public class RadioButton extends JFrame {

    Set<String> diller = new LinkedHashSet<String>();

    private JRadioButton java_radio;
    private JRadioButton python_radio;
    private JRadioButton php_radio;
    private JButton dil_goster;
    private JPanel panelMain;

    public void goster() {

        String message = "Seçilen dil : ";
        for (String dil : diller) {
            message += dil + " ";
        }
        JOptionPane.showMessageDialog(this, message);
    }

    public RadioButton() {

        add(panelMain);
        setSize(300, 400);
        setTitle("Programlama Dilleri");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dil_goster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (java_radio.isSelected()) {
                    diller.add("Java");
                } else {
                    diller.remove("Java");
                }
                if (python_radio.isSelected()) {
                    diller.add("Python");
                } else {
                    diller.remove("Python");
                }
                if (php_radio.isSelected()) {
                    diller.add("Php");
                } else {
                    diller.remove("Php");
                }
                goster();
            }
        });
    }
}
