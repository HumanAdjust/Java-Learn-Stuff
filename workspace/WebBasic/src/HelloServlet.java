import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

// JavaEE -> Servlet의 기본 골격
public class HelloServlet extends HttpServlet{
	// javaEE main method
	//                          ↓                          ↑
	public void service(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException
	{
		// 클라이언트가 요청을 하면 HelloServlet 문자열을 응답해본다.
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		out.println("<html");
		out.println("<body>");
		out.println("3116_정상현_HelloServlet");
		out.println("</body>");
		out.println("</html>");
	}
}