import fluent.*;
import fluent.colors.FluentColors;
import fluent.fonts.FluentFonts;

import javax.swing.*;
import java.awt.*;

public class DemoApp {
    public DemoApp() {
        Runnable mainFrame = () -> {
            JFrame newFrame = new FluentFrame(FluentColors.FRAME_BACKGROUND, "Default Frame");
            JPanel content = new JPanel(new FlowLayout());
            FluentPrimaryButton button = new FluentPrimaryButton("I agree");
            button.setPreferredSize(new Dimension(130, 32));
            button.setText("Nah");
            FluentButton button2 = new FluentButton("I don't");
            button2.setPreferredSize(new Dimension(130, 32));
            FluentTextField textField = new FluentTextField("");
            content.add(textField);
            content.add(button);
            content.add(button2);
            content.setBackground(FluentColors.FRAME_BACKGROUND);
            newFrame.add(content);
            newFrame.setSize(1200, 720);
            newFrame.setVisible(true);
        };
        SwingUtilities.invokeLater(mainFrame);
    }
}
