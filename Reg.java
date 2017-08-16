import java.util.*;
public class Reg {
String name;
int no_of_subjects,i;
double avg,total=0;
int mark[]=new int[5];
boolean choice;
Scanner s=new Scanner(System.in);
void get()
{
	System.out.println("enter the student name:");
	name=s.nextLine();
	System.out.println("enter the no of subjects:");
	no_of_subjects=s.nextInt();
	for(i=0;i<no_of_subjects;i++)
	{
		System.out.println("enter the marks of subject" +(i+1));
		mark[i]=s.nextInt();
		total=total+mark[i];
	}
	avg=total/no_of_subjects;
	
}
 
 void display()
{
	System.out.println("********MARKSHEET************");
	System.out.println("NAME:"+name);
	System.out.println("MARKS OBTAINED:");
	for(i=0;i<no_of_subjects;i++)
	{
		System.out.println(mark[i]);
	}
	System.out.println("TOTAL:"+total);
	System.out.println("AVG:"+avg);
	if(avg<50)
	{
		System.out.println("STATUS: fail");	
	}
	else
	{
	System.out.println("STATUS:pass");
	}
	System.out.println("do you want to continue(true/false):");
	choice=s.nextBoolean();
}
 void choice()
{
	if(choice==true)
	{
		get();
		display();
	}
	else
	{
		System.out.println("exit");
	}
}
	public static void main(String[] args) {
		Reg r=new Reg();
		r.get();
		r.display();
		r.choice();
	}

}
