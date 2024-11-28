import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SonucSayfasi extends JFrame {

    private JPanel panelMain2;
    private JButton cikis;

    public SonucSayfasi() {

        add(panelMain2);
        setSize(300, 100);
        setTitle("Dosya İndirme Programı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        cikis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
