<%-- 
    Document   : facebooklogin
    Created on : 6 Feb, 2024, 2:45:34 PM
    Author     : adarsh
--%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <%
            String mobile = "";
            String pass = "";
            String ans = "Your login is wrong";

            if (request.getParameter("mobile") == null) {
                System.out.println("first time");
            } else {
                System.out.println("postback");

                mobile = request.getParameter("mobile");
                pass = request.getParameter("pass");

                try {

                    String url = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "system";
                    String password = "wrong";
                    DriverManager.registerDriver(new OracleDriver());
                    Connection connection = DriverManager.getConnection(url, username, password);
                    out.println(connection);
                    PreparedStatement statement
                            = connection.prepareStatement("select *from users where mobile =? and pass=? ");

                    statement.setString(1, mobile); // Set the first parameter (marks)
                    statement.setString(2, pass);

                    ResultSet rs = statement.executeQuery();
                    if (rs.next() == true) {
                        ans = "your login is right";
                    }
                    if (ans.equals("your login is right")) {

                        response.sendRedirect("homepage.jsp");
                    }

                    // ResultSetMetaData rsmd = rs.getMetaData();
                    int n = statement.executeUpdate();

                    out.println(n);
                } catch (SQLException ex) {
                    out.println(ex);
                }

            }

        %>



        <form>


            <input type="text" name="mobile" value="" placeholder="Mobile number">
            <br>
            <input type="password" name="pass" value="" placeholder="enter password">
            <br>
            <input type="submit" value="Login">


        </form>

        <h1><%=ans%></h1>    



    </body>
</html>
