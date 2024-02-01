

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
    </head>
    <body>
        <%
            int a = 0, b = 0;
            if (request.getParameter("a") == null) {
                System.out.println("first ");
            } else {
                System.out.println("postback");
                a = Integer.parseInt(request.getParameter("a"));
                b = Integer.parseInt(request.getParameter("b"));
            }
            int sum = a + b;


        %>
        <h1>Add</h1>
        <form>
            <input type="number" name="a" value="<%=a%>">
            <br>
            <input type="number" name="b" value="<%=b%>">
            <br>
            <input type="submit" value="add">
        </form>
        <h1>result=<%=sum%></h1>
    </body>
</html>
