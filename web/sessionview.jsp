<%-- 
    Document   : sessionview
    Created on : 7 Feb, 2024, 2:34:31 PM
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
        <%=session.getAttribute("mobile")%>
        
        <%=session.getAttribute("name")%>
        <h1>Hello view!</h1>
    </body>
</html>
