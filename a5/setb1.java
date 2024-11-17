import java.io.*;
import java.util.*;

class Item 
{
    String id, name;
    int qty;
    double price;

    Item(String id, String name, int qty, double price) 
    {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    double totalCost()
     {
        return qty * price;
    }

    @Override
    public String toString()
     {
        return String.format("ID: %s, Name: %s, Qty: %d, Price: %.2f, Total Cost: %.2f", id, name, qty, price, totalCost());
    }
}

public class setb1
 {
    private static final String FILE_NAME = "item.dat";

    public static void main(String[] args) throws IOException
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of records: ");
        int n =sc.nextInt();
        Item[] items = new Item[n];

        // Write records to file
        try
         (FileWriter fw = new FileWriter(FILE_NAME)) 
         {
            System.out.println("Enter Records:\n<id> <name> <qty> <price> :");
            for (int i = 0; i < n; i++) 
            {
                String[] record =sc.nextLine().split(" ");
                fw.write(String.join(" ", record) + "\n");
                items[i] = new Item(record[0], record[1], Integer.parseInt(record[2]), Double.parseDouble(record[3]));
            }
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Search for an item by name");
            System.out.println("2: Find costliest item");
            System.out.println("3: Display all items and total cost");
            System.out.println("4: Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice)
             {
                case 1:
                    System.out.print("Enter item name to search: ");
                    String searchName =sc.nextLine();
                    searchItemByName(items, searchName);
                    break;
                case 2:
                    findCostliestItem(items);
                    break;
                case 3:
                    displayAllItems(items);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 4);
    }

    private static void searchItemByName(Item[] items, String name)
     {
        for (Item item : items) {
            if (item.name.equalsIgnoreCase(name)) {
                System.out.println("Item found: " + item);
                return;
            }
        }
        System.out.println("No Records Found");
    }

    private static void findCostliestItem(Item[] items) {
        Item costliest = Arrays.stream(items).max(Comparator.comparingDouble(i -> i.price)).orElse(null);
        if (costliest != null) {
            System.out.println("Costliest Item: " + costliest);
        } else {
            System.out.println("No items available.");
        }
    }

    private static void displayAllItems(Item[] items) {
        double totalCost = 0;
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println(item);
            totalCost += item.totalCost();
        }
        System.out.printf("Total cost of all items: %.2f%n", totalCost);
    }
}