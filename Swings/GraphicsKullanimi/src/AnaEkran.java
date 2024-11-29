import javax.swing.*;
import java.awt.*;

public class AnaEkran extends JFrame {

    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {

        GrafikKullanimi grafik = new GrafikKullanimi();

        AnaEkran ekran = new AnaEkran("Graphics Kullanımı");

        ekran.setVisible(true);
        ekran.setResizable(true);
        ekran.setSize(800,600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ekran.add(grafik);
    }
}
