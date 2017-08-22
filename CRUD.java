package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.ResultSet;

public class CRUD {
	 
public static void main(String[] args)throws Exception
{
	Class.forName("org.h2.Driver");
	Connection con=DriverManager.getConnection("jdbc:h2:~/test","sa","");
	Statement stmt=con.createStatement();
	String sql="create table Crud3(id int,name varchar(20),reg_no int,mark1 int,mark2 int,total int)";
	stmt.execute(sql);
	System.out.println("table is created");
	 sql="insert into Crud3 values(1,'sneha',235,90,90,180)";
		stmt.executeUpdate(sql);
		sql="insert into Crud3 values(2,'monica',236,95,95,190)";
		stmt.executeUpdate(sql);
		sql="insert into Crud3 values(3,'lupna',237,100,100,200)";
		stmt.executeUpdate(sql);
		sql="insert into Crud3 values(4,'swetha',238,85,85,170)";
		stmt.executeUpdate(sql);
		sql="insert into Crud3 values(5,'monisha',239,90,90,180)";
		stmt.executeUpdate(sql);
		System.out.println("five records are inserted");
		System.out.println("Initial records");
		 sql="select * from Crud3";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("id:"+rs.getInt(1));
				System.out.println("name:"+rs.getString(2));
				System.out.println("reg_no"+rs.getInt(3));
				System.out.println("mark1:"+rs.getInt(4));
				System.out.println("mark2:"+rs.getInt(5));
				System.out.println("total:"+rs.getInt(6));
				System.out.println("--------------------------");
			}
			rs.close();
		sql="update  Crud3 set mark1=85,mark2=85,total=170 where name='monisha'";
			stmt.executeUpdate(sql);
			System.out.println("table is updated");
			 sql="delete from Crud3 where name='sneha'";
				stmt.executeUpdate(sql);
				System.out.println("record after updation and  deletion");
			sql="select * from Crud3";
			ResultSet rs1=stmt.executeQuery(sql);
			while(rs1.next())
			{
				System.out.println("id:"+rs1.getInt(1));
				System.out.println("name:"+rs1.getString(2));
				System.out.println("reg_no"+rs1.getInt(3));
				System.out.println("mark1:"+rs1.getInt(4));
				System.out.println("mark2:"+rs1.getInt(5));
				System.out.println("total:"+rs1.getInt(6));
				System.out.println("----------------------------------");
			}
			rs1.close();
			
	
	
	
	}
}
