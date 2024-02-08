<%-- 
    Document   : facebook
    Created on : 6 Feb, 2024, 1:08:43 PM
    Author     : adarsh
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String first_name = "";
            String sur_name = "";
            String mobile_number = "";
            String pass = "";
            String cpass = "";
            String ans = "Wrong password";
            String date = "";
            String dateans = "";
            String month = "";
            String year = "";
            String gender = "";
            if (request.getParameter("firstname") == null) {
                System.out.println("first tiime");
            } else {
                System.out.println("postback");
                first_name = request.getParameter("firstname");
                sur_name = request.getParameter("surname");
                mobile_number = request.getParameter("mobile");
                pass = request.getParameter("pass");
                cpass = request.getParameter("confirmpass");

                date = request.getParameter("date");
                month = request.getParameter("month");
                year = request.getParameter("year");
                dateans = date + "-" + month + "-" + year;
                gender = request.getParameter("gen");
                if (pass.equals(cpass)) {
                    ans = "Correct password";

                    try {
                        String url = "jdbc:oracle:thin:@localhost:1521:xe";
                        String username = "system";
                        String password = "wrong";
                        DriverManager.registerDriver(new OracleDriver());
                        Connection connection = DriverManager.getConnection(url, username, password);
                        out.println(connection);
                        PreparedStatement statement = connection.prepareStatement("insert into users ( firstname, surname,mobile,pass ,dob,gender) values (?,?,?,?,?,?)");

                        statement.setString(1, first_name); // Set the first parameter (marks)
                        statement.setString(2, sur_name);
                        statement.setString(3, mobile_number);
                        statement.setString(4, pass);
                        statement.setString(5, dateans);
                        statement.setString(6, gender);

                        int n = statement.executeUpdate();
                        out.println(n);
                    } catch (SQLException ex) {
                        out.println(ex);
                    }
                }

            }


        %>









        <h1>Sign Up</h1>
        <p>It's quick and easy.</p>
        <hr>

        <form>
            <input type="text" name="firstname" value="<%=first_name%>" placeholder="First Name">
            <input type="text" name="surname" value="<%=sur_name%>" placeholder="Surname">
            <br>
            <br>
            <input type="text" name="mobile" value="<%=mobile_number%>" placeholder="Mobile number or email address">
            <br>
            <br>
            <input type="password" name="pass" value="<%=pass%>" placeholder="New password">
            <br>
            <br>
            <input type="password" name="confirmpass" value="<%= cpass%>" placeholder="Confirm password">            
            <br>

            <p>Date of birth ?</p>
            <select name="date">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select>

            <select name="month">
                <option value="jan">jan</option>
                <option value="feb">feb</option>
                <option value="march">march</option>
                <option value="april">april</option>
                <option value="may">may</option>
                <option value="june">june</option>
                <option value="july">july</option>
                <option value="august">august</option>
                <option value="sept">sept</option>
                <option value="oct">oct</option>
                <option value="nov">nov</option>
                <option value="dec">dec</option>
            </select>

            <select name="year">
                <option value="2010">2010</option>
                <option value="2011">2011</option>
                <option value="2012">2012</option>
                <option value="2013">2013</option>
                <option value="2014">2014</option>
                <option value="2015">2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
                <option value="2021">2021</option>
                <option value="2022">2022</option>
                <option value="2023">2023</option>
                <option value="2024">2024</option>
            </select>
            <br>

            <p>Gender ?</p>
            female<input type="radio" name="gen" value="female">
            male<input type="radio" name="gen" value="male">
            coustum<input type="radio" name="gen" value="coustum">
            <br>
            <br>
            <input type="submit" value="submit">






        </form>
        <h2>name :<%=first_name%> </h2>
        <br>
        <h2>Surname name :<%=sur_name%> </h2>
        <br>
        <h2>mobile number :<%=mobile_number%></h2>
        <br>
        <h2><%=ans%></h2>
        <br>
        <h2>The DOB is : <%=date%> . <%=month%>. <%=year%> </h2>
        <Br>
        <h2>Gender is : <%=gender%></h2>



    </body>
</html>
