import java.io.File;
import java.util.Scanner;

public class seta1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a file or directory path as a command line argument.");
            return;
        }

        File file = new File(args[0]);
        Scanner scanner = new Scanner(System.in);

        if (file.isDirectory()) {
            System.out.println("It is a directory. Listing contents:");
            String[] contents = file.list();
            int fileCount = 0;

            for (String item : contents) {
                System.out.println(item);
                File currentFile = new File(file, item);
                if (currentFile.isFile()) {
                    fileCount++;
                }
            }

            System.out.println("Total number of files: " + fileCount);
            System.out.print("Do you want to delete all .txt files in this directory? (yes/no): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                for (String item : contents) {
                    File currentFile = new File(file, item);
                    if (currentFile.isFile() && item.endsWith(".txt")) {
                        currentFile.delete();
                        System.out.println("Deleted: " + item);
                    }
                }
            }
        } else if (file.isFile()) {
            System.out.println("It is a file. File information:");
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("The specified path is neither a file nor a directory.");
        }

        scanner.close();
    }
}
