package demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButtonsPanel extends JPanel {

    public final JButton startButton;
    public final JButton stopButton;

    public ControlButtonsPanel() {
        startButton = new JButton();
        startButton.setText("START");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(ControlPanel.directionBox.getSelectedItem());
                System.out.println(ControlPanel.slider.getValue());
            }
        });
        add(startButton);
        stopButton = new JButton();
        stopButton.setText("STOP");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("STOP");
            }
        });
        add(stopButton);
    }
}
