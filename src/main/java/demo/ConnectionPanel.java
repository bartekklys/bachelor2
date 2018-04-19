package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectionPanel extends JPanel {

    private JLabel portLabel;
    private JComboBox comboBox;
    public static final String[] conn = {"COM3", "COM4", "COM5"};
    private JButton connectButton;

    public ConnectionPanel() {
        setLayout(new FlowLayout());

        portLabel = new JLabel("Port: ");
        add(portLabel);

        comboBox = new JComboBox();
        comboBox.setPreferredSize(new Dimension(120, 18));
        comboBox.setLightWeightPopupEnabled(true);
        for (int i = 0; i < conn.length; i++) {
            comboBox.addItem(conn[i]);
        }
        add(comboBox);

        connectButton = new JButton("Connect");
        connectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox.getSelectedItem());
            }
        });
        add(connectButton);
    }
}
