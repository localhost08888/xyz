import java.util.Scanner;
// Custom Exception for Insufficient Funds
class InsufficientFundException extends Exception 
{
    public InsufficientFundException(String message) 
    {
        super(message);
    }
}

class SavingAccount 
{
    int acNo;
    String name;
    double balance = 500.0d;

    // Accept account details
    public void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number, Name, and Balance:");
        acNo = sc.nextInt();
        name = sc.nextLine();
        balance = sc.nextDouble();
    }
    // Withdraw method
    public void withdraw()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Withdrawal Amount:");
        double wamt = sc.nextDouble();

        try
         {
            if ((balance - wamt) < 500)
            {
                throw new InsufficientFundException("Error: Insufficient Balance (Min Rs500 required)");
            }
             else 
             {
                balance =balance- wamt;
                System.out.println("Withdrawal Successful! Remaining Balance: Rs:" + balance);
            }
        } 
        catch (InsufficientFundException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    // Deposit method
    public void deposit()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deposit Amount:");
        double damt = sc.nextDouble();
        balance =balance + damt;
        System.out.println("Deposit Successful! New Balance: Rs:" + balance);
    }

    public void viewBalance()
     {
        System.out.println("Current Balance: Rs:" + balance);
    }
}

public class seta2
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Customers:");
        int n = sc.nextInt();

        // Create an array of SavingAccount objects
        SavingAccount accounts[]= new SavingAccount[n];
        for (int i = 0; i < n; i++) 
        {
            accounts[i] = new SavingAccount();
            accounts[i].accept();
        }

        // Menu for customer operations
        System.out.println("Enter Customer Number 1 to "+ n+":");
        int customerNo =(sc.nextInt()) - 1;
            if (customerNo < 0 || customerNo >= n) 
            {
                System.out.println("Invalid Customer Number!");
                return;
            }
            int choice;
            do {
                System.out.println("\n1. Withdraw\n2. Deposit\n3. View Balance\n4. Quit");
                System.out.print("Select Option: ");
                choice = sc.nextInt();
                switch (choice)
                 {
                    case 1:
                        accounts[customerNo].withdraw();
                        break;
                    case 2:
                        accounts[customerNo].deposit();
                        break;
                    case 3:
                        accounts[customerNo].viewBalance();
                        break;
                    case 4:
                        System.out.println("Returning to Customer Selection...");
                        break;
                    default:
                        System.out.println("Invalid Option! Try Again.");
                }
            } while (choice != 4);
        }

   
    
}


