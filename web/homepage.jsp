<%-- 
    Document   : heomepage
    Created on : 6 Feb, 2024, 3:46:38 PM
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
            String name="";
            if(session.getAttribute("name")==null)
            {
                response.sendRedirect("facebooklogin.jsp");
            }
            else{
                name=(String)session.getAttribute("name");
            }
        %>
        
        <h1>Welcome <%=name%> </h1>
        
        <a href="logout.jsp" >Logout</a>
    </body>
</html>
