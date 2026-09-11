package Practical25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.print("Enter file name: ");
            String fileName = "myTestFile";

            FileReader fileReader = new FileReader(fileName + ".txt");
            BufferedReader reader = new BufferedReader(fileReader);

            System.out.println("\nFile Data:");
            System.out.println("----------------");

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
