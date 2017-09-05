

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String no1=request.getParameter("no1");
	String no2=request.getParameter("no2");
	String opt=request.getParameter("opt");
	int n1=Integer.parseInt(no1);
	int n2=Integer.parseInt(no2);
	//int opt1=Integer.parseInt(opt);
	int sum=n1+n2;
	int sub=n1-n2;
	double mul=n1 * n2;
	float div=n1 / n2;
	
	
	if(opt.equals("a"))
	{
		out.println("addition ="+sum);
	}
	else if(opt.equals("s"))
	{
		out.println("subtraction="+sub);
	}
	else if(opt.equals("m"))
	{
		out.println("multiplication="+mul);
	}
	else if(opt.equals("d"))
	{
		out.println("division="+div);
	}
	else
	{
		out.print("invalid");
	}
	
	}
}

