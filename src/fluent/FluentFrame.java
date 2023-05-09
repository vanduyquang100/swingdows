package fluent;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class FluentFrame extends JFrame {
    public FluentFrame(Color backgroundColor) {
        super("");
        setIconImage(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
        this.getContentPane().setBackground(backgroundColor);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel content = new JPanel(new FlowLayout());
        FluentButton button = new FluentButton("I agree");
        button.setPreferredSize(new Dimension(130, 32));
        button.setText("Nah");
        FluentTextField textField = new FluentTextField("");
        content.add(textField);
        content.add(button);
        this.add(content);
    }
}
