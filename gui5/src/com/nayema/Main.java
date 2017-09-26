package com.nayema;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    private JPanel mainPanel;
    private JTable table1;

    public static void main(String[] args) {
        new Main().buildGui();
    }

    private void buildGui() {
        TableData data = new TableData();
        table1.setModel(data);

        JFrame frame = new JFrame("Table Example");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class TableData extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return 10;
        }

        @Override
        public int getColumnCount() {
            return 10;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return "Hello";
        }
    }
}