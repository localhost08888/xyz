//import SYMarks;
//import TYMarks;
import java.util.*;

class student

{
	int rollno;
	String name;
	 SYMarks s1=new SYMarks();
	 TYMarks t1=new TYMarks();

	public void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter roll number.");
		 rollno=s.nextInt();
		System.out.println("Enter name.");
		 name=s.next();

		s1.accept();
		t1.accept();
	}

	public void display()
	{
		System.out.println("Roll No :"+rollno);
		System.out.println("Name:"+name);
		s1.display();
		t1.display();
	}

	public void grade()
	{
		int total=(s1.total()) + (t1.total());
		double per=total/5;

		System.out.println("Per :"+per);

		if(per>=70)
		System.out.println("A Grade");

		else if(per<70 && per>=60)
		System.out.println("B Grade");

		else if(per<60&&per>=50)
		System.out.println("C Grade");

		else if(per<50 && per>=40)
		System.out.println("Pass Class");

		else
		System.out.println("Fail");

	}

	public static void main(String args[])

	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many objects.");
		int n=s.nextInt();

		student st[]=new student[n];

		for(int i=0;i<n;i++)
		{
			st[i]=new student();
			st[i].accept();
              System.out.println(st[i].rollno);

		}
		for(int i=0;i<n;i++)
		{
			st[i].display();
			st[i].grade();
		}
	}
}



 
	