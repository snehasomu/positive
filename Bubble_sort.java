package niit_wk3;
import java.util.*;
public class Bubble_sort {
	int n,i,j,temp;
	int a[]=new int[10];
	Scanner s=new Scanner(System.in);
	void get()
	{
		System.out.println("enter the no of values");
		n=s.nextInt();
		System.out.println("enter the values:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	}
	void bubble()
	{
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print("\t" +a[i]);
		}
	}

	public static void main(String[] args) {
		Bubble_sort b=new Bubble_sort();
		b.get();
		b.bubble();
		

	}

}
