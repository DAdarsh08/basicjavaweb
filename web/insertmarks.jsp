<%-- 
    Document   : insertmarks
    Created on : 3 Feb, 2024, 1:52:35 PM
    Author     : adarsh
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
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


        %>

        <form>
            Enter marks <input type="number" name="marks" value="<%=marks%>">
            <br>
            Enter name  <input type="text" name="name" value="<%=name%>">
            <br>
            <input type="submit" value="submit"> 
        </form>
        <h1>The marks is : <%=marks%></h1>
        <Br>
        <h1>The name is : <%=name%></h1>


    </body>
</html>
