package Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class Username extends HttpServlet 
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
	String user="Admin";
	String user1;
	String pass="0000";
	String pass1;
	PrintWriter out=res.getWriter();
	user1=req.getParameter("username");
	if(user1.equals(user))
	{
		pass1=req.getParameter("password");
		if(user1.equals(user))
		{
			req.setAttribute("user1",user1);
			req.setAttribute("pass1",pass1);
			RequestDispatcher rd=req.getRequestDispatcher("sq");
			rd.forward(req,res);
		}
		else
		{
			out.println("Invalid Password");
		}
	}
	else
	{
		out.println("Invalid Username");
	}
	
}
}




















