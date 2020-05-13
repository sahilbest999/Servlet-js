package Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class Username extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
{
	String user="Manish";
	String user1;
	String pass="0000";
	String pass1;
	PrintWriter out=res.getWriter();
	user1=req.getParameter("username");
	if(user1.equals(user))
	{
		pass1=req.getParameter("password");
		if(pass1.equals(pass))
		{
			out.println("Login Is Sucessful");
		}
		else
		{
			out.println("Password Is Incorrect Plaease Enter The valid Password");
		}
	}
	else
	{
		out.println("Username Is Incorrect Please Enter The Valid Username");
	}
}
}






















