import javax.swing.*;
import javax.swing.plaf.basic.BasicToolBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

public class WebPage {

    private JButton tikla_butonu;
    private JPanel panelMain;
    private JTextField web_sayfasi;
    private int say = 0;


    public WebPage() {
        tikla_butonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // say++;
                // System.out.println("Butona " + say + " kez tıklandı.");

                String internet_adresi = web_sayfasi.getText().trim();
                if (!internet_adresi.startsWith("http://") && !internet_adresi.startsWith("https://")) {
                    internet_adresi = "https://" + internet_adresi;
                }

                Desktop d = Desktop.getDesktop();

                try {
                    d.browse(new URI(internet_adresi));
                } catch (IOException ex) {
                    System.out.printf("URL açılırken exception oluştu.");
                } catch (URISyntaxException ex) {
                    System.out.printf("URI Syntax Exception oluştu.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WebPage");
        frame.setContentPane(new WebPage().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
