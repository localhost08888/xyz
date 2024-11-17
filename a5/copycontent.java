import java.io.*;
import java.nio.file.*;

public class FileCopyWithComments {
    public static void main(String[] args) {
        // Accept two file names as input
        if (args.length < 2) {
            System.out.println("Usage: java FileCopyWithComments <source_file> <destination_file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        // Author name and date
        String authorName = "Author: Your Name"; // Replace "Your Name" with your actual name
        String date = "Date: " + java.time.LocalDate.now();

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            // Write comments at the beginning of the file
            writer.write("// " + authorName);
            writer.newLine();
            writer.write("// " + date);
            writer.newLine();
            writer.write("// File content begins below:");
            writer.newLine();

            // Copy contents from the source file to the destination file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Add end of file comment
            writer.write("// End of file");
            writer.newLine();

            System.out.println("File copied successfully with comments added.");
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
//Run the program, providing the source file and destination file as arguments:  -----java FileCopyWithComments source.txt destination.txt
 
//