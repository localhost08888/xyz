import java.util.*;

public class TYMarks
{
    int theory,practical;
    public void accept()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter theory ,practical");

        theory=x.nextInt();
        practical=x.nextInt();  
    }

    public void display()
    {
        System.out.println("theroy marks -"+theory);
        System.out.println("practical marks-"+practical);      
    }
   
    public int total()
    {
        return (theory+practical);
    }
}