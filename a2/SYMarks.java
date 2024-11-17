import java.util.*;
public class SYMarks
{
    int comtotal,mathtotal,eletotal;
    public void accept()
    {
        Scanner x =new Scanner(System.in);
        System.out.println("Enter computertotal,Mathtotal,Eletotal:");
        comtotal=x.nextInt();
        mathtotal=x.nextInt();
        eletotal=x.nextInt();
    }

    public void display()
    {
        System.out.println("Computer total-"+comtotal);
        System.out.println("math total-"+mathtotal);
        System.out.println("ele total-"+eletotal);
    }
    public int total()
    {
        return (comtotal+mathtotal+eletotal);
    }
}