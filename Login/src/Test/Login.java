package Test;
import java.io.*;
import javax.servlet.http.*;
public class Login extends HttpServlet 
{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	String user,userDB[]={"Manish"};
	String pass,passDB[]={"0000"};
	
	PrintWriter out=res.getWriter();
	
	user=req.getParameter("Username");
	pass=req.getParameter("Password");
	
	if(user.equals(userDB[0]) && pass.equals(passDB[0]))
	{out.println("Login Sucessful!");}
	else
	{
		out.println("!Incorrect Username Please Enter The Correct Username");
		res.sendRedirect("http://localhost:8080/Login/Main.html");
	}
}
}

























