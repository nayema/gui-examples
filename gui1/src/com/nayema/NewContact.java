package com.nayema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class NewContact extends JFrame {
    private final static ArrayList<Contact> contactBook = new ArrayList<>();
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
                contactBook.add(new Contact(givenNamesTextField.getText(), surnameTextField.getText(),
                        mobileTextField.getText(), emailTextField.getText()));
                JOptionPane.showMessageDialog(null, "Given name is " + contactBook.get(0).getGivenNames(),
                        "Contact #1", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("New Contact");
        frame.setContentPane(new NewContact().newContactRootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}