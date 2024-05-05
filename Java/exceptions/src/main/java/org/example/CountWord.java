package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\GDSC\\Tasks\\exceptions\\Lincoln.txt.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int wordCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("[^a-zA-Z]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
            }
            System.out.println("No. of words : " + wordCount);
        } catch (IOException ex) {
            System.err.println("Error : " + ex.getMessage());
        }
    }
}
