import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStringSearch {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length < 2) {
            System.out.println("Usage: java FileStringSearch [option] <string> <filename>");
            return;
        }

        String option = args[0];
        String searchString = args[1];
        String fileName = args[2];

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                boolean containsString = line.contains(searchString);

                // If no option is passed, print lines containing the string
                if (option.equals("")) {
                    if (containsString) {
                        System.out.println(line);
                    }
                }
                // If option -c is passed, count the lines containing the string
                else if (option.equals("-c")) {
                    if (containsString) {
                        count++;
                    }
                }
                // If option -v is passed, print lines not containing the string
                else if (option.equals("-v")) {
                    if (!containsString) {
                        System.out.println(line);
                    }
                }
            }

            // If option -c is passed, print the count of lines containing the string
            if (option.equals("-c")) {
                System.out.println("Count of lines containing \"" + searchString + "\": " + count);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
//To print all lines containing the string (no option    java FileStringSearch "<string>" <filename>
//To count lines containing the string:                   java FileStringSearch -c "<string>" <filename>
//To print all lines containing the word "Java":           java FileStringSearch "Java" example.txt