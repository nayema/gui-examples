package com.nayema;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {
    private JPanel panel1;
    private JLabel label1;
    private JButton clickMeButton;

    public HelloWorld() {
        clickMeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label1.setText("I Love You.");
                System.out.println("Button Clicked.");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World");
        frame.setContentPane(new HelloWorld().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
