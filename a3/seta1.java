import java.util.Scanner;

 class employee 
 {
    private int id;
    private String name, dept;
    private double salary;
    
    // Default constructor
    employee() 
    {
        id = 0;
        name = "";
        dept = "";
        salary = 0.0;
    }
    
    // Parameterized constructor
    employee(int id, String name, String dept, double salary)
     {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    
    // Method to accept employee details
    public void accept() 
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter id-");
        id = x.nextInt();
        x.nextLine();  // To consume the newline character after nextInt()
        System.out.println("Enter employee name-");
        name = x.nextLine();

        System.out.println("Enter employee department-");
        dept = x.nextLine();

        System.out.println("Enter salary-");
        salary = x.nextDouble();
    }

    // Method to display employee details
    public void display()
     {
        System.out.println("Employee id - " + id);
        System.out.println("Employee name - " + name);
        System.out.println("Employee department - " + dept);
        System.out.println("Employee salary - " + salary);
    }

    // Method to get salary
    public double getsalary()
     {
        return salary;
    }
}

class manager extends employee 
{
    private double bonus;
    
    // Method to accept manager details
    public void accept() 
    {  
        super.accept();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter manager bonus-");
        bonus = x.nextDouble();
    }
    
    // Method to calculate total salary (salary + bonus)
    double totalsalary()
     {
        return bonus + getsalary();
    }

    // Method to display manager details
    public void display()
     {
        super.display();
        System.out.println("Manager bonus - " + bonus);
        System.out.println("Manager total salary is - " + totalsalary());
    } 
    
    
}

class seta1
 {
    public static void main(String[] arg)
     {
        Scanner x = new Scanner(System.in);
        System.out.println("How many objects you want to create?");
        int n = x.nextInt();
        manager M[]= new manager[n]; // Array of manager objects
        
        // Accept details for each manager
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter details of manager " + (i + 1) + ":-");
            M[i] = new manager(); // Creating new object 
            M[i].accept();
        }
        
        // Display details of all managers
        System.out.println("Details of managers:");
        for (int i = 0; i < n; i++) 
        {
            M[i].display();
        }

        // Find and display the manager with the maximum salary
        manager maxsalary = M[0];
        for (int i = 1; i < n; i++) 
        {  
            if (M[i].getsalary() > maxsalary.getsalary()) 
            {
                maxsalary = M[i];
            }
        }
        System.out.println("Details of manager having maximum salary:");
        maxsalary.display();
    }
}
