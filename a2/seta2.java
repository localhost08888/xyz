import java.util.Scanner;

public class seta2
 {
    int rollno;
    String name;
    double percentage;
    static int count;

    // Default constructor
    seta2() 
    {
        rollno = 0;
        name = "";
        percentage = 0.0d;
        count++;
    }

    // Parameterized constructor
    seta2(int rollno, String name, double percentage) 
    {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        count++;
    }

    // Static method to print the count of created objects
    public static void countprint()
     {
        System.out.println("Object count is " + count);
    }

    // Method to accept student details
    public void accept()
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollno = sc.nextInt();  // Fixed variable name
        
        System.out.print("Enter name: ");
        name = sc.next();  // Read name

        System.out.print("Enter percentage: ");
        percentage = sc.nextDouble();  // Fixed to assign to instance variable
    }

    // Method to display student details
    public void display() 
    {
        System.out.println("Roll number - " + rollno);
        System.out.println("Name - " + name);
        System.out.println("Percentage - " + percentage);
    }

    // Method for getting percentage separately
    public double getper() 
    {
        return percentage;
    }

    // Static method to sort students by percentage (Bubble Sort)
    public static void sortStudent(seta2 s[], int n)
     {
        for (int i = 0; i < n - 1; i++)
         {
            for (int j = 0; j < n - 1 - i; j++)
             {
                if (s[j].getper() < s[j + 1].getper())
                 {
                    seta2 temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        System.out.println("\nStudents after sorting by percentage:");
        for (int i = 0; i < n; i++)
         {
            s[i].display();
            System.out.println(); // To add space between students' details
        }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        seta2[] x = new seta2[n];

        // Accept details for each student
        for (int i = 0; i < n; i++)
         {
            x[i] = new seta2(); // Creating student object
            x[i].accept();
        }

        seta2.countprint(); // Display the total count of students
        seta2.sortStudent(x, n); // Sort and display students by percentage
        
    }
}