package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import oracle.jdbc.OracleDriver;
import java.sql.DriverManager;

public final class updatejsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: antiquewhite;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                color: whitesmoke;\n");
      out.write("                background-color: darkseagreen;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                color: bisque;\n");
      out.write("                background-color: silver;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            int rollno = 0;
            int marks = 0;
            String name = "";

            if (request.getParameter("roll") == null) {
                System.out.println("first time");
            } else {

                rollno = Integer.parseInt(request.getParameter("roll"));

                marks = Integer.parseInt(request.getParameter("marks"));

                name = request.getParameter("name");
                System.out.println("postback");

                try {
                    String url = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "system";
                    String password = "wrong";
                    DriverManager.registerDriver(new OracleDriver());

                    Connection connection = DriverManager.getConnection(url, username, password);
                    out.println(connection);

                    PreparedStatement statement = connection.prepareStatement("Insert into result (rollno,marks,name) values(?,?,?)");
                    statement.setString(1, "" + rollno);
                    statement.setString(2, "" + marks);
                    statement.setString(3, name);
                    int n = statement.executeUpdate();
                    out.println(n);

                } catch (Exception ex) {
                    out.println(ex);
                }
            }

        
      out.write("\n");
      out.write("        <form>\n");
      out.write("            Enter RollNumber : <input type=\"number\" name=\"roll\" value=\"");
      out.print(rollno);
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("\n");
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
      out.print(rollno);
      out.write("</h1>\n");
      out.write("        <br>\n");
      out.write("        <h1>The marks is : ");
      out.print(marks);
      out.write("</h1>\n");
      out.write("        <Br>\n");
      out.write("        <h1>The name is : ");
      out.print(name);
      out.write("</h1>\n");
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
