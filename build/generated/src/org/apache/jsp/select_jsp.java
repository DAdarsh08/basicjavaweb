package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import oracle.jdbc.OracleDriver;
import oracle.jdbc.OracleDriver;
import java.sql.DriverManager;
import java.sql.Connection;

public final class select_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            try {
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String username = "system";
                String password = "wrong";
                DriverManager.registerDriver(new OracleDriver());
                Connection connection = DriverManager.getConnection(url, username, password);
                out.println(connection);
                PreparedStatement statement = connection.prepareStatement("select *from result");
                ResultSet rs = statement.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                ");

                    int n = rsmd.getColumnCount();
                    for (int i = 1; i <= n; i++) {
                
      out.write("\n");
      out.write("                <td>");
      out.print(rsmd.getColumnLabel(i));
      out.write("</td>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                ");

                    while (rs.next()) {
                        for (int i = 1; i <= n; i++) {
                
      out.write("\n");
      out.write("                <td>");
      out.print(rs.getObject(i));
      out.write("</td>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                    rs.next();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");

            } catch (Exception ex) {
                out.println(ex);
            }
        
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
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
