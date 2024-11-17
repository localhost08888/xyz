import java.util.Scanner;

class Vehicle 
{ 
    String company;
    double price;
     public void accept()// Accept vehicle details
     {  
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the Company and price of the Vehicle: ");
        company = br.nextLine();
        price = br.nextDouble();
     }

     public void display() // Display vehicle details
        {
            System.out.println("Company: " + company + " Price: " + price);
        }
}
//---------------------------------------------------------------------------------
class LightMotorVehicle extends Vehicle 
{
    double mileage;
    public void accept()// Accept details of light motor vehicle
     {
        super.accept();
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the mileage of the vehicle: ");
        mileage = br.nextDouble();
     }

    public void display()  // Display details of light motor vehicle
    {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}
//---------------------------------------------------------------------------------
class HeavyMotorVehicle extends Vehicle 
{
    double captons;

    public void accept() // Accept details of heavy motor vehicle
    {
        super.accept();
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the capacity of the vehicle in tons: ");
        captons = br.nextDouble();
    }

    // Display details of heavy motor vehicle
    public void display()
     {
        super.display();
        System.out.println("Capacity in tons: " + captons);
    }
}
//---------------------------------------------------------------------------------
public class seta3
 {
    public static void main(String[] args) 
    {
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the type of vehicle: ");
        System.out.println("1. Light Vehicle");
        System.out.println("2. Heavy Vehicle");
        int ch = br.nextInt();

        switch (ch)
         {
            case 1:
                System.out.println("Enter the number of Light vehicles: ");
                int n = br.nextInt();
                LightMotorVehicle arr[] = new LightMotorVehicle[n];

                // Accept details for light motor vehicles
                for (int i = 0; i < n; i++) 
                {
                    arr[i] = new LightMotorVehicle();
                    arr[i].accept();
                }

                // Display details of light motor vehicles
                for (int i = 0; i < n; i++)
                 {
                    arr[i].display();
                  }
                break;

            case 2:
                System.out.println("Enter the number of Heavy vehicles: ");
                int m = br.nextInt();
                HeavyMotorVehicle arr2[] = new HeavyMotorVehicle[m];

                // Accept details for heavy motor vehicles
                for (int i = 0; i < m; i++)
                 {
                    arr2[i] = new HeavyMotorVehicle();
                    arr2[i].accept();
                }

                // Display details of heavy motor vehicles
                for (int i = 0; i < m; i++) 
                {
                    arr2[i].display();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
