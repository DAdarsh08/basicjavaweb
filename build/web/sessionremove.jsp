<%-- 
    Document   : sessionremove
    Created on : 7 Feb, 2024, 2:34:09 PM
    Author     : adarsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.removeAttribute("user");
            %>
        <h1>Hello Remove!</h1>
    </body>
</html>
