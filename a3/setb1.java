// import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Staff
 {
    String name, address;
}

class FullTimeStaff extends Staff
 {
    String department;
    double salary;

    public void accept( ) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name, address, department and salary: ");
        name = scanner.nextLine();
        address = scanner.nextLine();
        department = scanner.nextLine();
        salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

class PartTimeStaff extends Staff
 {
    int hours, rate;

    public void accept()
     {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name, address, No of working hours and rate per hour: ");
        name = scanner.nextLine();
        address = scanner.nextLine();
        hours = scanner.nextInt();
        rate = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("No of Working Hours: " + hours);
        System.out.println("Rate per hour: " + rate);
        System.out.println("----------------------");
    }
}

public class setb1 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Select Any One: ");
        System.out.println("1.Full Time Staff");
        System.out.println("2.Part Time Staff");
        int ch = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        switch (ch)
         {
            case 1:
                System.out.println("Enter the number of Full Time Staff: ");
                int n = sc.nextInt();
                
                FullTimeStaff l[]= new FullTimeStaff[n];
                for (i = 0; i < n; i++)
                 {
                    l[i] = new FullTimeStaff();
                    l[i].accept();
                }
                for (i = 0; i < n; i++)
                 {
                    l[i].display();
                }
                break;
            case 2:
                System.out.println("Enter the number of Part Time Staff: ");
                int m = sc.nextInt();
               
                PartTimeStaff h[] = new PartTimeStaff[m];
                for (i = 0; i < m; i++)
                 {
                    h[i] = new PartTimeStaff();
                    h[i].accept();
                }
                for (i = 0; i < m; i++)
                 {
                    h[i].display();
                }
                break;
        }
    }
}