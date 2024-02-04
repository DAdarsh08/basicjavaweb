
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: antiquewhite;
            }
            h1{
                color: whitesmoke;
                background-color: darkseagreen;
            }
            form{
                color: bisque;
                background-color: silver;
            }
            
            

        </style>
    </head>
    <body>
        <%
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

        %>
        <form>
            Enter RollNumber : <input type="number" name="roll" value="<%=rollno%>">
            <br>

            Enter marks <input type="number" name="marks" value="<%=marks%>">
            <br>
            Enter name  <input type="text" name="name" value="<%=name%>">
            <br>
            <input type="submit" value="submit"> 
            
        </form>
            
        <h1> The marks is : <%=rollno%></h1>
        <br>
        <h1> The marks is : <%=marks%></h1>
        <Br>
        <h1> The name is : <%=name%></h1>

    </body>
</html>
