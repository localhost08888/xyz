// File: setb1.java
import java.util.Scanner;
import series.*;

public class setb1 
{
    public static void main(String[] args) 
    {
        Prime p = new Prime();
        Fibonacci q = new Fibonacci();
        Square r = new Square();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Calling functions from those classes
        p.Pr(n);
        q.Fib(n);
        r.Sq(n);

        sc.close();
    }
}