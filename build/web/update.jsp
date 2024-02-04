<%-- 
    Document   : update
    Created on : 3 Feb, 2024, 4:18:50 PM
    Author     : adarsh
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try {
                    String url = "jdbc:oracle:thin:@localhost:1521:xe";
                    String username = "system";
                    String password = "wrong";
                    DriverManager.registerDriver(new OracleDriver());
                    Connection connection = DriverManager.getConnection(url, username, password);
                    out.println(connection);
              PreparedStatement statement = connection.prepareStatement("delete from  result  where rollno=3");
              
                   
                    int n = statement.executeUpdate();
                    out.println(n);
                } catch (Exception ex) {
                    out.println(ex);
                }
                %>
    </body>
</html>
