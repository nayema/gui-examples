package com.nayema;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
        int[][] allData;

        public TableData() {
            try {
                loadFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        private void loadFile() throws IOException {
            FileReader file = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;
            int r = 0;
            while ((line = reader.readLine()) != null) {
                String[] fileLine = line.split("\\s+");
                if (allData == null) {
                    allData = new int[fileLine.length][fileLine.length];
                }
                for (int c = 0; c < fileLine.length; c++) {
                    int iData = Integer.parseInt(fileLine[c]);
                    allData[r][c] = iData;
                }
                r++;
            }
            reader.close();
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