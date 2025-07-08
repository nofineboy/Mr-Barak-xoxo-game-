import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class tictactoegame extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9];
    private boolean isPlayerOneTurn = true;
    private final String POLAR_BEAR = "\uD83D\uDC3B\u200D\u2744\uFE0F"; // 🐻‍❄️
    private final String FOX = "\uD83E\uDD8A";                         // 🦊
