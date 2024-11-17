//package assignment2;
 
public class seta1
{
    int rollno;
    String name;
    double percentage;
    static int count;

    seta1()
    {
        rollno=0;
        name="";
        percentage=0.0d;
    }
    
    seta1 (int rollno,String name, double percentage)
    {
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;
         count++;
    }
   
    public static void countprint() //static methods we cant call this by object ....directly called by class name
    {
        System.out.println("Object count is "+count);
    }
   
    public void displaly()
    {
        System.out.println("Roll number -"+rollno);
        System.out.println("Name -"+name);
        System.out.println("Percenatage-"+percentage);
    }

    public static void main(String[] args)
    {
        seta1 s1=new seta1(101,"nilesh",45.5d);
        seta1 s2=new seta1(102,"pranav",75.5d);
        seta1 s3=new seta1(103,"om",25.5d);

        seta1.countprint();

        s1.displaly();
        s2.displaly();
        s3.displaly();
    }
}
