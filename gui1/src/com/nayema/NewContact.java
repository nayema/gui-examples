package com.nayema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class NewContact extends JFrame{
    private JPanel newContactRootPanel;
    private JPanel westLabelPanel;
    private JPanel eastTextFieldPanel;
    private JPanel southButtons;
    private JLabel givenNameLabel;
    private JLabel surnameLabel;
    private JLabel mobileLabel;
    private JLabel emailLabel;
    private JTextField givenNamesTextField;
    private JTextField surnameTextField;
    private JTextField mobileTextField;
    private JTextField emailTextField;
    private JButton addContactButton;
    private JButton noOp;
    private final static ArrayList<Contact> contactInfo = new ArrayList<>();

    public NewContact() {
        super("Contact Panel");
        givenNamesTextField.addActionListener(new ActionListener() { //Anonymous inner class
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        givenNamesTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        addContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}