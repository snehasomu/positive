package thead2niit;

import java.util.Scanner;

public class A extends Thread{
	static int a;
	static int b;
	int sum;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] arg) {
	A a1=new A();
	Thread t2=new Thread() {
		public void run()
		{
			System.out.println("enter two numbers");
			a=s.nextInt();
			b=s.nextInt();
		}
		 };
	  Thread t1=new Thread() {
	public void run()
	{
	 a1.sum = a1.a+a1.b;
	System.out.println("the sum is "+a1.sum);
	}
	 };
	  
	 t2.start();
	 t1.start();
	
		
	
	
}
}
