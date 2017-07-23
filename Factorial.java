package aaaaa;
import java.util.Scanner;
public class Factorial {
	int i,n;
boolean n1;
	
	
	Scanner s=new Scanner(System.in);
	void fact2()
	{
	do {
			System.out.println("enter the number:");
		n=s.nextInt();
		long fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			}
			System.out.println("factorial:"+fact);
			System.out.println("do u want to continue");
			n1=s.nextBoolean();
	}while(n1==true);
}
		
	
public static void main(String[] args) {
		Factorial f=new Factorial();
		f.fact2();
	}

}