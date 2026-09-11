package Practical24;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            // Create a file and write data
            FileWriter writer = new FileWriter("myTestFile.txt");

            writer.write("Personal Details\n");
            writer.write("----------------\n");
            writer.write("Name: Darshan\n");
            writer.write("Age: 21\n");
            writer.write("City: Ahmedabad\n");
            writer.write("Email: darshan@balani.com\n");

            // Close the file
            writer.close();

            System.out.println("File created successfully.");
            System.out.println("Personal details added to myTestFile.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}