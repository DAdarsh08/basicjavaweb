<%-- 
    Document   : connect
    Created on : 3 Feb, 2024, 1:19:15 PM
    Author     : adarsh
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
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
            try {
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String username = "system";
                String password = "wrong";
                DriverManager.registerDriver(new OracleDriver());
                Connection connection = DriverManager.getConnection(url, username, password);
                out.println(connection);
                PreparedStatement statement = connection.prepareStatement("insert into marksheet values('99','Anurag')");
                int n = statement.executeUpdate();
                out.println(n);
            } catch (SQLException ex) {
                out.println(ex);
            }

        %>

    </body>
</html>
