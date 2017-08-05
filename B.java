
public class B extends Thread {
	int a,b,sum;
public void run()
{
	sum=a+b;
	System.out.println("the sum is "+sum);
}

	public static void main(String[] args) {
		B b=new B();
		b.start();
		b.a=10;
		b.b=5;
		}
}
