package demo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AnimationPanel extends JPanel {

    private Font font = new Font("serif", Font.PLAIN, 12);

    public AnimationPanel() {
        TitledBorder connectoinPanelBorder = new TitledBorder(new EtchedBorder());
        connectoinPanelBorder.setTitleFont(font);
        connectoinPanelBorder.setTitle("Animation");
        setBorder(connectoinPanelBorder);
    }
}
