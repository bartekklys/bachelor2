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
    private JButton disconnectButton;
    private JLabel connectionStatus;
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
                connectionStatus.setText("Connected");
                connectionStatus.setForeground(Color.GREEN);
                connectButton.setEnabled(false);
                disconnectButton.setEnabled(true);
                System.out.println(comboBox.getSelectedItem());
            }
        });
        add(connectButton);

        disconnectButton = new JButton("Disconnect");
        disconnectButton.setEnabled(false);
        disconnectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                connectionStatus.setText("Disconnected");
                connectionStatus.setForeground(Color.RED);
                connectButton.setEnabled(true);
                disconnectButton.setEnabled(false);
            }
        });
        add(disconnectButton);

        connectionStatus = new JLabel("Not connected.");
        connectionStatus.setOpaque(true);
        connectionStatus.setBackground(Color.BLACK);
        connectionStatus.setForeground(Color.RED);
        add(connectionStatus);

    }
}
