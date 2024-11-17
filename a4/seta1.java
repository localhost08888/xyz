 

import java.util.Scanner;

class Cricket 
{
    String name;
    int innings, notOuts, totalRuns;
    float batAvg;

    public Cricket()
     {
        name = "";
        innings = notOuts = totalRuns = 0;
        batAvg = 0.0f; // float
    }

    public void getDetails() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, Innings, Times Not Out, Total Runs:");
        name = sc.nextLine();
        innings = sc.nextInt();
        notOuts = sc.nextInt();
        totalRuns = sc.nextInt();
    }

    public void calculateAverage() 
    {
        try
         {
            if (innings - notOuts == 0) 
            {  
                throw new ArithmeticException("Division by zero: Player never got out.");
            }
            this.batAvg = (float) totalRuns / (innings - notOuts);
        } 
        catch (ArithmeticException e)
         {
            System.out.println("Error for player " + name + ": " + e.getMessage());
            this.batAvg = 0.0f; // Default to 0.0 if error occurs
        }
    }

    public void displayDetails()
     {
        System.out.println("Name: " + name);
        System.out.println("Innings: " + innings);
        System.out.println("Times Not Out: " + notOuts);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Batting Average: " + batAvg);
    }
}

class seta1
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int n = sc.nextInt();
        Cricket players[] = new Cricket[n];

        for (int i = 0; i < n; i++)
         {
            players[i] = new Cricket();
            players[i].getDetails();
            players[i].calculateAverage(); // Calculate average after getting details
        }

        // Sort by batting average in descending order
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1 - i; j++)
             {
                if (players[j].batAvg < players[j + 1].batAvg) 
                {  
                    Cricket temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nPlayer Details (Sorted by Batting Average):");
        for (Cricket player : players)
         {
            player.displayDetails();
        }
    }
}
