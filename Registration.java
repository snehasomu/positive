package aaaaa;
import java.util.*;
public class Registration {
	Scanner s=new Scanner(System.in);
	String fname,lname,uname1,uname,n;
	double pwd1;
	double pwd;
    int age;
	void register()
	{
		System.out.println("enter the first name");
		fname=s.next();
		System.out.println("enter the last name");
		lname=s.next();
		System.out.println("enter the age");
		age=s.nextInt();
		System.out.println("enter the username");
		uname1=s.next();
		System.out.println("enter the password");
		pwd1=s.nextDouble();
		System.out.println("your registration is successful");
		
	}
	void login()
	{
		System.out.println("Login form");
		System.out.println("------------------------------------");
		System.out.println("enter the username");
		uname=s.next();
		System.out.println("enter the password");
		pwd=s.nextDouble();
		System.out.println("login is success");
		
	}
	void validate()
	{
		do {
			register();
			login();
		if((uname1.equals(uname))&&(pwd1==pwd))
		{
			System.out.println("your details");
			System.out.println("Firstname:"+fname);
			System.out.println("last name:"+lname);
			System.out.println("age:"+age);
		}
		else
		{
			System.out.println("invaid password / username");
		}
		System.out.println("do you want to register again(yes/no):");
		n=s.next();
		}while(n.equals("yes"));
	}
	public static void main(String[] args) {
		Registration r=new Registration();
		
		r.validate();
		}}
