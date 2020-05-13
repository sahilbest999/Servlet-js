package Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Homepage extends HttpServlet 
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{
	String user1=(String) req.getParameter("user1");
	String pass1=(String) req.getParameter("pass1");
	PrintWriter out=res.getWriter();
	out.println("The Username Is="+user1);
	out.println("The Password Is"+pass1);
	out.println("Remember Your Password");
}
}
