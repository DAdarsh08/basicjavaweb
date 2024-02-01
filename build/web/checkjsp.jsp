

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
           String s="";
           String s2="";
           String option="";
           if(request.getParameter("option")==null)
           {
               option="sub";
           }
           else{
               option="add";
           }
           if(request.getParameter("a")==null)
           {
               System.out.println("first");
           }
           else{
               System.out.println("postback");
               num1=Integer.parseInt(request.getParameter("a"));
               num2=Integer.parseInt(request.getParameter("b"));
              
            if(option.equals("sub"))
           {
             diff=num1-num2;
             s="checked";
           }
             else if(option.equals("add")){
               diff=num1+num2;
               s2="checked";
               
           }
        
           }
           
          
        %>
        <form>
            <input type="number" name="a" value="<%=num1%>">
            <br>
            <input type="number" name="b" value="<%=num2%>">
            <br>
            ADD/SUB:<input type="checkbox" value="add" name="option" <%=s2%>>
            <br>
            <input type="submit" value="submit">
                   
                   
            
               
        </form>
            <h1>the value is : <%=diff%></h1>
         
    </body>
</html>
