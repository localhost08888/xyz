import java.io.*;
import java.util.*;

class Phone {
    String name, phno;

    Phone(String nm, String ph) {
        name = nm;
        phno = ph;
    }

    public String toString() {
        return name + " " + phno;
    }

    public static void search(Phone[] arr, String s) {
        for (Phone phone : arr) {
            if (phone.name.equalsIgnoreCase(s)) { // Case insensitive search
                System.out.println(phone);
                return;
            }
        }
        System.out.println("No Records Found");
    }
}

class SetA2 {
    public static void main(String args[]) throws IOException {
        File f = new File("phone.dat");
        RandomAccessFile rf = new RandomAccessFile(f, "rw");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of Customers");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Records:\n<name> <phone no> :");
        for (int i = 0; i < n; i++) {
            rf.writeBytes(sc.nextLine() + "\n");
        }
        rf.close();

        Phone[] p = new Phone[n];
        RandomAccessFile rf1 = new RandomAccessFile(f, "r");
        for (int i = 0; i < n; i++) {
            String[] data = rf1.readLine().split(" ");
            if (data.length >= 2) { // Ensure there are at least two elements
                p[i] = new Phone(data[0], data[1]);
            }
        }
        rf1.close();

        int ch;
        do {
            System.out.println("Menu :\n1: Search by name\n2: Add Record\n3: Exit\nEnter your Choice :");
            ch = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (ch) {
                case 1:
                    System.out.println("Enter name to be searched");
                    Phone.search(p, sc.nextLine());
                    break;
                case 2:
                    rf = new RandomAccessFile(f, "rw");
                    rf.seek(rf.length()); // Move to the end of the file to append
                    System.out.println("Enter Records:\n<name> <phone no> :");
                    rf.writeBytes(sc.nextLine() + "\n");
                    rf.close();
                    break;
                case 3:
                    System.exit(0);
            }
        } while (ch != 3);
    }
}