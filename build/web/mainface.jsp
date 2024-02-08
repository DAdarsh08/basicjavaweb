<%-- 
    Document   : mainface
    Created on : 8 Feb, 2024, 2:53:33 PM
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
            if(request.getParameter("tick")==null)
            {
                System.out.println("first time");
            }
            else{
                System.out.println("postback");
                
                if(request.getParameter("tick").equals("signin"))
                {
                    response.sendRedirect("facebook.jsp");
                }
                else{
                    response.sendRedirect("facebooklogin.jsp");
                }
                
            }
            
        
        %>
       
        <form>
            SignIn<input type="radio" name="tick" value="signin" >
            <br>
            Login<input type="radio" name="tick" value="login" >
            <br>
            <input type="submit" value="submit">
            
            
        </form>
    </body>
</html>
