package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import oracle.jdbc.OracleDriver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public final class insertmarks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            int marks = 0;
            String name = "";
            if (request.getParameter("marks") == null) {
                System.out.println("first");
            } else {
                marks = Integer.parseInt(request.getParameter("marks"));

                name = request.getParameter("name");

                try {
                    String url = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "system";
                    String password = "wrong";
                    DriverManager.registerDriver(new OracleDriver());
                    Connection connection = DriverManager.getConnection(url, username, password);
                    out.println(connection);
                    PreparedStatement statement = connection.prepareStatement("insert into marksheet (marks, name) values (?, ?)");
                    
                   
                    statement.setString(1,""+ marks); // Set the first parameter (marks)
                     statement.setString(2, name);
                     
                   
                    int n = statement.executeUpdate();
                    out.println(n);
                } catch (SQLException ex) {
                    out.println(ex);
                }

            }


        
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            Enter marks <input type=\"number\" name=\"marks\" value=\"");
      out.print(marks);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            Enter name  <input type=\"text\" name=\"name\" value=\"");
      out.print(name);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"submit\"> \n");
      out.write("        </form>\n");
      out.write("        <h1>The marks is : ");
      out.print(marks);
      out.write("</h1>\n");
      out.write("        <Br>\n");
      out.write("        <h1>The name is : ");
      out.print(name);
      out.write("</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}