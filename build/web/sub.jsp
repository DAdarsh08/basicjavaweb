

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           int num1=0;
           int num2=0;
           int diff=0;
           if(request.getParameter("a")==null)
           {
               System.out.println("first");
           }
           else{
               System.out.println("postback");
               num1=Integer.parseInt(request.getParameter("a"));
               num2=Integer.parseInt(request.getParameter("b"));
              
                if(request.getParameter("option").equals("subtract"))
           {
             diff=num1-num2;
           }
           else{
               diff=num1+num2;
               
           }
        
           }
           
          
        %>
        <form>
            <input type="number" name="a" value="<%=num1%>">
            <br>
            <input type="number" name="b" value="<%=num2%>">
            <br>
            <input type="submit" value="subtract" name="option">
            <br>
            <input type="submit" value="add" name="option">
            
               
        </form>
            <h1>the value is : <%=diff%></h1>
         
    </body>
</html>
