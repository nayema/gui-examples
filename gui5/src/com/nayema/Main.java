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
        String[][] allData = new String[3][3];

        public TableData() {
            allData[0][0] = "1";
            allData[0][1] = "2";
            allData[0][2] = "3";
            allData[1][0] = "4";
            allData[1][1] = "5";
            allData[1][2] = "6";
            allData[2][0] = "7";
            allData[2][1] = "8";
            allData[2][2] = "9";
        }

        @Override
        public int getRowCount() {
            return allData.length;
        }

        @Override
        public int getColumnCount() {
            return allData[0].length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return allData[rowIndex][columnIndex];
        }
    }
}