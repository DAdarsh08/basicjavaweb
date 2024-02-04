<%-- 
    Document   : select
    Created on : 4 Feb, 2024, 2:26:04 PM
    Author     : adarsh
--%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
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
                PreparedStatement statement = connection.prepareStatement("select *from result");
                ResultSet rs = statement.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();
        %>
        <table border="1">
            <tr>
                <%
                    int n = rsmd.getColumnCount();
                    for (int i = 1; i <= n; i++) {
                %>
                <th><%=rsmd.getColumnLabel(i)%></th>
                <%
                    }
                %>

            </tr>
            <tr>
                <%
                    while (rs.next()) {
                        for (int i = 1; i <= n; i++) {
                %>
                <td><%=rs.getObject(i)%></td>
                <%
                    }
                %>
            </tr>
            <%
                }
            %>



        </table>
        <%
            } catch (Exception ex) {
                out.println(ex);
            }
        %>
        <h1>Hello World!</h1>
    </body>
</html>
