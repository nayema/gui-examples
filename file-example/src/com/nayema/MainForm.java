package com.nayema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainForm {
    private JPanel mainPanel;
    private JButton loadButton;
    private JButton saveButton;
    private JTextField dataTextField;

    public MainForm() {
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataTextField.setText(FileHelper.loadFileContents());
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileHelper.saveFileContents(dataTextField.getText());
                } catch (IOException e1) {
                    dataTextField.setText("Error");
                }
            }
        });
    }

    public void buildGui() {
        JFrame frame = new JFrame("File Example");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
