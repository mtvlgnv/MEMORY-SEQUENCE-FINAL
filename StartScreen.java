import javax.swing.*;
import java.awt.*;

public class StartScreen extends AbstractScreen {
    public StartScreen(GameFrame frame) {
        JLabel title = new JLabel("Sequence Memory");
        title.setFont(title.getFont().deriveFont(Font.BOLD, 28f));
        addRow(title, 0);

        JLabel lblMeme = new JLabel("🧠 Big Brain Time 🧠");
        lblMeme.setFont(lblMeme.getFont().deriveFont(Font.ITALIC, 16f));
        lblMeme.setForeground(new Color(80, 80, 80));
        addRow(lblMeme, 1);

        JButton start = new JButton("Start");
        start.addActionListener(e -> frame.showGame());
        addRow(start, 2);

        JButton settings = new JButton("Settings / Customization");
        settings.addActionListener(e -> frame.openSettings());
        addRow(settings, 3);

        JButton info = new JButton("Info");
        info.addActionListener(e -> frame.openInfo());
        addRow(info, 4);
    }
}
