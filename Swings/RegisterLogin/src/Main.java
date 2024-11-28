import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnaEkran anaEkran = new AnaEkran();
                anaEkran.setVisible(true);
            }
        });

    }
}
