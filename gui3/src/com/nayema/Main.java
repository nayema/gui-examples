package com.nayema;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
    private static JButton button;
    private static JLabel label;
    private static JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        label = new JLabel();
        label.setText("Message will appear here.");

        button = new JButton();
        button.setText("Click Me!");
        button.setToolTipText("Click the button.");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label.setText("I Love You.");
            }
        });

        panel.add(label);
        panel.add(button);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
