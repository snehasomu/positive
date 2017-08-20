import java.io.*;
import java.util.*;
public class Stu_reg {

	static int n,i;
	static String name,lfc;
	long rno;
	Scanner s=new Scanner(System.in);
	void get()
	{
		System.out.println("enter the no of students:");
		n=s.nextInt();
	}
	void ask() throws IOException
	{
		for(i=1;i<=n;i++)
		{
		System.out.println("student no:"+i);
		System.out.println("enter the name:");
		name=s.next();
		System.out.println("enter the rollno:");
		rno=s.nextLong();
		}
		System.out.println("registration is successfull");
		
	}
	
	public static void main(String[] args)throws Exception
	{
		
		
		
		Stu_reg r=new Stu_reg();
		r.get();
		if(n==0)
		{
		System.out.println("registration fails");	
		}
		else
		{
			r.ask();
		}
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		lfc=in.readLine();
		File file=new File("C:\\ECLIPSSE\\file concept\\src\\outputfile.txt");
		PrintWriter out=new PrintWriter(new FileWriter(file));
		out.println(lfc);;
		
		
		}
	}
