import java.util.Scanner;

interface CreditCard
 {
    void viewCreditAmount();
    void increaseLimit();
    void useCard();
    void payCard();
}

class SliverCardCustomer implements CreditCard
 {
    String name;
    int card_no;
    double creditAmount;
    double creaditLimit;
    static int cnt;
    Scanner scanner = new Scanner(System.in);

    SliverCardCustomer() 
    {
        name = "Noname";
        card_no = 0;
        creditAmount = 0;
        creaditLimit = 50000;
    }

    public void viewCreditAmount()
     {
        System.out.println("Your amount is : " + creditAmount);
    }

    public void getdata() 
    {
        System.out.println("Enter the name : ");
        name = scanner.nextLine();

        System.out.println("Enter the card number :");
        card_no = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Credit amount : ");
        creditAmount = scanner.nextDouble();
        scanner.nextLine();
    }

    public void payCard()
     {
        System.out.println("Enter amount to be pay");
        double pay = scanner.nextDouble();
        scanner.nextLine();
        creditAmount -= pay;
        System.out.println("Balance is paid");
    }

    public void useCard() 
    {
        System.out.println("Enter amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (amount < creditAmount)
        {
            creditAmount += amount;
            viewCreditAmount();
            System.out.println("Thanks for using the service");
        } 
        else
         {
            System.out.println("\nerror!");
        }
    }

    public void increaseLimit()
     {
        cnt++;
        if (cnt <= 3) 
        {
            System.out.println("Enter amount limit to increse : ");
            double amt = scanner.nextDouble();
            scanner.nextLine();
            if (amt <= 2500)
             {
                creaditLimit += amt;
                System.out.println("Amount limit to increse Successfully : ");
            } 
            else 
            {
                System.out.println("You can't increse creadit amount more than 2500 at a time ");
            }
        } 
        else
         {
            System.out.println("You can't increse limit more than 3 times ");
        }
    }
}

class GoldCardCustomer extends SliverCardCustomer
 {
    public void increaseLimit() 
    {
        if (cnt <= 3) 
        {
            System.out.println("Enter amount limit to increse : ");
            double amt = scanner.nextDouble();
            scanner.nextLine();
            if (amt <= 5000)
             {
                creaditLimit += amt;
                System.out.println("Amount limit to increse Successfully : ");
            } 
            else
             {
                System.out.println("You can't increse creadit amount more than 2500 at a time ");
            }
        } 
        else
         {
            System.out.println("You can't increse limit more than 3 times ");
        }
    }
}

public class setb2
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        SliverCardCustomer sc = new SliverCardCustomer();
        GoldCardCustomer gc = new GoldCardCustomer();
        System.out.println("Enter the info for silver card holder : ");
        sc.getdata();
        System.out.println("Enter the info for Gold card holder : ");
        gc.getdata();
        int ch;
        do {
            System.out.println("1.Use silver card \n2.Pay credit for Silver card\n3.Increse limit for silver card ");
            System.out.println("4.Use Gold card \n5.Pay credit for Gold card\n6.Increse limit for Gold card ");
            System.out.println("0. exit");
            System.out.println("Enter your choice : ");
            ch = scanner.nextInt();
            scanner.nextLine();
            switch (ch) 
            {
                case 1:
                    sc.useCard();
                    break;
                case 2:
                    sc.payCard();
                    break;
                case 3:
                    sc.increaseLimit();
                    break;
                case 4:
                    gc.useCard();
                    break;
                case 5:
                    gc.payCard();
                    break;
                case 6:
                    gc.increaseLimit();
                    break;
            }
        } 
        while (ch != 0);
    }
}