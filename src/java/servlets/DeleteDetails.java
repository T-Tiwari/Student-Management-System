package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteDetails extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String sid = request.getParameter("sid");
          
          
    
            
            
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root","mca6");
                PreparedStatement ps = c.prepareStatement("delete from details where student_id=?");
                
                
                ps.setString(1, sid);
                
                ps.executeUpdate();
                response.sendRedirect("DeleteSuccess.jsp");
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }

    
    
}

