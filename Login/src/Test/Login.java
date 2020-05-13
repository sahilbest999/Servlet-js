package Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class Login extends HttpServlet 
{
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
{
	String user;
	String user1="Manish";
	String pass;
	String pass1="0000";
	PrintWriter out=res.getWriter();
	user=req.getParameter("Username");
	if(user.equals(user1))
	{
	pass=req.getParameter("Password");
	if(pass.equals(pass1))
	{
		out.println("Login Sucessful!");
	}
	else
	{
		res.sendRedirect("http://localhost:8080/Login/Main.html");
		out.println("!Incorrect Password Please Enter The Correct Password");
	}
	}
	else
	{
		
		out.println("!Incorrect Username Please Enter The Correct Username");
		res.sendRedirect("http://localhost:8080/Login/Main.html");
	}
	
	
	
}
}
























