package series;

public class Prime
 {
    int flag;

    public void Pr(int n) 
    { 
        flag = 1; // Initialize flag
        for (int i = 2; i < n; i++) 
        {
            if (n % i == 0)
             {
                flag = 0;
                break;
            } 
        }
        if (flag == 1)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
 }
   
 