package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReadDetails extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String sid = request.getParameter("sid");
          
          
    
            
            
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root","mca6");
                PreparedStatement ps = c.prepareStatement("select*from details where student_id =?");
                ps.setString(1, sid);
                
        
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getLong(5) );
                }
            }
            catch(Exception e){
                out.println(e);
                out.println("Failed");
                
            }
            
    }

    
    
}


