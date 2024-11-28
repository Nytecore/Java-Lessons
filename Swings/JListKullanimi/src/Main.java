import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UseJList list = new UseJList();
                list.setVisible(true);

            }
        });
    }
}