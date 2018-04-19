package demo;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JPanel {
    private JPanel mainPanel;
    private ConnectionPanel connectionPanel;
    private AnimationPanel animationPanel;
    private ControlPanel controlPanel;
    private JMenuItem fileMI;

    public App() {

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(createMenuBar(), BorderLayout.NORTH);

        connectionPanel = new ConnectionPanel();
        mainPanel.add(connectionPanel, BorderLayout.SOUTH);

        animationPanel = new AnimationPanel();

        mainPanel.add(animationPanel, BorderLayout.CENTER);

        controlPanel = new ControlPanel();

        mainPanel.add(controlPanel, BorderLayout.EAST);
    }

    private JMenuBar createMenuBar() {

        JPopupMenu.setDefaultLightWeightPopupEnabled(false);
        JMenuBar menuBar = new JMenuBar();

        JMenu file = menuBar.add(new JMenu("File"));
        fileMI = file.add(new JMenuItem("Exit"));
        fileMI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenu options = menuBar.add(new JMenu("Options"));
        // to be implemented

        return menuBar;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Stepper");
        frame.setContentPane(new App().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int FRAME_WIDTH = 800;
        int FRAME_HEIGHT = 600;
        frame.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(d.width / 2 - FRAME_WIDTH / 2, d.height / 2 - FRAME_HEIGHT
            / 2);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

}
