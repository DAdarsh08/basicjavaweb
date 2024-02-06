package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;
import oracle.jdbc.OracleDriver;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.DriverManager;

public final class facebook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

            String first_name = "";
            String sur_name = "";
            String mobile_number = "";
            String pass = "";
            String cpass = "";
            String ans = "Wrong password";
            String date = "";
            String dateans = "";
            String month = "";
            String year = "";
            String gender = "";
            if (request.getParameter("firstname") == null) {
                System.out.println("first tiime");
            } else {
                System.out.println("postback");
                first_name = request.getParameter("firstname");
                sur_name = request.getParameter("surname");
                mobile_number = request.getParameter("mobile");
                pass = request.getParameter("pass");
                cpass = request.getParameter("confirmpass");
                if (pass.equals(cpass)) {
                    ans = "Correct password";

                }
                date = request.getParameter("date");
                month = request.getParameter("month");
                year = request.getParameter("year");
                dateans = date + "-" + month + "-" + year;
                gender = request.getParameter("gen");

                try {
                    String url = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "system";
                    String password = "wrong";
                    DriverManager.registerDriver(new OracleDriver());
                    Connection connection = DriverManager.getConnection(url, username, password);
                    out.println(connection);
                    PreparedStatement statement = connection.prepareStatement("insert into users ( firstname, surname,mobile,pass ,dob,gender) values (?,?,?,?,?,?)");

                    statement.setString(1, first_name); // Set the first parameter (marks)
                    statement.setString(2, sur_name);
                    statement.setString(3, mobile_number);
                    statement.setString(4, pass);
                    statement.setString(5, dateans);
                    statement.setString(6, gender);

                    int n = statement.executeUpdate();
                    out.println(n);
                } catch (SQLException ex) {
                    out.println(ex);
                }

            }


        
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
      out.write("        <h1>Sign Up</h1>\n");
      out.write("        <p>It's quick and easy.</p>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <input type=\"text\" name=\"firstname\" value=\"");
      out.print(first_name);
      out.write("\" placeholder=\"First Name\">\n");
      out.write("            <input type=\"text\" name=\"surname\" value=\"");
      out.print(sur_name);
      out.write("\" placeholder=\"Surname\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"mobile\" value=\"");
      out.print(mobile_number);
      out.write("\" placeholder=\"Mobile number or email address\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" name=\"pass\" value=\"");
      out.print(pass);
      out.write("\" placeholder=\"New password\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" name=\"confirmpass\" value=\"");
      out.print( cpass);
      out.write("\" placeholder=\"Confirm password\">            \n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <p>Date of birth ?</p>\n");
      out.write("            <select name=\"date\">\n");
      out.write("                <option value=\"1\">1</option>\n");
      out.write("                <option value=\"2\">2</option>\n");
      out.write("                <option value=\"3\">3</option>\n");
      out.write("                <option value=\"4\">4</option>\n");
      out.write("                <option value=\"5\">5</option>\n");
      out.write("                <option value=\"6\">6</option>\n");
      out.write("                <option value=\"7\">7</option>\n");
      out.write("                <option value=\"8\">8</option>\n");
      out.write("                <option value=\"9\">9</option>\n");
      out.write("                <option value=\"10\">10</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <select name=\"month\">\n");
      out.write("                <option value=\"jan\">jan</option>\n");
      out.write("                <option value=\"feb\">feb</option>\n");
      out.write("                <option value=\"march\">march</option>\n");
      out.write("                <option value=\"april\">april</option>\n");
      out.write("                <option value=\"may\">may</option>\n");
      out.write("                <option value=\"june\">june</option>\n");
      out.write("                <option value=\"july\">july</option>\n");
      out.write("                <option value=\"august\">august</option>\n");
      out.write("                <option value=\"sept\">sept</option>\n");
      out.write("                <option value=\"oct\">oct</option>\n");
      out.write("                <option value=\"nov\">nov</option>\n");
      out.write("                <option value=\"dec\">dec</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <select name=\"year\">\n");
      out.write("                <option value=\"2010\">2010</option>\n");
      out.write("                <option value=\"2011\">2011</option>\n");
      out.write("                <option value=\"2012\">2012</option>\n");
      out.write("                <option value=\"2013\">2013</option>\n");
      out.write("                <option value=\"2014\">2014</option>\n");
      out.write("                <option value=\"2015\">2015</option>\n");
      out.write("                <option value=\"2016\">2016</option>\n");
      out.write("                <option value=\"2017\">2017</option>\n");
      out.write("                <option value=\"2018\">2018</option>\n");
      out.write("                <option value=\"2019\">2019</option>\n");
      out.write("                <option value=\"2020\">2020</option>\n");
      out.write("                <option value=\"2021\">2021</option>\n");
      out.write("                <option value=\"2022\">2022</option>\n");
      out.write("                <option value=\"2023\">2023</option>\n");
      out.write("                <option value=\"2024\">2024</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <p>Gender ?</p>\n");
      out.write("            female<input type=\"radio\" name=\"gen\" value=\"female\">\n");
      out.write("            male<input type=\"radio\" name=\"gen\" value=\"male\">\n");
      out.write("            coustum<input type=\"radio\" name=\"gen\" value=\"coustum\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"submit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <h2>name :");
      out.print(first_name);
      out.write(" </h2>\n");
      out.write("        <br>\n");
      out.write("        <h2>Surname name :");
      out.print(sur_name);
      out.write(" </h2>\n");
      out.write("        <br>\n");
      out.write("        <h2>mobile number :");
      out.print(mobile_number);
      out.write("</h2>\n");
      out.write("        <br>\n");
      out.write("        <h2>");
      out.print(ans);
      out.write("</h2>\n");
      out.write("        <br>\n");
      out.write("        <h2>The DOB is : ");
      out.print(date);
      out.write(" . ");
      out.print(month);
      out.write('.');
      out.write(' ');
      out.print(year);
      out.write(" </h2>\n");
      out.write("        <Br>\n");
      out.write("        <h2>Gender is : ");
      out.print(gender);
      out.write("</h2>\n");
      out.write("\n");
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
