package com.nayema;

import javax.swing.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileHelper {
    public static File openFile(JFrame frame) {
        JFileChooser openFile = new JFileChooser();
        openFile.showOpenDialog(frame);
        return openFile.getSelectedFile();
    }

    public static void saveFile(JFrame frame) {
        JFileChooser saveFile = new JFileChooser();
        saveFile.showSaveDialog(frame);
    }

    public static String readFile(File file) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(String contents, File file) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(contents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
