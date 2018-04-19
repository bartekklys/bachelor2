package demo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ControlPanel extends JPanel implements ChangeListener {

    public final ControlButtonsPanel controlButtonsPanel;
    public static final JComboBox directionBox = new JComboBox();
    public static final String[] motorDirections = {"Clockwise", "Anticlockwise"};
    public static final JSlider slider = new JSlider(0, 10, 5);
    private Font font = new Font("serif", Font.PLAIN, 12);

    public ControlPanel() {

        setLayout(new BoxLayout(this, 3));

        directionBox.setLightWeightPopupEnabled(true);
        directionBox.setFont(font);
        for (int i = 0; i < motorDirections.length; i++) {
            directionBox.addItem(motorDirections[i]);
        }
        TitledBorder titledBorder1 = new TitledBorder(new EtchedBorder());
        titledBorder1.setTitleFont(font);
        titledBorder1.setTitle("Motor direction");
        directionBox.setBorder(titledBorder1);
        add(directionBox);

//        slider = new JSlider(0, 10, 5);
        slider.setMajorTickSpacing(1);
        slider.setPaintLabels(true);
        TitledBorder tb = new TitledBorder(new EtchedBorder());
        tb.setTitleFont(font);
        tb.setTitle("Current value = 0");
        slider.setBorder(tb);
        add(slider);

        controlButtonsPanel = new ControlButtonsPanel();
        TitledBorder titledBorder2 = new TitledBorder(new EtchedBorder());
        titledBorder2.setTitleFont(font);
        titledBorder2.setTitle("Control buttons");
        controlButtonsPanel.setBorder(titledBorder2);
        add(controlButtonsPanel);
    }

    public void stateChanged(ChangeEvent e) {
        int value = slider.getValue();
        TitledBorder tb = (TitledBorder) slider.getBorder();
        tb.setTitle("Current value = " + String.valueOf(value));
        slider.repaint();
    }
}
