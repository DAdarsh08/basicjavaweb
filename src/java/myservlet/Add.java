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

public class Add extends HttpServlet {
        @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
                
         int a=Integer.parseInt(request.getParameter("a"));
         int b=Integer.parseInt(request.getParameter("b"));
         int total=a-b;
         out.println("<h1>");
         out.println(total);
         out.println("</h1>");
         out.flush();
         out.close();
         


    } 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
         PrintWriter out = response.getWriter();
         int a=Integer.parseInt(request.getParameter("a"));
         int b=Integer.parseInt(request.getParameter("b"));
         int total=a-b;
         out.println(total);
         out.flush();
         out.close();

}
}