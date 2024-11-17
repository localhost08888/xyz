//package assignment3;

import java.util.Scanner;

abstract class Shape
 {
    abstract public void area();
    abstract public void volume();
    final double pi=3.14;
}
class sphere extends Shape
{
    double r;
    private double area;
    private double  volume ;

    public void accept()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the radius of the sphere");
         r=x.nextDouble();
    }
   public void area()
   {
      area=pi*r*r;
   }
   public void volume()
   {
      volume=1.3333*(pi)*r*r*r;
   }

   public void display()
   {
      area();
      volume();
      System.out.println("the area of sphere is-"+area);
      System.out.println("the volume of sphere is-"+volume);
   }
}
//---------------------------------------------------------------------------------
class cone extends Shape
{
    double h,r,area,volume;
    public void accept()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the radius  and height of the cone");
         r=x.nextDouble();
         h=x.nextDouble();
    }
    public void area()
    {
        double sq=h*h+r*r;
        area=pi*r*(r+java.lang.Math.sqrt(sq));
    }
    public void volume()
    {
        double d=h/3;
        volume=pi*r*r*d;
    }
    public void display()
    {
        area();
        volume();
        System.out.println("The area of Cone is: "+area);
        System.out.println("The volume of Cone is: "+volume);
    }
}
//---------------------------------------------------------------------------------
class cylinder extends Shape
{
    double r,h,area,volume;
    public void accept()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the radius  and height of the cylinder");
         r=x.nextDouble();
         h=x.nextDouble();
    }

    public void area()
    {
        area= (2*pi*r*h)+(2*pi*r*r);
    }
    public void volume()
    {
        volume=pi*r*r*h;
    }
    public void display()
    {
        area();
        volume();
        System.out.println("The area of Cylinder is: "+area);
        System.out.println("The volume of Cylinder is: "+volume);
    }
}
//-----------------------------------------------------------------------------
class box extends Shape
{
    double l,b,h,area,volume;
    public void accept()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the  length,breadth,height of box");
         l=x.nextDouble();
         b=x.nextDouble();
         h=x.nextDouble();
    }

    public void area()
    {
        area= (2*l*b)+(2*b*h)+(2*l*h);
    }
    public void volume()
    {
        volume=l*b*h;
    }
    public void display()
    {
        area();
        volume();
        System.out.println("The area of box is: "+area);
        System.out.println("The volume of box is: "+volume);
    }
}
//-------------------------------------------------------------------
class seta2
{
  public static void main(String[] args)
     {
       sphere x=new sphere();
       x.accept();
       x.display(); 

       cone y=new cone();
       y.accept();
       y.display();

       cylinder z=new cylinder();
       z.accept();
       z.display();

       box s=new box();
       s.accept();
       s.display();

    }
}
