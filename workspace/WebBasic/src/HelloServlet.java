import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

// JavaEE -> Servlet�� �⺻ ���
public class HelloServlet extends HttpServlet{
	// javaEE main method
	//                          ��                          ��
	public void service(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException
	{
		// Ŭ���̾�Ʈ�� ��û�� �ϸ� HelloServlet ���ڿ��� �����غ���.
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		out.println("<html");
		out.println("<body>");
		out.println("3116_������_HelloServlet");
		out.println("</body>");
		out.println("</html>");
	}
}