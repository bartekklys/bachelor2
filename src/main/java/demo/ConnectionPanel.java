package demo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConnectionPanel extends JPanel {

    private JLabel portLabel;
    private JComboBox comboBox;
    public static final String[] conn = {"COM3", "COM4", "COM5"};
    private JButton connectButton;
    private Font font = new Font("serif", Font.PLAIN, 12);

    public ConnectionPanel() {
        setLayout(new FlowLayout());

        TitledBorder connectoinPanelBorder = new TitledBorder(new EtchedBorder());
        connectoinPanelBorder.setTitleFont(font);
        connectoinPanelBorder.setTitle("Connect");
        setBorder(connectoinPanelBorder);

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
