package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddDetails extends HttpServlet{
    
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
                PreparedStatement ps = c.prepareStatement("insert into details(student_id, first_name, last_name, email, contact) values(?,?,?,?,?)");
                ps.setString(1, sid);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setString(4, email);
                ps.setLong(5, phone);
                
                
                ps.executeUpdate();
                response.sendRedirect("success.jsp");
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }
    
}
