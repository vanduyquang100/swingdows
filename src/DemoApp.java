import fluent.FluentFonts;
import fluent.FluentFrame;

import javax.swing.*;
import java.awt.*;

public class DemoApp {
    public DemoApp() {
        Runnable mainFrame = () -> {
            new FluentFonts();
            JFrame newFrame = new FluentFrame(Color.RED);
            newFrame.setSize(1200, 720);
            newFrame.setVisible(true);
        };
        SwingUtilities.invokeLater(mainFrame);
    }
}
