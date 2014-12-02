package pageController;

import java.io.IOException;
import java.io.PrintWriter;

 
public class HelloWorld extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html>\n" +
                "<head><title>Hello WWW</title></head>\n" +
                "<body>\n" +
                "<h1>Hello WWW</h1>\n" +
                "</body></html>");
  }
}