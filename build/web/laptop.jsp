<%-- 
    Document   : laptop
    Created on : 2 Feb, 2024, 12:10:36 AM
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
            String lap = "";
            
            

            //String fr = "";
            if (request.getParameter("HP") == null) {
                System.out.println("first");
            } else {

                if (request.getParameter("HP") == "HP") {
                    lap = "HP";

                } 
                else{
                    lap="DELL";
                }
                
            }
        %>
        <form>
            HP:<input type="checkbox" name="HP" value="HP">
            <br>
            DELL:<input type="checkbox" name="DELL" value="DELL">
            <br>

            <!--            pendrive:<input type="checkbox" name="free" value="">
                        <br>
                        mouse:<input type="checkbox" name="free" value="">
                        
                        <br>-->
            <input type="submit" value="submit" >
        </form>
        the laptop you are selected is : <%=lap%>
    </body>
</html>
