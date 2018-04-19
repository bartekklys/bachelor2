import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel mainPanel;
    private JPanel animationPanel;
    private JPanel controlPanel;

    public App() {

        EmptyBorder eb = new EmptyBorder(5, 0, 5, 0);
        BevelBorder bb = new BevelBorder(BevelBorder.LOWERED);
        animationPanel.setBorder(new CompoundBorder(eb, bb));
        controlPanel.setBorder(new CompoundBorder(eb, bb));

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
