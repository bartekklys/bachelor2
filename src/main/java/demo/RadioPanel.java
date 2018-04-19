package demo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioPanel extends JPanel {

    public static final JRadioButton radioButton1 = new JRadioButton("Both motors", true);
    public static final JRadioButton radioButton2 = new JRadioButton("One motor", false);
    private Font font = new Font("serif", Font.PLAIN, 12);

    public RadioPanel() {

        setLayout(new BoxLayout(this, 2));

        TitledBorder controlPanelBorder = new TitledBorder(new EtchedBorder());
        controlPanelBorder.setTitleFont(font);
        controlPanelBorder.setTitle("Select motor");
        setBorder(controlPanelBorder);

        radioButton1.setSelected(true);
        radioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radioButton2.setSelected(false);
                System.out.println("Radio button 1");
            }
        });
        add(radioButton1);
        radioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radioButton1.setSelected(false);
                System.out.println("Radio button 2");
            }
        });
        add(radioButton2);
    }
}
