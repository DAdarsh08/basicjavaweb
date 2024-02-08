<%-- 
    Document   : sessionstore
    Created on : 7 Feb, 2024, 2:33:18 PM
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
            

            session.setAttribute("user", "Adarsh");
            
            



        %>
        <h1>Hello store!</h1>
    </body>
</html>
