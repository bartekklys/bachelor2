package demo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ControlPanel extends JPanel implements ChangeListener {

    public final RadioPanel radioPanel;
    public final ControlButtonsPanel controlButtonsPanel;
    public static final JComboBox directionBox = new JComboBox();
    public static final String[] motorDirections = {"Clockwise", "Anticlockwise"};
    public static final JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 10, 0);
    private Font font = new Font("serif", Font.PLAIN, 12);

    public ControlPanel() {

        setLayout(new BoxLayout(this, 3));

        TitledBorder controlPanelBorder = new TitledBorder(new EtchedBorder());
        controlPanelBorder.setTitleFont(font);
        controlPanelBorder.setTitle("Control panel");
        setBorder(controlPanelBorder);

        radioPanel = new RadioPanel();
        add(radioPanel);

        directionBox.setLightWeightPopupEnabled(true);
        directionBox.setFont(font);
        directionBox.setMaximumSize(new Dimension(250, 50));
        for (int i = 0; i < motorDirections.length; i++) {
            directionBox.addItem(motorDirections[i]);
        }
        TitledBorder titledBorder1 = new TitledBorder(new EtchedBorder());
        titledBorder1.setTitleFont(font);
        titledBorder1.setTitle("Motor direction");
        directionBox.setBorder(titledBorder1);
        add(directionBox);

        slider.setMajorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        TitledBorder tb = new TitledBorder(new EtchedBorder());
        tb.setTitleFont(font);
        tb.setTitle("Speed = 0");
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
        tb.setTitle("Speed = " + String.valueOf(value));
        slider.repaint();
    }
}
