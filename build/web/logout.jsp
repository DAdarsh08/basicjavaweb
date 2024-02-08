<%-- 
    Document   : logout
    Created on : 7 Feb, 2024, 4:22:35 PM
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
        <%session.invalidate(); %>
        <% response.sendRedirect("facebooklogin.jsp");             %>
      
        
    </body>
</html>
