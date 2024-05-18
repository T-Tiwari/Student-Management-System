/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateDetails extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
            String sid = request.getParameter("sid");
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            String email = request.getParameter("email");
            long phone = Long.parseLong(request.getParameter("phone"));
            
          
    
            
            
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root","mca6");
                PreparedStatement ps = c.prepareStatement("update details set first_name=?, last_name=?, email=?, contact=? where student_id=?");
                
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, email);
                ps.setLong(4, phone);
                ps.setString(5, sid);
                
                ps.executeUpdate();
                response.sendRedirect("UpdateSuccess.jsp");
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }

    
    
}
