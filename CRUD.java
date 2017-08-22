package jdbc;
import java.util.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.ResultSet;

public class CRUD {
	String sql;
	static int n;
	static Scanner s=new Scanner(System.in);
	 void create(Statement stmt)throws Exception
	 {
		  sql="create table Crud8(id int,name varchar(20),mark1 int,mark2 int,total int)";
			stmt.execute(sql);
			
	 }
	 void insert(Statement stmt)throws Exception
	 {
		 System.out.println("enter id:");
		 int id=s.nextInt();
		 System.out.println("enter the name:");
		 String name=s.next();
		 System.out.println("enter the subject1 mark");
		 int mark1=s.nextInt();
		 System.out.println("enter the subject2 mark");
		 int mark2=s.nextInt();
		 int total=mark1+mark2;
		 
		 sql="insert into Crud8 values("+id+",'"+name+"',"+mark1+","+mark2+","+total+")";
			stmt.executeUpdate(sql);
			
			System.out.println(" record is inserted");
	 }
	 void update(Statement stmt)throws Exception
	 {
		 System.out.println("enter the name of person to be updated");
		 String name=s.next();
		 System.out.println("enter mark1 and mark2");
		int mark1=s.nextInt();
		int mark2=s.nextInt();
	    int total=mark1+mark2;
		 sql="update  Crud8 set mark1="+mark1+",mark2="+mark2+",total="+total+" where name='"+name+"'";
			stmt.executeUpdate(sql);
			System.out.println("record is updated"); 
	 }
	 void display(Statement stmt)throws Exception
	 {
		 System.out.println("EMPLOYEE DETAILS ");
		 sql="select * from Crud8";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("id:"+rs.getInt(1));
				System.out.println("name:"+rs.getString(2));
				System.out.println("mark1:"+rs.getInt(3));
				System.out.println("mark2:"+rs.getInt(4));
				System.out.println("total:"+rs.getInt(5));
				System.out.println("--------------------------");
			}
			rs.close();

	 }
	 void delete(Statement stmt)throws Exception
	 {
		 System.out.println("enter the name of the person to be deleted");
		 String name=s.next();
		 sql="delete from Crud8 where name='"+name+"'";
			stmt.executeUpdate(sql);
			System.out.println("record after updation and  deletion");
	 }
public static void main(String[] args)throws Exception
{
	
	CRUD c=new CRUD();
	Class.forName("org.h2.Driver");
	Connection con=DriverManager.getConnection("jdbc:h2:~/test","sa","");
	Statement stmt=con.createStatement();
	c.create(stmt);
	System.out.println("*****Employee details******");
	System.out.println("1.register/n2.update/n3.delete/n4.select");
	do
	{
	System.out.println("enter your choice");
	n=s.nextInt();
	switch(n)
	{
	case 1:
	c.insert(stmt);
	break;
	case 2:c.update(stmt);
	break;
	case 3:c.delete(stmt);
	break;
	case 4:c.display(stmt);
	break;
	}
		}while(n<5);
}
}