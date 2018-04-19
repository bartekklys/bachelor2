package demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlButtonsPanel extends JPanel {

    public final JButton startButton;
    public final JButton stopButton;

    public ControlButtonsPanel() {

        setLayout(new BoxLayout(this, 2));
        setSize(300, 100);

        startButton = new JButton("START");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (RadioPanel.radioButton1.isSelected()) {
                    System.out.println(RadioPanel.radioButton1.getText());
                } else {
                    System.out.println(RadioPanel.radioButton2.getText());
                }
                RadioPanel.radioButton1.setEnabled(false);
                RadioPanel.radioButton2.setEnabled(false);
                ControlPanel.directionBox.setEnabled(false);
                ControlPanel.slider.setEnabled(false);
                startButton.setEnabled(false);
                stopButton.setEnabled(true);
                System.out.println(ControlPanel.directionBox.getSelectedItem());
                System.out.println(ControlPanel.slider.getValue());
            }
        });
        add(startButton);
        stopButton = new JButton("STOP");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RadioPanel.radioButton1.setEnabled(true);
                RadioPanel.radioButton2.setEnabled(true);
                ControlPanel.directionBox.setEnabled(true);
                ControlPanel.slider.setEnabled(true);
                stopButton.setEnabled(false);
                startButton.setEnabled(true);
                System.out.println("STOP");
            }
        });
        add(stopButton);
    }
}
