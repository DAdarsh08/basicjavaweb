/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
        @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
          int a=Integer.parseInt(request.getParameter("num1"));
         int b=Integer.parseInt(request.getParameter("num2"));
         int total =a+b;
        PrintWriter out = response.getWriter();
         out.println("The total is :- " + total);

    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         PrintWriter out = response.getWriter();
    }

}