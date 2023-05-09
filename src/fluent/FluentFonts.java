package fluent;

import javax.swing.*;
import java.awt.*;

public class FluentFonts extends JComponent{
    public static Font DEFAULT_FONT = null;
    public static Font DEFAULT_FONT_BOLD = null;
    public static Font DISPLAY = null;
    public static Font TITLE_LARGE  = null;
    public static Font TITLE = null;
    public static Font SUBTITLE = null;
    public static Font BODY_LARGE = null;
    public static Font BODY_STRONG = null;
    public static Font BODY  = null;

    public FluentFonts() {
        setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
        DEFAULT_FONT = getFont().deriveFont(Font.PLAIN);
        DEFAULT_FONT_BOLD = DEFAULT_FONT.deriveFont(Font.BOLD);
        DISPLAY = DEFAULT_FONT.deriveFont(68f);
        TITLE_LARGE = DEFAULT_FONT.deriveFont(40f);
        TITLE = DEFAULT_FONT.deriveFont(28f);
        SUBTITLE = DEFAULT_FONT.deriveFont(20f);
        BODY_LARGE = DEFAULT_FONT.deriveFont(18f);
        BODY_STRONG = DEFAULT_FONT_BOLD.deriveFont(14f);
        BODY = DEFAULT_FONT.deriveFont(14f);
    }

    public static String truncateStringWithEllipsis(String text, int availableWidth, FontMetrics metrics) {
        String ellipsis = "...";
        int maxLength = text.length() - 1;
        while (metrics.stringWidth(text.substring(0, maxLength) + ellipsis) > availableWidth && maxLength > 0) {
            maxLength--;
        }
        return text.substring(0, maxLength) + ellipsis;
    }
}
