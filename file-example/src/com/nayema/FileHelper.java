package com.nayema;

import java.io.*;

public class FileHelper {
    public static String loadFileContents() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/Nayema/Development/examples/file-example/data/data.txt"))) {
            return reader.readLine();
        } catch (IOException e) {
            return "Error";
        }
    }

    public static void saveFileContents(String contents) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/Nayema/Development/examples/file-example/data/data.txt"))) {
            writer.write(contents);
        } catch (IOException e) {
            throw e;
        }
    }
}
